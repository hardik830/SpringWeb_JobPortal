package com.hardik.springdemo.JobPortalSpring.Service;



import com.hardik.springdemo.JobPortalSpring.Entity.JobPostActivity;
import com.hardik.springdemo.JobPortalSpring.Entity.JobSeekerProfile;
import com.hardik.springdemo.JobPortalSpring.Entity.JobSeekerSave;
import com.hardik.springdemo.JobPortalSpring.Repository.JobSeekerSaveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerSaveService {

    private final JobSeekerSaveRepository jobSeekerSaveRepository;

    public JobSeekerSaveService(JobSeekerSaveRepository jobSeekerSaveRepository) {
        this.jobSeekerSaveRepository = jobSeekerSaveRepository;
    }

    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId) {
        return jobSeekerSaveRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerSave> getJobCandidates(JobPostActivity job) {
        return jobSeekerSaveRepository.findByJob(job);
    }

    public void addNew(JobSeekerSave jobSeekerSave) {
        jobSeekerSaveRepository.save(jobSeekerSave);
    }
}