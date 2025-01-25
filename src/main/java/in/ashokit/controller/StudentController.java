package in.ashokit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Student;
import in.ashokit.entity.StudentEntity;
import in.ashokit.repository.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	private StudentRepository repo;
//load the page
	@GetMapping("/")
	public String loadPage(Model model) {
		loadinfo(model);
		

		return "index";
	}
	private void loadinfo(Model model) {
		List<String> branchList=new ArrayList<>();
		branchList.add("CSE");
		branchList.add("ECE");
		branchList.add("EEE");
		branchList.add("CIVIL");
		branchList.add("MECH");
		
		Student student=new Student();// for receiving input
		model.addAttribute("branch",branchList);
		model.addAttribute("student",student);
	}
	//submit the data
	@PostMapping("/save")
	public String handleSubmit(Student stud,Model model) {
		System.out.println(stud);
		//logic to insert data
		
		StudentEntity entity=new StudentEntity();
		BeanUtils.copyProperties(stud,entity );
		repo.save(entity);
		loadinfo(model);
		model.addAttribute("msg","saved");

		return "index";
	}
	//ViewAllStudents
	@GetMapping("/viewStudents")
	public String disAllStudent(Model model) {
		List<StudentEntity> list=repo.findAll();
		model.addAttribute("students", list);
		
		return "data";
	}

	
}
