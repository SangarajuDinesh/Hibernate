package com.kn.OneToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer
{
	@Id
	int id;
	String name;
	int age;
	@OneToMany
	List<Products> product;
	public Customer(int id, String name, int age, List<Products> product) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.product = product;
	}
	public Customer() {
		super();
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Products> getProduct() {
		return product;
	}
	public void setProduct(List<Products> product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
