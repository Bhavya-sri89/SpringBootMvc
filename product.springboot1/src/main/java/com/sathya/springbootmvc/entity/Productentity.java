package com.sathya.springbootmvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


 @Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="product")

@Entity
public class Productentity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private String brand;
	private String MadeIn;
	private double price;
	private int quantity;
	private int discountrate;
	private double taxrate;
	private double discountprice;
	private double finalprice;
	private double stockvalue;
	private double offerprice;


		
		
	}

