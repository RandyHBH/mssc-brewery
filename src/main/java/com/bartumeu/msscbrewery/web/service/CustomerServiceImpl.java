package com.bartumeu.msscbrewery.web.service;

import com.bartumeu.msscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO
                .builder()
                .id(customerId)
                .name("Randy HBH")
                .build();
    }
}
