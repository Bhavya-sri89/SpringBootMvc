package com.sathya.springbootmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class ProductModel
{
	private String name;
	  private String brand;
	  private String MadeIn;
	  private double price;
	  private int quantity;
	  private int discountrate;
	  private double taxrate;
}
	
	

