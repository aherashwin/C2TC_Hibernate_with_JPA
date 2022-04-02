package com.tns.cg.smms.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MallAdmin")
public class Mall {
@Id	
private int id;
private String mallAdmin;
private String mallName;
private String location;
//private List<Shop> shops;
/*private enum categories{
	REGIONAL,SUPERREGIONAL
};*/
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMallAdmin() {
	return mallAdmin;
}
public void setMallAdmin(String mallAdmin) {
	this.mallAdmin = mallAdmin;
}
public String getMallName() {
	return mallName;
}
public void setMallName(String mallName) {
	this.mallName = mallName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
