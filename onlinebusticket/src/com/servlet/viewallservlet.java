package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CustomerBean;
import com.service.CustomerService;
import com.service.CustomerServiceimpl;


@WebServlet("/viewallservlet")
public class viewallservlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerService customerservice=new CustomerServiceimpl();
		List<CustomerBean> customer=customerservice.getallcustom();
				CustomerBean customerbean=null;
		for(int i=0;i<customer.size();i++)
		{
			customerbean=customer.get(i);
			System.out.println(customerbean.getCid()+" "+customerbean.getName()+" "+customerbean.getGender()+" "+customerbean.getEmail()+" "+customerbean.getDate()+" "+customerbean.getBusname()+" "+customerbean.getFromplace()+" "+customerbean.getToplace());
			
		}
	}

}
