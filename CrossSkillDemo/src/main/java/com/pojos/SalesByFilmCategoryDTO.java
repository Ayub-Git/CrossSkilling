package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sales_by_film_category database table.
 * 
 */



public class SalesByFilmCategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String category;

	
	private BigDecimal totalSales;

	public SalesByFilmCategoryDTO() {
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getTotalSales() {
		return this.totalSales;
	}

	public void setTotalSales(BigDecimal totalSales) {
		this.totalSales = totalSales;
	}

}