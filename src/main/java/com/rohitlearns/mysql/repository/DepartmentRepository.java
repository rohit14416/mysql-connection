package com.rohitlearns.mysql.repository;

import com.rohitlearns.mysql.dto.DeptEmpDto;
import com.rohitlearns.mysql.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    @Query("SELECT new com.rohitlearns.mysql.dto.DeptEmpDto(d.name,e.name,e.email, e.address) FROM Department d LEFT JOIN d.employees e")
    List<DeptEmpDto> fetchEmpDeptDataLeftJoin();


}
