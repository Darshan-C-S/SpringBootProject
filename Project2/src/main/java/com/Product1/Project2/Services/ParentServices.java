package com.Product1.Project2.Services;

import com.Product1.Project2.Entity.Parent;
import com.Product1.Project2.Repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentServices {
    @Autowired
    ParentRepository parentRepository;

    public List<Parent> getAllParents(){
        return parentRepository.findAll();
    }
    public Parent creatParent(Parent parent){
        return parentRepository.save(parent);
    }

}
