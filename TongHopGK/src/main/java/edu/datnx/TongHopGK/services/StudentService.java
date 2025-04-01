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

    // 🟢 Lấy danh sách tất cả sinh viên
    public List<Student> getAllStudents() {
        return studentList;
    }

    // 🟢 Thêm sinh viên mới
    public boolean addNewStudent(Student student) {
        try {
            studentList.add(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Tìm sinh viên theo MSSV
    public Student getStudentByMssv(String mssv) {
        for (Student student : studentList) {
            if (student.getMssv().equals(mssv)) {
                return student;
            }
        }
        return null; // Không tìm thấy
    }

    // Xóa sinh viên theo MSSV
    public boolean deleteStudent(String mssv) {
        return studentList.removeIf(student -> student.getMssv().equals(mssv));
    }

    // Cập nhật thông tin sinh viên
    public boolean updateStudent(Student updatedStudent) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMssv().equals(updatedStudent.getMssv())) {
                studentList.set(i, updatedStudent); // Cập nhật thông tin mới
                return true;
            }
        }
        return false; // Không tìm thấy để cập nhật
    }
}
