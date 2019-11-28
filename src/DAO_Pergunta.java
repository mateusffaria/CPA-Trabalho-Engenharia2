
public class DAO_Pergunta {
	private int num;
	private String texto;
	private boolean obrigatorio;
	private int tipo;
	
	public void criarPergunta(int num, String texto, int tipo, boolean obrigatorio) {
		this.num = num;
		this.texto = texto;
		this.tipo = tipo;
		this.obrigatorio = obrigatorio;
		
	}
	
}
