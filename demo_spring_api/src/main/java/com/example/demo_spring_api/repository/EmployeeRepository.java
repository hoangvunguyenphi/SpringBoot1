package com.example.demo_spring_api.repository;

import com.example.demo_spring_api.modal.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeRepository {

    @Select("select * from tb_emp")
    List<Employee> getAllEmp ();

    @Select("select * from tb_emp WHERE id = #{id}")
    Employee getEmpById (int id);

    @Insert("insert into tb_emp (id,name,gender,department,dob) values (#{id}, #{name}, #{gender}, #{department}, #{dob})")
    int saveEmp (Employee e);

    @Delete("delete from tb_emp where id = #{id}")
    int deleteEmpById (int id);
}
