package com.rts.evaluation.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rts.evaluation.pojo.Doctor;
import com.rts.evaluation.repository.DoctorDAO;
@RestController
@CrossOrigin(origins = "http://localhost:1230")
@RequestMapping("/doctorRest/api")
public class DoctorController {
		@Autowired
		DoctorDAO dao;
		
		@PostMapping("/appointment")
		public String performInsert(@RequestBody Doctor bean)
		{
			dao.insert(bean);
			System.out.println("Inserted");
			List <Doctor> list=dao.view();
			System.out.println(list);
			return "Inserted";
		}
	}