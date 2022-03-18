package kz.eschool.controllers;


import kz.eschool.model.Login;
import kz.eschool.model.Student;
import kz.eschool.service.EschoolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class EschoolController {

    private EschoolService eschoolService;

    public EschoolController(EschoolService eschoolService) {
        this.eschoolService = eschoolService;
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> checkLogin(@RequestBody Login login){
        if (login.getUsername().equals("admin") && login.getPassword().equals("admin"))
            return new ResponseEntity<>(true, HttpStatus.OK);
        else
            return new ResponseEntity<>(false, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> students = eschoolService.getAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        eschoolService.addStudent(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        eschoolService.updateStudent(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable("id") Long id){
        eschoolService.removeStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
