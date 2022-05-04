package Week3.Day1;

public class Student {
	public void StudentName() {
		System.out.println("Sandhiya Sandhiya");}
	public void Studentdept() {
		System.out.println("Computer Application");}
	public void StudentId() {
		System.out.println("Id is 28");
	}
	public static void main(String[]args) {
		College college= new College();
		Department Department= new Department();
		Student student=new Student();
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		Department.deptName();
		student.StudentName();
		student.Studentdept();
		student.StudentId();
	}

}
