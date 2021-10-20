package br.com.jogo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jogo.controle.Controle;
import br.com.jogo.entidade.Jogo;

/**
 * Servlet implementation class Controle
 */
@WebServlet("/Jogo")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String d1 = null,d2 = null,d3 = null, d4 = null, d5 = null, d6 = null, d7 = null, d8 = null, d9 = null;

    /**
     * Default constructor. 
     */
    public Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		 if(Controle.velha()) {
			request.setAttribute("vencedor", "Deu velha");
		}	
		 if(request.getParameter("0")!=null) {
			 d1 = "disabled";
			if(Controle.vencedor(new Jogo(request.getParameter("0").charAt(0),0,0))) {
				request.setAttribute("vencedor", "Vencedor "+request.getParameter("0"));
				d2 = "disabled";d3 = "disabled"; d4 = "disabled"; d5 = "disabled"; d6 = "disabled"; d7 = "disabled"; d8 = "disabled"; d9 = "disabled";
			}
			
		} if(request.getParameter("1")!=null) {
			d2 = "disabled";
			if(Controle.vencedor(new Jogo(request.getParameter("1").charAt(0),0,1))){
				request.setAttribute("vencedor", "Vencedor "+request.getParameter("1"));
				d1 = "disabled"; d3 = "disabled"; d4 = "disabled"; d5 = "disabled"; d6 = "disabled"; d7 = "disabled"; d8 = "disabled"; d9 = "disabled";
			}
			
		} if(request.getParameter("2")!=null) {
			d3 = "disabled";
			if(Controle.vencedor(new Jogo(request.getParameter("2").charAt(0),0,2))){
				request.setAttribute("vencedor", "Vencedor "+request.getParameter("2"));
				d1 = "disabled";d2 = "disabled"; d4 = "disabled"; d5 = "disabled"; d6 = "disabled"; d7 = "disabled"; d8 = "disabled"; d9 = "disabled";
			}
			
		}if(request.getParameter("3") != null) {
			d4 = "disabled";
			if(Controle.vencedor(new Jogo(request.getParameter("3").charAt(0),1,0))){
				request.setAttribute("vencedor", "Vencedor "+request.getParameter("3"));
				d1 = "disabled";d2 = "disabled";d3 = "disabled"; d5 = "disabled"; d6 = "disabled"; d7 = "disabled"; d8 = "disabled"; d9 = "disabled";
			}
			
		}if(request.getParameter("4") != null) {
			d5 = "disabled";
			if(Controle.vencedor(new Jogo(request.getParameter("4").charAt(0),1,1))){
				request.setAttribute("vencedor", "Vencedor "+request.getParameter("4"));
				d1 = "disabled";d2 = "disabled";d3 = "disabled"; d4 = "disabled"; d6 = "disabled"; d7 = "disabled"; d8 = "disabled"; d9 = "disabled";
			}
			
		}if(request.getParameter("5") != null) {
			d6 = "disabled";
			if(Controle.vencedor(new Jogo(request.getParameter("5").charAt(0),1,2))){
				request.setAttribute("vencedor", "Vencedor "+request.getParameter("5"));
				d1 = "disabled";d2 = "disabled";d3 = "disabled"; d4 = "disabled"; d5 = "disabled";  d7 = "disabled"; d8 = "disabled"; d9 = "disabled";
			}
			
		}if(request.getParameter("6") != null) {
			d7 = "disabled";
			if(Controle.vencedor(new Jogo(request.getParameter("6").charAt(0),2,0))){
				request.setAttribute("vencedor", "Vencedor "+request.getParameter("6"));
				d1 = "disabled";d2 = "disabled";d3 = "disabled"; d4 = "disabled"; d5 = "disabled"; d6 = "disabled"; d8 = "disabled"; d9 = "disabled";
			}
			
		}if(request.getParameter("7") != null) {
			d8 = "disabled";
			if(Controle.vencedor(new Jogo(request.getParameter("7").charAt(0),2,1))){
				request.setAttribute("vencedor", "Vencedor "+request.getParameter("7"));
				d1 = "disabled";d2 = "disabled";d3 = "disabled"; d4 = "disabled"; d5 = "disabled"; d6 = "disabled"; d7 = "disabled"; d9 = "disabled";
			}
			
		}if(request.getParameter("8") != null) {
			d9 = "disabled";
			if(Controle.vencedor(new Jogo(request.getParameter("8").charAt(0),2,2))){
				request.setAttribute("vencedor","Vencedor "+request.getParameter("8"));
				d1 = "disabled";d2 = "disabled";d3 = "disabled"; d4 = "disabled"; d5 = "disabled"; d6 = "disabled"; d7 = "disabled"; d8 = "disabled";
			}
			
		}
		
		request.setAttribute("00", Controle.tabuleiro[0][0]);
		request.setAttribute("01", Controle.tabuleiro[0][1]);
		request.setAttribute("02", Controle.tabuleiro[0][2]);
		
		request.setAttribute("10", Controle.tabuleiro[1][0]);
		request.setAttribute("11", Controle.tabuleiro[1][1]);
		request.setAttribute("12", Controle.tabuleiro[1][2]);
		
		request.setAttribute("20", Controle.tabuleiro[2][0]);
		request.setAttribute("21", Controle.tabuleiro[2][1]);
		request.setAttribute("22", Controle.tabuleiro[2][2]);
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

}
