package edu.datnx.TongHopGK.services;

import org.springframework.stereotype.Service;

import edu.datnx.TongHopGK.models.Student;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> studentList;

    public StudentService() {
        studentList = new ArrayList<>();
        studentList.add(new Student("SV001", "Nguyễn Văn An", 8.5));
        studentList.add(new Student("SV002", "Trần Thị Bình", 7.8));
        studentList.add(new Student("SV003", "Lê Văn Cường", 9.0));
    }
    public List<Student> getAllStudents() {
    	
        return studentList;
    }
    public boolean addNewStudent(Student student) {
    	try {
    		studentList.add(student);
        	return true;
		} catch (Exception e) {
			return false;
		}
   
    }
}
