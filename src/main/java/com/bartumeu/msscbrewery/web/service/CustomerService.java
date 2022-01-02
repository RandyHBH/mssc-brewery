package com.bartumeu.msscbrewery.web.service;

import com.bartumeu.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);
}
