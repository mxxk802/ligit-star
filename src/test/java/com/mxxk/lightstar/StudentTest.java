package com.mxxk.lightstar;

import com.mxxk.lightstar.pojo.Student;
import com.mxxk.lightstar.service.stock.StudentJpaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * StudentTest
 *
 * @auther zhang
 * @date 2020/6/19
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LightStarApplication.class)
public class StudentTest {

    @Autowired
    public StudentJpaRepository jpaRepository;


    @Test
    public void StudentSave(){

        Student s=new Student();
        s.setName("zhangsan");
        s.setAge(15);
        s.setAddress("北京大兴");
        jpaRepository.save(s);
    }
}
