package com.training.rentcloud.profileservice.service;

import com.training.rentcloud.commons.model.Customer;

public interface CustomerService {

    // have to have a method to save a customer
    Customer save(Customer customer);
}
