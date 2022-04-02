package com.tns.cg.smms.client;

import com.tns.cg.smms.client.*;
import com.tns.cg.smms.service.*;
import com.tns.cg.smms.service.*;

public class Client
{
  public static void main(String[] args)
 {
	MallAdmin mallAdmin=new MallAdmin();
	IAdminService service = new IAdminServiceImpl();
	//Create
	mallAdmin.setId(200);
	mallAdmin.setName("Kavita");
	mallAdmin.setMall("abc");
	mallAdmin.setPassword(null);
	mallAdmin.setPhone(976123456);
	
	service.addMallAdmin(mallAdmin);
	
	//Retrieve
	mallAdmin=service.searchMallAdmin(200);
	System.out.println("ID is:"+mallAdmin.getId());
	System.out.println("Name is:"+mallAdmin.getName());
	System.out.println("phone is:"+mallAdmin.getPhone());
 
 //Update
	
/*	mallAdmin=service.searchMallAdmin(101);
    mallAdmin.setPhone(962712334);
	service.updateMallAdmin(mallAdmin);
	System.out.println("Update is successful");

	
	mallAdmin= service.searchMallAdmin(101);
	service.deleteMallAdmin(101);
	System.out.println("Update is successful");
*/
 }
}; 

	
	
	