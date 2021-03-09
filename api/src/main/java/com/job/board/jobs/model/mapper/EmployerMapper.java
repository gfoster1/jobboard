package com.job.board.jobs.model.mapper;

import com.job.board.jobs.model.pojo.Employer;
import com.job.board.jobs.model.pojo.EmployerExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployerMapper {
    long countByExample(EmployerExample example);

    int deleteByExample(EmployerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employer record);

    int insertSelective(Employer record);

    List<Employer> selectByExample(EmployerExample example);

    Employer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employer record, @Param("example") EmployerExample example);

    int updateByExample(@Param("record") Employer record, @Param("example") EmployerExample example);

    int updateByPrimaryKeySelective(Employer record);

    int updateByPrimaryKey(Employer record);
}