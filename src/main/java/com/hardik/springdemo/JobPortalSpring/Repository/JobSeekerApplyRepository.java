package com.hardik.springdemo.JobPortalSpring.Repository;


import com.hardik.springdemo.JobPortalSpring.Entity.JobPostActivity;
import com.hardik.springdemo.JobPortalSpring.Entity.JobSeekerApply;
import com.hardik.springdemo.JobPortalSpring.Entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}
