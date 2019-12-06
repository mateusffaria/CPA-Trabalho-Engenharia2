package testes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import regraNegocio.Dissertativa;
import regraNegocio.EscalaLikert;
import regraNegocio.Formulario;
import regraNegocio.MultiResposta;
import regraNegocio.MultiplaEscolha;
import regraNegocio.Questao;

public class Teste {

	public static void main(String[] args) {
		GravarPerguntas gravarQuestao = new GravarPerguntas();
        String selecao;
        selecao = JOptionPane.showInputDialog("Seleciona a opção das perguntas\n1) Dissertativa \n2) Escala Likert\n"
                + "3) Multipla Escolha\n4) Multi Respostas\n14)Sair");
        
        int escolha = Integer.parseInt(selecao);
        
		switch (escolha) {
		case 1:
			Dissertativa questao1 = new Dissertativa();
			gravarQuestao.setPergunta(questao1);
		break;
		case 2:
			EscalaLikert questaoLikert = new EscalaLikert();
			gravarQuestao.setPergunta(questaoLikert);
		break;
		case 3:
			MultiplaEscolha questaoMultiplaEscolha = new MultiplaEscolha();
			gravarQuestao.setPergunta(questaoMultiplaEscolha);
		break;
		case 4:
			MultiResposta questaoMultiResposta = new MultiResposta();
			gravarQuestao.setPergunta(questaoMultiResposta);
		break;
		default:
			
		break;
		}
		Formulario form = new Formulario();
		
		ArrayList<Questao> questionario = gravarQuestao.getQuestionario();
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
		
		gravarQuestao.mostrarTodasQuestoes();
	}

}
