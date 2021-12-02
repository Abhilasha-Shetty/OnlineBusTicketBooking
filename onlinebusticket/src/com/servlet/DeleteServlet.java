package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.CustomerService;
import com.service.CustomerServiceimpl;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
		
			   
			/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String cid=request.getParameter("cid");
				CustomerService service=new CustomerServiceimpl();
				service.deletecustom(cid);
				response.sendRedirect("AlldatacustomerServlet");
			}
	}


