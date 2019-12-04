package regraNegocio;
import java.util.ArrayList;

public class EscalaLikert extends Questao{
	private int tamanhoEscala;
	private ArrayList<String> textoEscala = new ArrayList<String>();
	private ItemQuestao pontuacao = new ItemQuestao();

	public int getPontuacao() {
		return pontuacao.getPontuacao();
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao.setPontuacao(pontuacao);
	}
	
	public int getTamanhoEscala() {
		return tamanhoEscala;
	}

	public void setTamanhoEscala(int tamanhoEscala) {
		this.tamanhoEscala = tamanhoEscala;
	}

	public ArrayList<String> getTextoEscala() {
		return textoEscala;
	}

	public void setTextoEscala(ArrayList<String> textoEscala) {
		this.textoEscala = textoEscala;
	}
	
}
