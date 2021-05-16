package entities.concrete;

import entities.abstracts.Entity;

public class Campaign implements Entity{

	private int id;
	private String name;
	private double discountPercentage;
	
	public Campaign() {
		
	}
	
	public Campaign(int id,String name,double discountPercentage) {
		
		this.discountPercentage=discountPercentage;
		this.id=id;
		this.name=name;
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
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
}
