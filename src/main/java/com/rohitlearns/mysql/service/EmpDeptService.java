package com.rohitlearns.mysql.service;

import com.rohitlearns.mysql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpDeptService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List fetchEmpDeptDataInnerJoin() {
        return employeeRepository.fetchEmpDeptDataInnerJoin();
    }

    public List fetchEmpDeptDataCrossJoin() {
        return employeeRepository.fetchEmpDeptDataCrossJoin();
    }
}
