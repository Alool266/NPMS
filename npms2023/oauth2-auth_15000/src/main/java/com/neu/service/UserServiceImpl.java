package com.neu.service;

import com.neu.emp.entity.Employee;
import com.neu.emp.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    EmployeeMapper employeeMapper;

   public InMemoryUserDetailsManager getAllUsers(){
       InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
       List<Employee> employeeList = employeeMapper.getAllUser();
       for (Employee e : employeeList) {
           String empId = e.getEmpId();
           String pwd = e.getEmpPassword();
           String roles = e.getEmpPositionId();
           System.out.println(empId);
           userDetailsService.createUser(User.withUsername(empId).password(pwd).roles(roles).build());
       }
       return userDetailsService;
   }
}
