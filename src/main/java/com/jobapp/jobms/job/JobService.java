package com.jobapp.jobms.job;

import com.jobapp.jobms.job.dto.JobDTO;

import java.util.List;


public interface JobService {

    List<JobDTO> findAll();
    JobDTO findById(Long id);
    void addJob(Job job);
    void deleteJob(Long id);
    void updateJob(Long id, Job job);

}
