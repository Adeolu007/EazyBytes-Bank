package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaAttributeConverter<Customer,Long> {
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
