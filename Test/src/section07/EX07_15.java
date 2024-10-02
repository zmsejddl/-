package section07;

public class EX07_15 {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.studentName = "김고이";
		stu1.hello();
		System.out.println("학교는 " + Student.schoolName + "입니다.");
		Student.goToSchool();

		Student stu2 = new Student();
		stu1.studentName = "김고삼";
		stu1.hello();
		System.out.println("학교는 " + Student.schoolName + "입니다.");
		Student.goToSchool();
	}
}
