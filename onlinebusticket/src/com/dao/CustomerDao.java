package com.dao;

import java.util.List;

import com.bean.CustomerBean;

public interface CustomerDao {
	public int addcustom(CustomerBean customerbean);
	public void deletecustom(String cid);
	public List<CustomerBean> getallcustom();
	public CustomerBean getcustomBycid(String cid);
	public void updatecustom(CustomerBean customerbean);


}
