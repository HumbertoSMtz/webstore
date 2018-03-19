package com.wizard.webstore.domain;

public class Customer {
	
	private String custumerId;
	private String name;
	private String adress;
	private int noOfOrdersMade;
	
	public Customer() {
		super();
	}
	
	public Customer(String id, String name, String adress ) {
		custumerId=id;
		this.name=name;
		this.adress=adress;
		noOfOrdersMade=0;
	}
	
	public String getCustumerId() {
		return custumerId;
	}
	public void setCustumerId(String custumerId) {
		this.custumerId = custumerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getNoOfOrdersMade() {
		return noOfOrdersMade;
	}
	public void setNoOfOrdersMade(int noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}

}
