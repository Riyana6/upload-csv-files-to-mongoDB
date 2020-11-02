package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.document.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
}