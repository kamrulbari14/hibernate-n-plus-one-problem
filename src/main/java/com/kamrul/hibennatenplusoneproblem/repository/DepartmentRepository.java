package com.kamrul.hibennatenplusoneproblem.repository;

import com.kamrul.hibennatenplusoneproblem.model.Department;
import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

  /** @fetch is the JPA access type which instructs Hibernate to find data as per our requirement */

  @Query("SELECT p from Department p left join fetch p.students")
  List<Department> findWithoutNPlusOne();

  /** @EntityGraph is used to give a plan to the persistence provider(Hibernate) to fetch the data */

  @EntityGraph(attributePaths = {"students"})
  List<Department> findAll();
}
