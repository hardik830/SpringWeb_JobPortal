package com.hardik.springdemo.JobPortalSpring.Repository;


import com.hardik.springdemo.JobPortalSpring.Entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile,Integer> {
}
