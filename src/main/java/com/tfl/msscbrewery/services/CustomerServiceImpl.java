package com.tfl.msscbrewery.services;

import com.tfl.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().name("John").id(UUID.randomUUID()).build();
    }

    @Override
    public CustomerDto createNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("update customer...");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("delete customer...");
    }
}
