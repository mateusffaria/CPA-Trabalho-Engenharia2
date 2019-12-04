package regraNegocio;

public abstract class Questao {
	private int numQuestao;
	private String textoQuestao;
	private boolean obrigatorio;


	public void setNumQuestao(int numQuestao) {
		this.numQuestao = numQuestao;
	}
	public void setTextoQuestao(String textoQuestao) {
		this.textoQuestao = textoQuestao;
	}
	public void setObrigatorio(boolean obrigatorio) {
		this.obrigatorio = obrigatorio;
	}
	
	
	public String getTextoQuestao() {
		return textoQuestao;
	}
	public boolean getObrigatorio() {
		return obrigatorio;
	}
	public int getNumQuestao() {
		return numQuestao;
	}	
}
