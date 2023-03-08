package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.inti.model.Aeroport;
import com.inti.model.Client;
import com.inti.model.CompagnieAerienne;
import com.inti.model.Vol;
import com.inti.util.HibernateUtil;

/**
 * Servlet implementation class AjoutVolServlet
 */
@WebServlet("/AjoutVolServlet")
public class AjoutVolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Session s;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutVolServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		s = HibernateUtil.getSessionFactory().openSession();
		this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutVol.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			s.beginTransaction();
			
			int idAeroD = Integer.valueOf(request.getParameter("aeroportDepart"));
			int idAeroA = Integer.valueOf(request.getParameter("aeroportArrivee"));
			LocalDate dateD = LocalDate.parse(request.getParameter("dateDepart"));
			LocalDate dateA = LocalDate.parse(request.getParameter("dateArrivee"));
			int heureD = Integer.valueOf(request.getParameter("heureDepart"));
			int heureA = Integer.valueOf(request.getParameter("heureArrivee"));
			
			Aeroport aD = new Aeroport(idAeroD, "Aero1");
			Aeroport aA = new Aeroport(idAeroD, "Aero1");
			CompagnieAerienne comp = new CompagnieAerienne("Compagnie");
			
			Vol v1 = new Vol(dateD, heureD, heureA, dateA, aD, aA, comp);
			
			s.save(v1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// nulos
	}

}
