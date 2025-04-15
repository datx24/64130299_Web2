package thiGK.ntu64130299.repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import thiGK.ntu64130299.models.Student;

@Repository
public class StudentRepository {
	private List<Student> students = new ArrayList<>(
			Arrays.asList(new Student("1", "Nguyễn Xuân Đạt", "n1"), new Student("2", "Nguyễn Xuân A", "n2"),
					new Student("3", "Nguyễn Xuân B", "n3"), new Student("4", "Nguyễn Xuân C", "n4"),
					new Student("5", "Nguyễn Xuân D", "n5"), new Student("6", "Nguyễn Xuân E", "n6"),
					new Student("7", "Nguyễn Xuân F", "n7"), new Student("8", "Nguyễn Xuân G", "n8"),
					new Student("9", "Nguyễn Xuân H", "n9"), new Student("10", "Nguyễn Xuân I", "n10")));

	// Hiển thị danh sách student
	public List<Student> findAll() {
		return students;
	}

	// Tìm student theo id
	public Student findStudentById(String id) {
		for (Student s : students) {
			if (s.getId().equals(id)) {
				return s;
			}
		}
		return null;
	}

	// phương thức thêm student
	public void addStudent(Student s) {
		students.add(s);
	}

	// phương thức xóa student theo id
	public void deleteStudentById(String id) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				students.remove(i);
				break;
			}
		}
	}
}
