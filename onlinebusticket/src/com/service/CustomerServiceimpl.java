package com.service;

import java.util.List;


import com.bean.CustomerBean;
import com.dao.CustomerDao;
import com.dao.CustomerDaoimpl;

public class CustomerServiceimpl implements CustomerService{

	@Override
	public int addcustom(CustomerBean customerbean) {
	
		CustomerDao cdao=new CustomerDaoimpl();
		return cdao.addcustom(customerbean);	}

	@Override
	public void deletecustom(String cid) {
		CustomerDao cdao=new CustomerDaoimpl();
		cdao.deletecustom(cid);
		
	}

	@Override
	public List<CustomerBean> getallcustom() {
		CustomerDao cdao=new CustomerDaoimpl();
		return cdao.getallcustom();
		
	}

	@Override
	public CustomerBean getcustomBycid(String cid) {
		CustomerDao cdao=new CustomerDaoimpl();
		return cdao.getcustomBycid(cid) ;
	}

	@Override
	public void updatecustom(CustomerBean customerbean) {
		CustomerDao cdao=new CustomerDaoimpl();
		cdao.updatecustom(customerbean);
				
	}

}
