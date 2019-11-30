import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class DAO_Pergunta {
	private int num = 1;
	private String texto;
	private boolean obrigatorio;
	private String tipo;
	ArrayList<String> perguntas = new ArrayList();
	String danese;
	
	public void criarPergunta(int num, String texto, String tipo, boolean obrigatorio) {
		//this.num = num;
		this.texto = texto;
		this.tipo = tipo;
		this.obrigatorio = obrigatorio;
		
		try {
			FileReader fr = new FileReader("C:\\Users\\FATEC\\Documents\\perguntas.txt");
			BufferedReader lerArq = new BufferedReader(fr);
			
			while(lerArq.readLine()!=null){
				danese = lerArq.readLine();
				perguntas.add(danese);
			}
			
			fr.close();			
			
			FileWriter arquivo = new FileWriter("C:\\Users\\FATEC\\Documents\\perguntas.txt");
			PrintWriter gravarPerg = new PrintWriter(arquivo);
			
			gravarPerg.printf("+++++Perguntas Salvas+++++%n");
			System.out.println(perguntas.size());
			for(int i =0; i<perguntas.size();i++){
				gravarPerg.printf(perguntas.get(i));
			}
			gravarPerg.printf("Numero da pergunta: "+(num++)+"%n");
			gravarPerg.printf("Texto da pergunta: "+texto+"%n");
			gravarPerg.printf("Tipo da pergunta: "+tipo+"%n");
			gravarPerg.printf("É obrigatório? : "+obrigatorio+"%n");
			
			arquivo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
