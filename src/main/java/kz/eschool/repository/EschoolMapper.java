package kz.eschool.repository;

import org.apache.ibatis.annotations.*;
import javax.websocket.server.PathParam;
import kz.eschool.model.Student;

import java.util.List;

@Mapper
public interface EschoolMapper {
    @Select("select * from student")
    List<Student> findAll();

    @Update("update student set name=#{name}," +
            "surname=#{surname}, " +
            "course=#{course}, " +
            "gpa=#{gpa}," +
            "direction=#{direction}" +
            "where id=#{id}")
    void update(Student student);

    @Insert("insert into student " +
            "(name, surname, course, direction , gpa) " +
            "values(#{name}, #{surname}, #{course}, #{direction} , #{gpa})")
    void insert(Student student);

    @Delete("delete from student where id=#{id}")
    void delete(@PathParam("id") long id);
}
