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
}