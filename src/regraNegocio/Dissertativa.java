package regraNegocio;

public class Dissertativa extends Questao{
	private int quantidadeDeCaracteres;
	private ItemQuestao pontuacao = new ItemQuestao();

	public int getPontuacao() {
		return pontuacao.getPontuacao();
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao.setPontuacao(pontuacao);
	}
	
	public int getQuantidadeDeCaracteres() {
		return quantidadeDeCaracteres;
	}
	
	public void setQuantidadeDeCaracteres(int quantidadeDeCaracteres) {
		this.quantidadeDeCaracteres = quantidadeDeCaracteres;
	}
}
