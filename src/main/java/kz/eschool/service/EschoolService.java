package kz.eschool.service;


import kz.eschool.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kz.eschool.repository.EschoolMapper;
import java.util.List;

@Service
public class EschoolService {

    private final EschoolMapper eschoolMapper;

    @Autowired
    public EschoolService(EschoolMapper eschoolMapper) {
        this.eschoolMapper = eschoolMapper;
    }

    public List<Student> getAll(){return eschoolMapper.findAll();}

    public void addStudent(Student student){eschoolMapper.insert(student);}

    public void updateStudent(Student student){eschoolMapper.update(student);}

    public void removeStudent(Long id){eschoolMapper.delete(id);}

}
