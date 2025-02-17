package com.sathya.springbootmvc.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sathya.springbootmvc.entity.Productentity;
import com.sathya.springbootmvc.model.ProductModel;
import com.sathya.springbootmvc.repository.Productrepository;

import jakarta.persistence.Entity;



@Service
public  class Productservice {

@Autowired
Productrepository productrepository;

public void deleteproductByid(Long id)
{
	productrepository.deleteById(id);	 
}

public Productentity searchbyid(Long id)
{
	Optional<Productentity> optionalData=productrepository.findById(id);
	if(optionalData.isPresent())
	{
		Productentity product=optionalData.get();
		return product;
	}
	else
	{
		return null;
	}
}
public  ProductModel editbytId(Long id) {
	{
		Optional<Productentity> optionaldata=productrepository.findById(id);
		ProductModel product=new ProductModel();
		if(optionaldata.isPresent())
		{
			Productentity eproduct=optionaldata.get();
			product.setName(eproduct.getName());
			product.setBrand(eproduct.getBrand());
			product.setMadeIn(eproduct.getMadeIn());
			product.setPrice(eproduct.getPrice());
			product.setQuantity(eproduct.getQuantity());
			product.setBrand(eproduct.getBrand());
			product.setTaxrate(eproduct.getTaxrate());
			return product;
		}
		else {
			return null;			
			
		}
		}
	
}



public void updateData(Long id,ProductModel model)
{
	Optional<Productentity>optionaldata = productrepository.findById(id);
	if(optionaldata.equals(optionaldata))
	{
		Productentity entity=optionaldata.get();
	    entity.setName(model.getName());
	    entity.setBrand(model.getBrand());
	    entity.setMadeIn(model.getMadeIn());
	    entity.setPrice(model.getPrice());
	    entity.setQuantity(model.getQuantity());
	    entity.setDiscountrate(model.getDiscountrate());
	    entity.setTaxrate(model.getTaxrate());
	    
	    
	    
	    
	    double discountprice;
	    discountprice=model.getPrice()*(model.getDiscountrate()/100);
	    double offerprice;
	    offerprice=model.getPrice()-discountprice;
	    double finalprice;
	    finalprice=model.getPrice()+offerprice;
	    double stockvalue;
	    stockvalue=model.getPrice()*offerprice;
	    entity.setDiscountprice(discountprice);
	    entity.setFinalprice(finalprice);
	    entity.setStockvalue(stockvalue);
	}
}








public List<Productentity> getallproducts(){
	List<Productentity> products= productrepository.findAll();
	return products;
}

public void saveproductdetails(ProductModel productModel)
{
	 	double stockvalue;
		stockvalue=productModel.getPrice()*productModel.getQuantity();
	 	double discountprice;
	 	discountprice=productModel.getPrice()*productModel.getDiscountrate()/100;
	 	double offerprice;
	 	offerprice=productModel.getPrice()-discountprice;
	 	double finalprice;
	 	finalprice=productModel.getTaxrate()+offerprice;
	 	
	 
	
	
	Productentity productentity=new Productentity();
	productentity.setName(productModel.getName());
	productentity.setBrand(productModel.getBrand());
	productentity.setMadeIn(productModel.getMadeIn());
	productentity.setPrice(productModel.getPrice());
	productentity.setQuantity(productModel.getQuantity());
	productentity.setDiscountrate(productModel.getDiscountrate());
	productentity.setTaxrate(productModel.getTaxrate());
	productentity.setOfferprice(offerprice);
	productentity.setFinalprice(finalprice);
	productentity.setStockvalue(stockvalue);
	productentity.setDiscountprice(discountprice);
	
	productrepository.save(productentity);
}

	
}


