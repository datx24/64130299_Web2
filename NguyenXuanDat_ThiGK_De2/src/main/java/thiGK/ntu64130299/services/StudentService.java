package thiGK.ntu64130299.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu64130299.models.Student;
import thiGK.ntu64130299.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	// Hiển thị danh sách student
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	// Tìm student theo id
	public Student findStudentById(String id) {
		return studentRepository.findStudentById(id);
	}

	// phương thức thêm student
	public void addStudent(Student s) {
		studentRepository.addStudent(s);
	}

	// phương thức xóa student theo id
	public void deleteStudentById(String id) {
		studentRepository.deleteStudentById(id);
	}
}
