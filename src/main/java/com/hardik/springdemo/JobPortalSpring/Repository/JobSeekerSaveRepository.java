package com.hardik.springdemo.JobPortalSpring.Repository;



import com.hardik.springdemo.JobPortalSpring.Entity.JobPostActivity;
import com.hardik.springdemo.JobPortalSpring.Entity.JobSeekerProfile;
import com.hardik.springdemo.JobPortalSpring.Entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
