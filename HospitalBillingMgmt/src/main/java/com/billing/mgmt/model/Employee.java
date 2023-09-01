package com.billing.mgmt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="emptab")
public class Employee {
	@Id
	@Column(name="eid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
	private Integer empId;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="esal")
	private Double empSal;
	
	@Column(name="edept")
	private String empDept;

	@Column(name="ehra")
	private Double empHra;
	
	@Column(name="eta")
	private Double empTa;

	public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, Double empSal, String empDept, Double empHra, Double empTa) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
		this.empHra = empHra;
		this.empTa = empTa;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public Double getEmpHra() {
		return empHra;
	}

	public void setEmpHra(Double empHra) {
		this.empHra = empHra;
	}

	public Double getEmpTa() {
		return empTa;
	}

	public void setEmpTa(Double empTa) {
		this.empTa = empTa;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDept=" + empDept
				+ ", empHra=" + empHra + ", empTa=" + empTa + "]";
	}	
	
}
