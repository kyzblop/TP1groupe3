package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.inti.model.Passager;
import com.inti.model.Reservation;
import com.inti.util.HibernateUtil;

@WebServlet("/Reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Session s=HibernateUtil.getSessionFactory().openSession();
    
    public ReservationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/ReservationVol.jsp").forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			s.beginTransaction();
			Passager p1=new Passager();
			Reservation r1=new Reservation(LocalDate.parse(request.getParameter("date")), Integer.parseInt(request.getParameter("numero")));
			
			if (request.getParameter("options-outlined").equals("confirmer")) {
//				r1.setPassager(Passager.class ,request.getParameter("idP"));
				
				//j'arrive pas à inserer l'idP dans la reservation
				s.save(r1);
			}else {
				s.delete(r1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
