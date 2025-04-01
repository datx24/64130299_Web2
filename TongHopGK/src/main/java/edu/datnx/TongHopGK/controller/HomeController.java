package edu.datnx.TongHopGK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import edu.datnx.TongHopGK.models.Student;
import edu.datnx.TongHopGK.services.StudentService;

@Controller
public class HomeController {
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String home() {
        for (var item : studentService.getAllStudents()) {
            System.out.println(item.toString());
        }
        return "pages/home";
    }

    @GetMapping("/about")
    public String about() {
        return "pages/about";
    }

    @GetMapping("/addnew")
    public String addNew() {
        return "pages/addNew";
    }

    @PostMapping("/addnewdb")
    public String addNewDb(
            ModelMap m,
            @RequestParam("fullName") String fullName,
            @RequestParam("mssv") String mssv,
            @RequestParam("averageGrade") double averageGrade) {
        boolean isSuccess = studentService.addNewStudent(new Student(mssv, fullName, averageGrade));
        if (isSuccess) {
            m.addAttribute("success", "Thêm thành công");
        } else {
            m.addAttribute("success", "Thêm thất bại");
        }
        m.addAttribute("students", studentService.getAllStudents());
        return "pages/studentlist";
    }

    @GetMapping("/studentlist")
    public String studentlist(ModelMap m) {
        m.addAttribute("students", studentService.getAllStudents());
        return "pages/studentlist";
    }

    // Xem chi tiết sinh viên
    @GetMapping("/student/{id}")
    public String studentDetail(@PathVariable("id") String mssv, ModelMap m) {
        Student student = studentService.getStudentByMssv(mssv);
        if (student == null) {
            m.addAttribute("error", "Không tìm thấy sinh viên");
            return "pages/error";
        }
        m.addAttribute("student", student);
        return "pages/studentDetail";
    }

    // Xóa sinh viên
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") String mssv, ModelMap m) {
        boolean isDeleted = studentService.deleteStudent(mssv);
        if (isDeleted) {
            m.addAttribute("success", "Xóa thành công");
        } else {
            m.addAttribute("error", "Xóa thất bại");
        }
        m.addAttribute("students", studentService.getAllStudents());
        return "pages/studentlist";
    }

    // Hiển thị form cập nhật sinh viên
    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable("id") String mssv, ModelMap m) {
        Student student = studentService.getStudentByMssv(mssv);
        if (student == null) {
            m.addAttribute("error", "Không tìm thấy sinh viên");
            return "pages/error";
        }
        m.addAttribute("student", student);
        return "pages/editStudent";
    }

    // Xử lý cập nhật sinh viên
    @PostMapping("/editdb")
    public String editStudentDb(
            ModelMap m,
            @RequestParam("mssv") String mssv,
            @RequestParam("fullName") String fullName,
            @RequestParam("averageGrade") double averageGrade) {
        boolean isUpdated = studentService.updateStudent(new Student(mssv, fullName, averageGrade));
        if (isUpdated) {
            m.addAttribute("success", "Cập nhật thành công");
        } else {
            m.addAttribute("error", "Cập nhật thất bại");
        }
        m.addAttribute("students", studentService.getAllStudents());
        return "pages/studentlist";
    }
}
