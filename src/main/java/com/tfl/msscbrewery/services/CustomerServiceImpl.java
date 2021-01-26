package com.tfl.msscbrewery.services;

import com.tfl.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().name("John").id(UUID.randomUUID()).build();
    }
}
