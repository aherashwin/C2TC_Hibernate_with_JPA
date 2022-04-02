
package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.Mall;


public interface IMallService {
	

	public Mall addMall(Mall mall);
	public Mall updateMall(Mall mall);
	public Mall deleteMall(int id);
	public Mall searchMall(int id);
}
