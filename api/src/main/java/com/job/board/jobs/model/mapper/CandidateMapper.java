package com.job.board.jobs.model.mapper;

import com.job.board.jobs.model.pojo.Candidate;
import com.job.board.jobs.model.pojo.CandidateExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CandidateMapper {
    long countByExample(CandidateExample example);

    int deleteByExample(CandidateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Candidate record);

    int insertSelective(Candidate record);

    List<Candidate> selectByExample(CandidateExample example);

    Candidate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Candidate record, @Param("example") CandidateExample example);

    int updateByExample(@Param("record") Candidate record, @Param("example") CandidateExample example);

    int updateByPrimaryKeySelective(Candidate record);

    int updateByPrimaryKey(Candidate record);
}