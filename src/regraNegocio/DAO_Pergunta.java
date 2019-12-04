package regraNegocio;
import java.util.ArrayList;


public class DAO_Pergunta {
	
	private ArrayList<Questao> questionario = new ArrayList<Questao>();
	
	public void criarPergunta(Questao pergunta) {
		questionario.add(pergunta);		
	}
	
	public Questao editarQuestao(Questao pergunta) {
		for(Questao perguntaEncontrada : questionario) {
			if(perguntaEncontrada == pergunta) {
				return perguntaEncontrada;
			}		
		}
		return null;
	}
	
	public void excluirQuestao(Questao pergunta) {
		questionario.remove(pergunta);
	}
	
	public ArrayList<Questao> listarQuestoes() {
		return questionario;
	}
	
	public void mostrarTodasQuestoes() {
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
					System.out.println(multiResposta.getAlternativas().get(i));
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
}
