package testes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import regraNegocio.DAO_Pergunta;
import regraNegocio.Dissertativa;
import regraNegocio.EscalaLikert;
import regraNegocio.MultiResposta;
import regraNegocio.MultiplaEscolha;
import regraNegocio.Questao;

public class GravarPerguntas {
	private Dissertativa perguntaDissertativa;
	private EscalaLikert perguntaEscalaLikert;
	private MultiplaEscolha perguntaMultiplaEscolha;
	private MultiResposta perguntaMultiResposta;
	private DAO_Pergunta perguntaDAO = new DAO_Pergunta();
	private ArrayList<Questao> questionario = new ArrayList<Questao>();
	private int ultimaQuestao = 0;
	
	public void setPergunta(Object pergunta) {
		if(pergunta.getClass() == Dissertativa.class) {
			perguntaDissertativa = (Dissertativa) pergunta;
			criarPergunta(perguntaDissertativa);
		}else if(pergunta.getClass() == EscalaLikert.class) {
			perguntaEscalaLikert = (EscalaLikert) pergunta;
			criarPergunta(perguntaEscalaLikert);
		}else if(pergunta.getClass() == MultiplaEscolha.class) {
			perguntaMultiplaEscolha = (MultiplaEscolha) pergunta;
			criarPergunta(perguntaMultiplaEscolha);
		}else if(pergunta.getClass() == MultiResposta.class) {
			perguntaMultiResposta = (MultiResposta) pergunta;
			criarPergunta(perguntaMultiResposta);
		}
	}

	void criarPergunta(Object pergunta) {
		int quantidadeQuestoes=0;
		boolean deu;
		
		do{
			try{
				quantidadeQuestoes = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de Questões: "));
				deu=true;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Utilize apenas números");
				deu =false;
			}
		}while(deu!=true);
		if(pergunta.getClass() == Dissertativa.class) {
			int quantidadeCaracter = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade de caracteres"));
			for(int i = 0 ; i<quantidadeQuestoes;i++){
				perguntaDissertativa = new Dissertativa();
				perguntaDissertativa.setNumQuestao(i+1);
				perguntaDissertativa.setObrigatorio(true);
				perguntaDissertativa.setTextoQuestao(JOptionPane.showInputDialog(null, "Texto da Questão: "));
				perguntaDissertativa.setPontuacao(1);
				perguntaDissertativa.setQuantidadeDeCaracteres(quantidadeCaracter);
				perguntaDAO.criarPergunta(perguntaDissertativa);
				ultimaQuestao++;
			}	
		}else if(pergunta.getClass() == EscalaLikert.class) {
			for(int i = 0 ; i<=quantidadeQuestoes;i++){
				perguntaEscalaLikert = new EscalaLikert();
				ArrayList<String> textoEscala = new ArrayList<String>();
				perguntaEscalaLikert.setNumQuestao(i+1);
				perguntaEscalaLikert.setObrigatorio(true);
				perguntaEscalaLikert.setTextoQuestao(JOptionPane.showInputDialog(null, "Texto da Questão: "));
				perguntaEscalaLikert.setPontuacao(1);
				perguntaEscalaLikert.setTamanhoEscala(Integer.parseInt(JOptionPane.showInputDialog(null,"Tamanho da escala:")));
				for(int j = 0; j<perguntaEscalaLikert.getTamanhoEscala(); j++) {
					textoEscala.add(JOptionPane.showInputDialog(null,"Texto da escala"+(j+1)+":"));
				}
				perguntaEscalaLikert.setTextoEscala(textoEscala);
				perguntaDAO.criarPergunta(perguntaEscalaLikert);
				ultimaQuestao++;
			}			
		}else if(pergunta.getClass() == MultiplaEscolha.class) {
			int quantidadeAlternativas = (Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade de alternativas:")));
			for(int i = 1 ; i<=quantidadeQuestoes;i++){
				perguntaMultiplaEscolha = new MultiplaEscolha();
				ArrayList<String> textoAlternativa = new ArrayList<String>();
				perguntaMultiplaEscolha.setNumQuestao(quantidadeQuestoes);
				perguntaMultiplaEscolha.setObrigatorio(true);
				perguntaMultiplaEscolha.setTextoQuestao(JOptionPane.showInputDialog(null, "Texto da Questão: "));
				perguntaMultiplaEscolha.setPontuacao(1);
				for(int j = 0; j<quantidadeAlternativas; j++) {
					textoAlternativa.add(JOptionPane.showInputDialog(null,"Texto da alternativa"+(j+1)+":"));
				}
				perguntaMultiplaEscolha.setAlternativas(textoAlternativa);
				perguntaDAO.criarPergunta(perguntaMultiplaEscolha);
				ultimaQuestao++;
			}				
		}else if(pergunta.getClass() == MultiResposta.class) {
			for(int i = 1 ; i<=quantidadeQuestoes;i++){
				perguntaMultiResposta = new MultiResposta();
				ArrayList<String>alternativasMultiResp = new ArrayList<String>();
				perguntaMultiResposta.setNumQuestao(i);
				perguntaMultiResposta.setObrigatorio(true);
				perguntaMultiResposta.setTextoQuestao(JOptionPane.showInputDialog(null, "Texto da Questão: "));
				perguntaMultiResposta.setPontuacao(1);
				perguntaMultiResposta.setQuantidadeDeCheck(Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade de checks: ")));
				for(int j =0 ; j<perguntaMultiResposta.getQuantidadeDeCheck(); j++) {
					alternativasMultiResp.add(JOptionPane.showInputDialog(null,"Texto da alternativa"+(j+1)+":"));
				}
				perguntaMultiResposta.setAlternativas(alternativasMultiResp);
				perguntaDAO.criarPergunta(perguntaMultiResposta);
				ultimaQuestao++;
			}			
		}
		questionario = perguntaDAO.listarQuestoes();
	}
	public void mostrarTodasQuestoes() {
		questionario = perguntaDAO.listarQuestoes();
		for(Questao perguntas : questionario) {
			System.out.println("Tipo de questão: "+perguntas.getClass().getName().replace("regraNegocio.", ""));
			System.out.println("Numero da questão: "+perguntas.getNumQuestao());
			System.out.println("Texto da questão: "+perguntas.getTextoQuestao());
			System.out.println("É obrigatório?: "+perguntas.getObrigatorio());
			
			if(perguntas.getClass() == Dissertativa.class) {
				Dissertativa dissertativa = (Dissertativa) perguntas;
				System.out.println("Quantidade de caracteres: "+dissertativa.getQuantidadeDeCaracteres());
				System.out.println("Pontuação: "+dissertativa.getPontuacao());
			}else if(perguntas.getClass() == MultiResposta.class) {
				MultiResposta multiResposta = (MultiResposta) perguntas;
				
				System.out.println("Quantidade de checks: " + multiResposta.getQuantidadeDeCheck());
				System.out.println("Pontuação: "+multiResposta.getPontuacao());
				
				for(int i=0; i<multiResposta.getAlternativas().size(); i++) {
					System.out.println("Alternativa "+(i+1)+multiResposta.getAlternativas().get(i));
				}
			}else if(perguntas.getClass() == MultiplaEscolha.class) {
				MultiplaEscolha multiplaEscolha = (MultiplaEscolha) perguntas;
				
				System.out.println("Pontuação:" +multiplaEscolha.getPontuacao());
				
				for(int i=0; i<multiplaEscolha.getAlternativas().size(); i++) {
					System.out.println(multiplaEscolha.getAlternativas().get(i));
				}
			}else if(perguntas.getClass() == EscalaLikert.class) {
				EscalaLikert escalaLikert = (EscalaLikert) perguntas;
				
				System.out.println("Tamanho da escala: "+escalaLikert.getTamanhoEscala());
				
				for(int i=0; i<escalaLikert.getTextoEscala().size(); i++) {
					System.out.println(escalaLikert.getTextoEscala().get(i));
				}				
			}
			
			System.out.println("---------------------------------");
		}
	}	
	
	public ArrayList<Questao> getQuestionario() {
		return questionario;
	}

	public void setQuestionario(ArrayList<Questao> questionario) {
		this.questionario = questionario;
	}	
}
