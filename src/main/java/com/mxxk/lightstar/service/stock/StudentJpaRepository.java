package com.mxxk.lightstar.service.stock;

import com.mxxk.lightstar.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepository extends JpaRepository<Student,Integer> {
}
