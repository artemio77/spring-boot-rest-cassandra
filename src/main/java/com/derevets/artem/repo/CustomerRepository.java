package com.derevets.artem.repo;

import java.util.List;
import java.util.UUID;

import com.derevets.artem.model.Customer;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CustomerRepository extends CassandraRepository<Customer, UUID> {
	List<Customer> findByAge(int age);
}
