package com.example.demo.service;

import com.example.demo.model.crudStudent;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<crudStudent> findAll() {

        Iterable<crudStudent> it = studentRepository.findAll();

        ArrayList<crudStudent> users = new ArrayList<crudStudent>();
        it.forEach(e -> users.add(e));

        return users;
    }

    public Long count() {

        return studentRepository.count();
    }

    public void deleteById(Long userId) {

        studentRepository.deleteById(userId);
    }

    public crudStudent userSave(crudStudent user) {

        return studentRepository.save(user);
    }
}
