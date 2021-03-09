package com.job.board.jobs;

import com.job.board.jobs.model.mapper.EmployerMapper;
import com.job.board.jobs.model.mapper.JobMapper;
import com.job.board.jobs.model.pojo.EmployerExample;
import com.job.board.jobs.model.pojo.Job;
import com.job.board.jobs.model.pojo.JobKey;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.Instant;

@Slf4j
@RestController("/jobs")
@RequiredArgsConstructor
public class JobsController {

    private final JobMapper jobMapper;
    private final EmployerMapper employerMapper;

    @ResponseBody
    @PostMapping("/employers/{employerId}")
    public ResponseEntity<Void> postJob(CreateJobRequest createJobRequest, @PathVariable("employerId") int employerId) {
        ResponseEntity<Void> responseEntity = ResponseEntity.notFound().build();
        EmployerExample example = new EmployerExample();
        example.setDistinct(true);
        example.createCriteria().andIdEqualTo(employerId);
        long count = employerMapper.countByExample(example);
        if (count == 1) {
            JobKey jobKey = new JobKey();
            jobKey.setId(1);
            jobKey.setEmployerid(employerId);
            Job job = new Job();
            job.setStatus("active");
            job.setType(createJobRequest.type);
            job.setSalary(createJobRequest.salary);
            job.setLocation(createJobRequest.location);
            job.setDescription(createJobRequest.description);
            job.setId(1);
            job.setEmployerid(employerId);
            job.setDateposted(Date.from(Instant.now()));
            jobMapper.insert(job);
            responseEntity = ResponseEntity.noContent().build();
        }
        return responseEntity;
    }

    @Data
    public static final class CreateJobRequest {
        float salary;
        String type;
        String title;
        String location;
        String description;
    }
}