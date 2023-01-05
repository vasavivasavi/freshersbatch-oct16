package com.assignments;

public class Customer {
	private int id;
	private String name;
	private String contact;
	private Address address;



	public int getId() {
	return id;
	}



	public void setId(int id) {
	this.id = id;
	}



	public Customer() {
	    super();
	}



	public Customer(int id, String name, String contact, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.contact = contact;
	this.address = address;
	}



	public String getName() {
	return name;
	}



	public void setName(String name) {
	this.name = name;
	}



	public String getContact() {
	return contact;
	}



	public void setContact(String contact) {
	this.contact = contact;
	}



	public Address getAddress() {
	return address;
	}



	public void setAddress(Address address) {
	this.address = address;
	}

}
