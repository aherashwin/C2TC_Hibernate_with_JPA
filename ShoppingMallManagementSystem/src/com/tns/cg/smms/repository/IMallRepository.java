
package com.tns.cg.smms.repository;

import com.tns.cg.smms.entity.Mall;

public interface IMallRepository {
public Mall addMall(Mall mall);
public Mall updateMall(Mall mall);
public Mall searchMall(int id);
void beginTransaction();
void commitTransaction();
public void deleteMall(int id);
}

