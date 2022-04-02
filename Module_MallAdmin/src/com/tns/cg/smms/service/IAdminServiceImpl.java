package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.MallAdmin;
import com.tns.cg.smms.repository.IMallAdminRepository;
import com.tns.cg.smms.repository.IMallAdminRepositoryImpl;

public class IAdminServiceImpl implements IAdminService 
{
	//Step 1:Establishing connection Between Service and repository
	private IMallAdminRepository dao;
	

	public IAdminServiceImpl()
	{
	dao = new IMallAdminRepositoryImpl();
	}
// Step:2 Service calls to perform CRUD Operation
	@Override
	public MallAdmin addMallAdmin(MallAdmin mallAdmin) {
		dao.beginTransaction();
		dao.addMallAdmin(mallAdmin);
		dao.commitTransaction();
		return mallAdmin;
	}

	@Override
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
		dao.beginTransaction();
		dao.updateMallAdmin(mallAdmin);
		dao.commitTransaction();
		return mallAdmin;
	
	}

	@Override
	public MallAdmin deleteMallAdmin(int id) {
		dao.beginTransaction();
		dao.deleteMallAdmin(id);
		dao.commitTransaction();
		return null;
	}

	@Override
	public MallAdmin searchMallAdmin(int id) {
		MallAdmin mallAdmin = dao.searchMallAdmin(id);
		return mallAdmin;
	}

}
