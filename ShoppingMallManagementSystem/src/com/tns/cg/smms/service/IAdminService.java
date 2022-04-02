
package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.MallAdmin;

public interface IAdminService {
	/*public boolean approveNewShop(MallAdmin mallAdmin);
	public mallAdmin updateUser(MallAdmin mallAdmin);
	public mallAdmin login(MallAdmin mallAdmin);
	public boolean logOut();
}*/

	public MallAdmin addMallAdmin(MallAdmin mallAdmin);
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin);
	public MallAdmin deleteMallAdmin(int id);
	public MallAdmin searchMallAdmin(int id);
}
