package com.wizard.webstore.domain.repository;

import java.util.List;
import com.wizard.webstore.domain.Customer;

public interface CustomerRepository {
	List <Customer> getAllCustomers();
}
