package com.wizard.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.wizard.webstore.domain.Customer;
import com.wizard.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{
	
	private List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	public InMemoryCustomerRepository() {
		Customer c1= new Customer("c1","Humberto Sánchez Martínez", "Norte 9 #27 Col. Ferrocarrilera");
		Customer c2= new Customer("c2","Yamilet Hernandez Perez", "Caoba #55 Col. Camino Real");
		Customer c3= new Customer("c2","Humberto Sánchez Avendaño", "Veracruz #107 Col. Mexico");
		listOfCustomers.add(c1);
		listOfCustomers.add(c2);
		listOfCustomers.add(c3);
	}
	

	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}

	
}
