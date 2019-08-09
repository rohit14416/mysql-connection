package com.rohitlearns.mysql;

import com.rohitlearns.mysql.dto.DeptEmpDto;
import com.rohitlearns.mysql.service.EmpDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/EmployeeInfo")
public class EmpDeptController {

    @Autowired
    private EmpDeptService empDeptService;

    @RequestMapping(method = RequestMethod.GET, value = "/info")
    public List<DeptEmpDto> getEmployeeDepartmentInnerJoinInfo() {
       // System.out.println("I am here");
        return empDeptService.fetchEmpDeptDataInnerJoin();
    }

    @RequestMapping(method = RequestMethod.GET, value="/crossJoinInfo")
    public List<DeptEmpDto> getEmployeeDepartmentCrossJoinInfo() {
        return empDeptService.fetchEmpDeptDataCrossJoin();
    }
}
