package com.rts.evaluation.pojo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Doctor")
public class Doctor {
	
	@Id
	@Column(name = "appointmentNo")
	private  int appointmentNo;
	@Column(name = "doctorName")
	private  String doctorName;
	@Column(name = "doctorDepartment")
	private  String doctorDepartment;
	@Column(name = "appointmentDate")
	private  int appointmentDate;
	@Column(name = "appointmentTime")
	private int appointmentTime;
	@Column(name = "patientName")
	private String patientName;
	public Doctor(int appointmentNo, String doctorName, String doctorDepartment, int appointmentDate,
			int appointmentTime, String patientName) {
		super();
		this.appointmentNo = appointmentNo;
		this.doctorName = doctorName;
		this.doctorDepartment = doctorDepartment;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.patientName = patientName;
	}
	public Doctor() {
		super();

	}
	public int getAppointmentNo() {
		return appointmentNo;
	}
	public void setAppointmentNo(int appointmentNo) {
		this.appointmentNo = appointmentNo;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorDepartment() {
		return doctorDepartment;
	}
	public void setDoctorDepartment(String doctorDepartment) {
		this.doctorDepartment = doctorDepartment;
	}
	public int getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(int appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public int getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(int appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	@Override
	public String toString() {
		return "Doctor [appointmentNo=" + appointmentNo + ", doctorName=" + doctorName + ", doctorDepartment="
				+ doctorDepartment + ", appointmentDate=" + appointmentDate + ", appointmentTime=" + appointmentTime
				+ ", patientName=" + patientName + "]";
	}
	

	

}