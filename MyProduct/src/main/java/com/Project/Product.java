package com.Project;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enterproduct")
public class Product {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "cost")
	int cost;
	
	@Column(name = "quantity")
	int quantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ",name=" + name + ",cost=" + cost +",quantity=" + quantity
				+ "]";
	}

	public Product(String name, int cost,int qunatity) {
	    //this.id=id;
		this.name = name;
		this.cost = cost;
		this.quantity = qunatity;
	}
	
}