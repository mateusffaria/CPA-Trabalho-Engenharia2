package testes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import regraNegocio.DAO_Pergunta;
import regraNegocio.Dissertativa;
import regraNegocio.Formulario;
import regraNegocio.MultiResposta;
import regraNegocio.Questao;

public class Teste {

	public static void main(String[] args) {
		Dissertativa questao1 = new Dissertativa();
		DAO_Pergunta pergunta = new DAO_Pergunta();
		MultiResposta questao2 = new MultiResposta();
		Formulario form = new Formulario();
		
		questao1.setNumQuestao(1);
		questao1.setObrigatorio(true);
		questao1.setTextoQuestao("Digite seu nome completo: ");
		questao1.setQuantidadeDeCaracteres(150);
		questao1.setPontuacao(1);
				
		pergunta.criarPergunta(questao1);

		questao2.setNumQuestao(2);
		questao2.setObrigatorio(true);
		questao2.setTextoQuestao("Qual a cor do pelos do cavalo branco de napoleão?");
		questao2.setQuantidadeDeCheck(3);
		questao2.setAlternativas("Alternativa A: Azul");
		questao2.setAlternativas("Alternativa B: Branco");
		questao2.setAlternativas("Alternativa C: opção B");
		questao2.setPontuacao(3);
		
		pergunta.criarPergunta(questao2);
		
		pergunta.mostrarTodasQuestoes();
		
		questao1.setNumQuestao(5);
		questao1.setObrigatorio(true);
		questao1.setTextoQuestao("Digite seu sobrenome: ");
		questao1.setQuantidadeDeCaracteres(30);

		pergunta.editarQuestao(questao1);
		
		questao2.setNumQuestao(2);
		questao2.setObrigatorio(true);
		questao2.setTextoQuestao("Qual a cor do pelos do cavalo branco de napoleão?");
		questao2.setQuantidadeDeCheck(3);
		questao2.getAlternativas().clear();
		questao2.setAlternativas("Alternativa A: marrom");
		questao2.setAlternativas("Alternativa B: laranja");
		questao2.setAlternativas("Alternativa C: opcao antes de alterar");
		questao2.setPontuacao(3);
		
		pergunta.editarQuestao(questao2);
		
		pergunta.mostrarTodasQuestoes();
		
		
		ArrayList<Questao> questionario = pergunta.listarQuestoes();
		SimpleDateFormat dataInicio = new SimpleDateFormat();
		Date inicio = new Date();
		dataInicio.format(inicio);

		
		SimpleDateFormat dataFim = new SimpleDateFormat();
		Date fim = new Date();
		dataFim.format(fim);
		
		form.setCodFormulario(1235);
		form.setDataFim(dataInicio);
		form.setDataFim(dataFim);
		form.setNomeFormulario("Formulário Geral");
		form.setQuestionario(questionario);
		
		System.out.println(form.getQuestionario().get(0).getTextoQuestao());
		System.out.println(form.getQuestionario().get(1).getTextoQuestao());
	}

}
