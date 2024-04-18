package com.jobapp.jobms.job.mapper;

import com.jobapp.jobms.job.Job;
import com.jobapp.jobms.job.dto.JobDTO;
import com.jobapp.jobms.job.external.Company;
import com.jobapp.jobms.job.external.Review;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JobMapper {
    public static JobDTO mapToJobWithCompanyDTO (Job job, Company company, List<Review> reviews){
        JobDTO result = new JobDTO();
        result.setId(job.getId());
        result.setTitle(job.getTitle());
        result.setDescription(job.getDescription());
        result.setLocation(job.getLocation());
        result.setMinSalary(job.getMinSalary());
        result.setMaxSalary(job.getMaxSalary());
        result.setCompany(company);
        List<Review> filteredReviews = reviews.stream()
                .filter(review -> review.getCompanyId().equals(company.getId()))
                .collect(Collectors.toList());

        result.setReviews(filteredReviews);
        return result;
    }
}
