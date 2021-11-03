package beans;

public class Employee 
{
	private int empId;
	private String empName;
	private String empMail;
	
	public Employee() {}
	
	public Employee(int id, String name, String email) {
		this.empId=id;
		this.empName=name;
		this.empMail=email;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	
	

}
