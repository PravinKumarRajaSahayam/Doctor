package com.rts.evaluation.repository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.rts.evaluation.pojo.Doctor;
@Repository
public class DoctorDAO {
		 static List<Doctor> list;
		
		public static boolean insert(Doctor bean)
		{
			list = new ArrayList<Doctor>();
			
			list.add(bean);
	        return true;
			
		}
		
		public static  List<Doctor> view()
		{
			return list;
		}
		
	}