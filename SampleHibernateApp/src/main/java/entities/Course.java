package entities;

// Automatically generate primary key: increment
public class Course 
{
	private int courseId;
	private String courseName;
	private double fees;
	
	public Course() {}
	
	public Course(String name, double fees) {
		this.courseName=name;
		this.fees=fees;
	}
	
	public int getCourseId() {
		return this.courseId;	
	}
	
	public void setCourseId(int id) {
		this.courseId=id;		
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void setCourseName(String name) {
		this.courseName=name;
	}
	
	public double getFees() {
		return this.fees;
	}
	
	public void setFees(double fees) {
		this.fees=fees;
	}

}
