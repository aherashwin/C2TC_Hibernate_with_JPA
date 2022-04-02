package com.tns.cg.smms.repository;

import com.entity.ShopOwner;

public interface IShopOwnerRepository {

	public ShopOwner addShopOwner(ShopOwner shopOwner);

	public ShopOwner updateShopOwner(ShopOwner shopOwner);

	public ShopOwner searchShopOwner(int id);

	public ShopOwner deleteShopOwner(int id);

	public void beginTransaction();

	public void commitTransaction();

}
