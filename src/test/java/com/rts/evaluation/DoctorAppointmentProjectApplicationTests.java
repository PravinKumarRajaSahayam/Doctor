package com.rts.evaluation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.rts.evaluation.controller.DoctorController;
import com.rts.evaluation.pojo.Doctor;
import com.rts.evaluation.repository.DoctorDAO;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
@SpringBootTest
class DoctorAppointmentProjectApplicationTests {
	 @Autowired
	 DoctorController controller;
	 String insert;
	 String result;
	 
	  List<Doctor> list = new ArrayList<Doctor>();

	  //Test the Context Loads
     @Test
     @Order(1)
     void contextLoads() {

     }

     //Test the Perform Insert 
     @Test
     @Order(2)
     public void testPerformInsert() {
         Doctor obj = new Doctor();
         obj.setAppointmentNo(101);
         obj.setDoctorName("Pravin");
         obj.setDoctorDepartment("EYE");
         obj.setAppointmentDate(14);
         obj.setAppointmentTime(9);
         obj.setPatientName("Kumar");
         insert = "Inserted";
         result = controller.performInsert(obj);
         Assert.assertEquals(insert, result);
     }
     
     
}
