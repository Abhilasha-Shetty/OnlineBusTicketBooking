package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CustomerBean;
import com.service.CustomerService;
import com.service.CustomerServiceimpl;

@WebServlet("/AlldatacustomerServlet")
public class AlldatacustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page="viewcustomer.jsp";
		CustomerService service=new CustomerServiceimpl();
		List<CustomerBean> customerlist=service.getallcustom();
		request.setAttribute("list",customerlist);
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);

	}


}