package com.management.demo.Controller;

import com.management.demo.Model.Student;
import com.management.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
        private StudentService studentService;

        //Get the List of student from service
    @GetMapping("/students")
   public String  getAllStudents(Model model){

        model.addAttribute("students",studentService.getAllStudents());

        return "students";
    }

    @GetMapping("/student/new")
    public String createStudentForm(Model model){
        //create student object to hold student form
    Student student = new Student();

    model.addAttribute("student",student);

        return "createStudent";
    }

    //This is a handler method to handle the request
    @PostMapping("/createStudent")
    public  String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    //HAndler method to handle upadate
    @GetMapping("/student/edit/{id}")
    public String editStudentForm(@PathVariable Long id , Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "editStudent";
    }

    @PostMapping("/updateStudent/{id}")
public String updateStudent(@PathVariable Long id ,@ModelAttribute("student") Student student ,Model model){

        //Get student from database by id
        Student existingStudent =studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setPhoneNum(student.getPhoneNum());

        //Save student to database
        studentService.updateStudent(existingStudent);

        return "redirect:/students";

    }

    // delete method handler
    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);

        return "redirect:/students";
    }
}
