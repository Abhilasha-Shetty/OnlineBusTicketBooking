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


@WebServlet("/customerBookticketservlet")
public class customerBookticketservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cid=request.getParameter("cid");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		
		
		String date=request.getParameter("date");
		String busname=request.getParameter("busname");
		
		String fromplace=request.getParameter("fromplace");
		String toplace=request.getParameter("toplace");
		// Book ticket
		int result=-1;
		CustomerBean customerbean = new CustomerBean(cid,name,gender,email,date,busname,fromplace,toplace);
		CustomerService customerservice =new CustomerServiceimpl();
		if(cid!=null)
		{
			result=customerservice.addcustom(customerbean);
		}
		
		String page="Customerbookticket.jsp";
		
		String msg="Ticket  Booked Successfully For Any Queries Conact Admin";
		
		request.setAttribute("msg", msg);
		System.out.println(result);
		System.out.println(msg);
		//Get all Students
		List<CustomerBean> customerlist = customerservice.getallcustom();
		request.setAttribute("list", customerlist );
		
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
		
	}
	}


