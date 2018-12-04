package la7pkg;

public class Course<E> implements ICourse {

	String dept;
	int courseNum;
	int cap;
	int stuInCourse;
	String stuName;
	LinkedList<String> roster = new LinkedList<String>();
	
	// constr
	public Course(String department, int number, int capacity) {
		dept = department;
		courseNum = number;
		cap = capacity;
	}
	
	// Determine if the capacity for this course has been reached.
	@Override
	public boolean isFull() {

		if(stuInCourse < cap) {
			return false;
		} else {
			return true;
		}
	}

	// Add this student to the linkedlist for enrolled students for this course.
	@Override
	public void addStudent(String name) {
		if(!isFull()) {
			roster.add(name);
			stuInCourse++;
		}
	}

	// Print the classlist for this course.
	@Override
	public void printClassList() {
		for(int i = 0; i < roster.size(); i++) {
			System.out.println(roster.get(i));
		}
		
	}
	
	// Determines if this course object is the same as the object received as parameter.
	@Override
	public boolean equals(Object arg0) {
		return  this.equals(arg0);
	}

}
