import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;


public class DAO_Pergunta {
	private int num = 1;
	private String texto;
	private boolean obrigatorio;
	private int tipo;
	ArrayList<String> perguntas = new ArrayList();
	String perguntaGravada;
	
	public void criarPergunta(int num, String texto, int tipo, boolean obrigatorio) {
		this.num = num;
		this.texto = texto;
		this.tipo = tipo;
		this.obrigatorio = obrigatorio;
		
		try {
			carregarArq();
			
			//FileWriter arquivo = new FileWriter("C:\\Users\\FATEC\\Documents\\perguntas.txt");
			FileWriter arquivo = new FileWriter("/media/mateus/9E82F3AB82F38655/Mateus/Eng de software 2/CPA/perguntas.txt");
			PrintWriter gravarPerg = new PrintWriter(arquivo);
			
			for(int i =0; i<perguntas.size()-1;i++){
				gravarPerg.printf(perguntas.get(i)+"%n");
				System.out.println(perguntas.get(i));
			}
			
			gravarArqUsuario(gravarPerg);
			
			gravarPerg.printf("%n");
			
			gravarPerg.close();
			arquivo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void carregarArq() throws IOException {
		//FileInputStream fr = new FileInputStream("C:\\Users\\FATEC\\Documents\\perguntas.txt");
		FileInputStream fr = new FileInputStream("/media/mateus/9E82F3AB82F38655/Mateus/Eng de software 2/CPA/perguntas.txt");
		InputStreamReader leitor = new InputStreamReader(fr);
		BufferedReader LerArq = new BufferedReader(leitor);
		
		perguntaGravada = LerArq.readLine(); 
		
		while(perguntaGravada !=null){
			perguntas.add(perguntaGravada);
			perguntaGravada = LerArq.readLine();
		}
		
		fr.close();					
	}

	public void gravarArqUsuario(PrintWriter gravarPerg) {
		gravarPerg.printf("Numero da pergunta: "+(num++)+"%n");
		gravarPerg.printf("Texto da pergunta: "+texto+"%n");
		gravarPerg.printf("Tipo da pergunta: "+tipo+"%n");
		gravarPerg.printf("É obrigatório? : "+obrigatorio+"%n");
	}
}
