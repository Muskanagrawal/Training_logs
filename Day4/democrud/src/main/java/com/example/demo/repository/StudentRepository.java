package com.example.demo.repository;

import com.example.demo.model.crudStudent;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository  extends CrudRepository<crudStudent, Long> {
}
