package kz.eschool.controllers;



import kz.eschool.model.Student;
import kz.eschool.service.EschoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.*;


@SpringBootTest
@AutoConfigureMockMvc
public class EschoolControllerTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private EschoolService eschoolService;

        @Test
        public void addStudentTest() {
        Student student = new Student( 1L ,"My" , "Test" , 4 , "Maths" , 3.3);
        eschoolService.addStudent(student);
        Assert.assertTrue(student.getId()>0);
        }

        @Test
        public void getListStudent() {
        List<Student> students = eschoolService.getAll();
        Assert.assertTrue(students.size()>0);
        }

        @Test
        public void updateStudentTest(){
            Student studentUpdate = new Student( 1L ,"My" , "Test" , 4 , "Maths" , 3.3);
            studentUpdate.setName("Test");
            Student student = new Student( 2L ,"Test" , "Test" , 4 , "Maths" , 3.3);
            eschoolService.addStudent(student);
            Assert.assertSame(studentUpdate.getName() , student.getName());
        }














    }



