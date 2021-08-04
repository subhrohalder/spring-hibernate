package com.techgenizer.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	
@Id
private int id;
private String name;
private String descp;
private int price;




public Product() {
	super();
}
public Product(int id, String name, String desc, int price) {
	super();
	this.id = id;
	this.name = name;
	this.descp = desc;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesc() {
	return descp;
}
public void setDesc(String desc) {
	this.descp = desc;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", desc=" + descp + ", price=" + price + "]";
}



}
