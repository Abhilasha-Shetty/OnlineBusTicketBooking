package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CustomerBean;
import com.service.CustomerService;
import com.service.CustomerServiceimpl;


@WebServlet("/EditcustomerServlet")
public class EditcustomerServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerBean customerbean=new CustomerBean();
		CustomerService service=new CustomerServiceimpl();
		String cid=request.getParameter("cid");
		customerbean=service.getcustomBycid(cid);
		request.setAttribute("customerbean",customerbean);
		String page="edit.jsp";
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

	}


