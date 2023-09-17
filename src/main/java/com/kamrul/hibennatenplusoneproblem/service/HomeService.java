package com.kamrul.hibennatenplusoneproblem.service;

import com.kamrul.hibennatenplusoneproblem.model.Department;
import com.kamrul.hibennatenplusoneproblem.repository.DepartmentRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HomeService {

  private final DepartmentRepository departmentRepository;

  public List<Department> findAllDepartment(){

//    List<Department> departments = departmentRepository.findAll();
    List<Department> departments = departmentRepository.findWithoutNPlusOne();
    return departments;
  }

}
