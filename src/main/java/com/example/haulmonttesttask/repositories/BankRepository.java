package com.example.haulmonttesttask.repositories;

import com.example.haulmonttesttask.model.Bank;
import org.springframework.data.repository.CrudRepository;

public interface BankRepository extends CrudRepository<Bank, String> {
}
