package com.kamrul.hibennatenplusoneproblem.controller;

import com.kamrul.hibennatenplusoneproblem.model.Department;
import com.kamrul.hibennatenplusoneproblem.service.HomeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departments")
public class HomeController {

  private final HomeService service;


  @GetMapping
  public List<Department> departments(){
    return service.findAllDepartment();
  }

}
