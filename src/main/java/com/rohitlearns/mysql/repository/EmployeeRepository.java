package com.rohitlearns.mysql.repository;

import com.rohitlearns.mysql.dto.DeptEmpDto;
import com.rohitlearns.mysql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query("SELECT new com.rohitlearns.mysql.dto.DeptEmpDto(d.name,e.name,e.email,e.address) FROM Department d INNER JOIN d.employees e")
    List<DeptEmpDto> fetchEmpDeptDataInnerJoin();

    @Query("SELECT new com.rohitlearns.mysql.dto.DeptEmpDto(d.name, e.name,e.email,e.address) FROM Department d, Employee e")
    List<DeptEmpDto> fetchEmpDeptDataCrossJoin();
}
