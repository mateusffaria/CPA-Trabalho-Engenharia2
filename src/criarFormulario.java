

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class criarFormulario
 */
@WebServlet("/criarFormulario")
public class criarFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public criarFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String questao = request.getParameter("questao");
		String tipoQuestao = request.getParameter("tipoQuestao");
		boolean obrigatorio = Boolean.parseBoolean(request.getParameter("obrigatorio"));
		
		DAO_Pergunta DP = new DAO_Pergunta();
		
		DP.criarPergunta(1, questao, tipoQuestao, obrigatorio);
		
		if(questao == null){
			response.sendRedirect("erro.jsp");
		}else{
			
		}
		
	}

}
