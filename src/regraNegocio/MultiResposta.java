package regraNegocio;
import java.util.ArrayList;

public class MultiResposta extends Questao{
	private ArrayList<String> alternativas = new ArrayList<String>();
	private int quantidadeDeCheck;
	private ItemQuestao pontuacao = new ItemQuestao();

	public int getPontuacao() {
		return pontuacao.getPontuacao();
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao.setPontuacao(pontuacao);
	}
	
	public int getQuantidadeDeCheck() {
		return quantidadeDeCheck;
	}
	public void setQuantidadeDeCheck(int quantidadeDeCheck) {
		this.quantidadeDeCheck = quantidadeDeCheck;
	}
	
	public void setAlternativas(ArrayList<String> alternativas) {
		this.alternativas = alternativas;
	}
	
	public ArrayList<String> getAlternativas() {
		return alternativas;
	}
	
}
