import java.util.ArrayList;

public class arrayListExamplesChiles{

   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       names.add("Andy");
       names.add("Angela");
       names.add("Dwight");
       names.add("Erin");
       names.add("Jim");
       names.add("Michael");
       names.add("Pam");
       names.add("Toby");
       System.out.println(names);
    	for(int i = 0; i<names.size(); i++){
    		System.out.println(names.get(i));
    	}
    	System.out.println(names.size());
    	System.out.println(names.get(names.size()-1));
    	names.set(0, "Andy Bernard");
    	System.out.println(names);
    	names.add(5, "Kelly");
    	System.out.println(names);
    	for(String name : names){
    		System.out.println(name);
    	}
    	ArrayList<String> names2 = new ArrayList<String>(names);
    	System.out.println(names2);
    	names.remove(0);
    	System.out.println(names);
    	System.out.println(names2);
    	

   }
} 
