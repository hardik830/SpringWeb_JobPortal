package com.hardik.springdemo.JobPortalSpring.Repository;


import com.hardik.springdemo.JobPortalSpring.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users,Integer> {
    Optional<Users> findByEmail(String email);
}
