import java.util.ArrayList;

public class CourseTesterChiles {

	public static void main(String[] args) {
	
		ArrayList<String> courses = new ArrayList<String>();
		
		Course java = new Course("CIS 171", "Java", 3);
		java.setInstructor("Kelli Kleindorfer");
		courses.add(java.returnInfo());
		
		
		Course database = new Course("CIS 303", "Intro to Database", 3);
		database.setInstructor("Rodd Bullard");
		courses.add(database.returnInfo());
		
		Course business = new Course("BUS 102", "Intro to Business", 3);
		business.setInstructor("Rajendra Sinha");
		courses.add(business.returnInfo());
		
		Course computers = new Course("CSC 110", "Intro to Computers", 3);
		courses.add(computers.returnInfo());
		
		Course programming = new Course("CIS 125", "Intro to Programming", 3);
		courses.add(programming.returnInfo());
		
		for(String course : courses){
			System.out.println(course);
		}
		
		Course java2 = new Course();
		java2 = java.duplicateInfo();
		System.out.println(java2.returnInfo());
		
		Course database2 = new Course();
		database2 = database.duplicateInfo();
		System.out.println(database2.returnInfo());
		
		Course business2 = new Course();
		business2 = business.duplicateInfo();
		System.out.println(business2.returnInfo());
		
		
	
	}
}
