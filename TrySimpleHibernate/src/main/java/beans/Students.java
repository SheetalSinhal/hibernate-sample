package beans;

public class Students 
{
	// Private Fields
		private int id;
		private String name;
		private String email;
		private double marks;
	// Private Fields
		
	// Public Constructors
		public Students() {}
		
		public Students(int id, String name, String email, double marks) {
			this.id=id;
			this.name=name;
			this.email=email;
			this.marks=marks;
		}
	// Public Constructors
		
	// Getters and Setters
		public int getId() {
			return this.id;
		}
		
		public void setId(int id) {
			this.id=id;
		}
		
		public String getName() {
			return this.name;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		public String getEmail() {
			return this.email;
		}
		
		public void setEmail(String email) {
			this.email=email;
		}
		
		public double getMarks() {
			return this.marks;
		}
		
		public void setMarks(double marks) {
			this.marks=marks;
		}
		
		
	// Getters and Setters

}
