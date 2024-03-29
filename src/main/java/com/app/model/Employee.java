package com.app.model;

import java.util.List;

public class Employee {

	private String empName;
	private String empPwd;
	private String empGen;
	private String empAddr;
	private String empCntry;
	private List<String> empLangs;
	
	public Employee() {
		super();
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	public String getEmpGen() {
		return empGen;
	}
	public void setEmpGen(String empGen) {
		this.empGen = empGen;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	public String getEmpCntry() {
		return empCntry;
	}
	public void setEmpCntry(String empCntry) {
		this.empCntry = empCntry;
	}
	public List<String> getEmpLangs() {
		return empLangs;
	}
	public void setEmpLangs(List<String> empLangs) {
		this.empLangs = empLangs;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empPwd=" + empPwd + ", empGen=" + empGen + ", empAddr=" + empAddr
				+ ", empCntry=" + empCntry + ", empLangs=" + empLangs + "]";
	}
	
}