package com.hardik.springdemo.JobPortalSpring.Service;



import com.hardik.springdemo.JobPortalSpring.Entity.UsersType;
import com.hardik.springdemo.JobPortalSpring.Repository.UsersTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {


    private final UsersTypeRepository usersTypeRepository;

    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAll() {
        return usersTypeRepository.findAll();
    }
}
