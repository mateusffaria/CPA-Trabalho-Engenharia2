package regraNegocio;
import java.util.ArrayList;

public class MultiplaEscolha extends Questao{
	private ArrayList<String> alternativas = new ArrayList<String>();
	private ItemQuestao pontuacao = new ItemQuestao();

	public ArrayList<String> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(ArrayList<String> alternativas) {
		this.alternativas = alternativas;
	}

	public int getPontuacao() {
		return pontuacao.getPontuacao();
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao.setPontuacao(pontuacao);
	}
}
