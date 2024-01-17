package com.rts.evaluation;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rts.evaluation.controller.DoctorController;
import com.rts.evaluation.pojo.Doctor;
import com.rts.evaluation.repository.DoctorDAO;

@SpringBootApplication
public class DoctorAppointmentProjectApplication {
	static DoctorDAO dao=new DoctorDAO();
	public  Doctor menu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1) Appointment No , 2) Doctor Name , 3) Doctor Department , 4) Appointment Date , 5) Appointment Time , 6) Patient Name");
		
		return new Doctor(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next());
	}
		
public static void main(String[] args) {
	SpringApplication.run(DoctorAppointmentProjectApplication.class, args);
	DoctorAppointmentProjectApplication obj=new DoctorAppointmentProjectApplication();
	
	
	   Doctor bean =obj.menu();
	
    DoctorController control=new DoctorController();
	control.performInsert(bean);
}

}
