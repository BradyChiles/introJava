
public class Course {
	//Brady Chiles
	
	private int crn;
	private String courseID;
	private String courseName;
	private int credits;
	private String instructor;
	private static int nextCRN = 25000;
	
	public Course(){
		
	}
	 
	public Course(String courseID, String courseName, int credits){
		setCourseID(courseID);
		setCourseName(courseName);
		setCredits(credits);
		setInstructor("staff");
		nextCRN++;
		crn = nextCRN;
		
		if(courseID == null || courseName == null || credits == 0){
			throw new IllegalArgumentException("Object not created");
		}
	}
	
	
	@Override
	public String toString() {
		return "Course [crn=" + crn + ", courseID=" + courseID + ", courseName=" + courseName + ", credits=" + credits
				+ ", instructor=" + instructor + "]";
	}


	public int getCrn() {
		return crn;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		if(credits<5){
			this.credits = credits;
		}
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String returnInfo(){
		String courseID = this.getCourseID();
		String courseName = this.getCourseName();
		int crn = this.getCrn();
		int credits = this.getCredits();
		String instructor = this.getInstructor();
		
		return courseID + ", CRN " + crn + ", " + courseName + ", " + credits + " credits, " + "Instrctor: " + instructor;
		
	}
	public Course duplicateInfo(){
		Course c = new Course(this.courseID, this.courseName, this.credits);
		String instructor = this.getInstructor();
		c.setInstructor(instructor);
		nextCRN++;
		crn = nextCRN;
		return c;
	}
	

}
