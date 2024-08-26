package com.hardik.springdemo.JobPortalSpring.Repository;


import com.hardik.springdemo.JobPortalSpring.Entity.UsersType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersTypeRepository extends JpaRepository<UsersType,Integer> {
}
