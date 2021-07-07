package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sales_by_store database table.
 * 
 */



public class SalesByStoreDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String manager;

	private String store;

	
	private BigDecimal totalSales;

	public SalesByStoreDTO() {
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getStore() {
		return this.store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public BigDecimal getTotalSales() {
		return this.totalSales;
	}

	public void setTotalSales(BigDecimal totalSales) {
		this.totalSales = totalSales;
	}

}