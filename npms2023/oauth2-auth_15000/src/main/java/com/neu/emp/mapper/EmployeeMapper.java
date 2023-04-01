package com.neu.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neu.emp.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper extends BaseMapper<Employee> {

    public List<Employee> getAllUser();
}
