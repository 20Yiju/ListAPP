package example.com.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Student> list = new ArrayList<Student>();
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101,"Kim", 23);
		al.add(s1);
		Student s2 = new Student(102, "Choi", 21);
		al.add(s2);
		al.add(new Student(103, "Park", 25));
		al.add(new Student(104, "Jung", 22));
		al.add(new Student(105, "Seo", 21));
		al.add(new Student(106, "Ha", 22));
		al.add(new Student(107, "Moon", 20));
		al.add(new Student(108, "LEE", 27));
		al.add(new Student(109, "Kook", 22));
		al.add(new Student(110, "Jang", 22));
		
		Collections.sort(al);
		for(Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al);
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
		
	}

}
