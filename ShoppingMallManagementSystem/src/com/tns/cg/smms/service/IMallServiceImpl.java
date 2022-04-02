package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.Mall;
import com.tns.cg.smms.repository.IMallRepository;
import com.tns.cg.smms.repository.IMallRepositoryImpl;

public class IMallServiceImpl implements IMallService 
{
	//Step 1:Establishing connection Between Service and repository
	private IMallRepository dao;
	

	public IMallServiceImpl()
	{
	dao = new IMallRepositoryImpl();
	}


	@Override
	public Mall addMall(Mall mall) {
		dao.beginTransaction();
		dao.addMall(mall);
		dao.commitTransaction();
		return mall;
		
	}


	@Override
	public Mall updateMall(Mall mall) {
		dao.beginTransaction();
		dao.updateMall(mall);
		dao.commitTransaction();
		return mall;
	
	
	}


	@Override
	public Mall deleteMall(int id) {
		dao.beginTransaction();
		dao.deleteMall(id);
		dao.commitTransaction();
		return null;
		
	}


	@Override
	public Mall searchMall(int id)
	{
		Mall mall = dao.searchMall(id);
		return mall;	
		
	}
}