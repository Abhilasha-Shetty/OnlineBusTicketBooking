package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.bean.CustomerBean;

import com.util.Dbutil;

public class CustomerDaoimpl implements CustomerDao{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	@Override
	public int addcustom(CustomerBean customerbean) {
		int i=-1;
		try
		{
			con=Dbutil.getMysqlConnection();
			ps=con.prepareStatement("insert into custome_tbl values(?,?,?,?,?,?,?,?)");
			ps.setString(1, customerbean.getCid());
			ps.setString(2,customerbean.getName());
			ps.setString(3,customerbean.getGender());
			ps.setString(4,customerbean.getEmail());
			
			ps.setString(5,customerbean.getDate());
			ps.setString(6,customerbean.getBusname());
			
			ps.setString(7,customerbean.getFromplace());
			ps.setString(8,customerbean.getToplace());
			
		    i=ps.executeUpdate();
			System.out.println("From Dao :"+i);
			
		}
		catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
		finally
		{
			//System.out.println("I :"+i);
			Dbutil.cleanUp(con, ps);
		}
		return i;
		
		
		
	}

	@Override
	public void deletecustom(String cid) {
		try
		{
			con=Dbutil.getMysqlConnection();
			ps=con.prepareStatement("delete from custome_tbl where cid=?");
			ps.setString(1, cid);
			ps.executeUpdate();
			
			
			
		}
		catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
		finally
		{
			
			Dbutil.cleanUp(con, ps);
		}
		
		
	}

	
	public List<CustomerBean> getallcustom() {
		
		 
			List<CustomerBean> customer=new ArrayList<CustomerBean>();
			try
			{
				con=Dbutil.getMysqlConnection();
				ps=con.prepareStatement("select * from custome_tbl");
				rs=ps.executeQuery();
				while(rs.next())
				{
					CustomerBean customerbean=new CustomerBean();
					customerbean.setCid(rs.getString(1));
					customerbean.setName(rs.getString(2));
					customerbean.setGender(rs.getString(3));
	                customerbean.setEmail(rs.getString(4));
	               
				    customerbean.setDate(rs.getString(5));
				    customerbean.setBusname(rs.getString(6));
				    customerbean.setFromplace(rs.getString(7));
				    customerbean.setToplace(rs.getString(8));
				    customer.add(customerbean);
				}
			}
			catch(SQLException sqle)
			{
				sqle.printStackTrace();
			}
			finally
			{
				
				Dbutil.cleanUp(con, ps, rs);
			}
			
			
			return customer;
		 }
	
	
	public CustomerBean getcustomBycid(String cid) {
		
		CustomerBean customerbean=new CustomerBean();
		try
		{
			
			con=Dbutil.getMysqlConnection();
			ps=con.prepareStatement("select * from custome_tbl where cid=?");
			ps.setString(1, cid);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				
				
				customerbean.setCid(rs.getString(1));
				customerbean.setName(rs.getString(2));
				customerbean.setGender(rs.getString(3));
                customerbean.setEmail(rs.getString(4));
               
			    customerbean.setDate(rs.getString(5));
			    customerbean.setBusname(rs.getString(6));
			   
			   customerbean.setFromplace(rs.getString(7));
			    customerbean.setToplace(rs.getString(8));
				
				
			}
			
			
		}
		catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
		finally
		{
			
			Dbutil.cleanUp(con, ps, rs);;
		}
		
		
		return customerbean;
		
		
	}

	
	public void updatecustom(CustomerBean customerbean) {
         int rowupdated;
		
		try {
		con=Dbutil.getMysqlConnection();
		ps=con.prepareStatement("update custome_tbl set name=?, gender=?,email=?,date=?,busname=?,fromplace=?,toplace=? where cid=?");

		
		ps.setString(1,customerbean.getName());
		ps.setString(2,customerbean.getGender());
		ps.setString(3,customerbean.getEmail());
		
		ps.setString(4,customerbean.getDate());
		ps.setString(5,customerbean.getBusname());
		
		ps.setString(6,customerbean.getFromplace());
		ps.setString(7,customerbean.getToplace());
		ps.setString(8, customerbean.getCid());
		
		rowupdated=ps.executeUpdate();
		}
		
		catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
		finally
		{
			
			Dbutil.cleanUp(con, ps, rs);;
		}
		
		
		
	}

		
	}


