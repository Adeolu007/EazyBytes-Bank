package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaAttributeConverter<Customer,Long> {
}
