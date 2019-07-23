import java.util.Scanner;

class Student{
	int id;
	String name;
	float marks_1, marks_2;
	String status;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	int getMarks_1() {
		return marks_1;
	}
	void setMarks_1(int marks_1) {
		this.marks_1 = marks_1;
	}
	String getMarks2() {
		return marks_2;
	}
	void setMarks_2(int marks_2) {
		this.marks_2 = marks_2;
	}
	String getStatus() {
		return status;
	}
	void setStatus(String status) {
		this.status = status;
	}
}

class StudentManagementApp{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Add");
		System.out.println("1. Edit");
		System.out.println("1. Delete");
		System.out.println("1. View");
		System.out.println("1. Exit");
		int input = sc.nextInt();
		if(input == 1) {
			
		}
		else if(input == 2) {
			
		}
		else if(input == 3) {
			
		}
		else if(input == 4) {
			
		}
		else if(input == 5) {
			
		}
	}
}