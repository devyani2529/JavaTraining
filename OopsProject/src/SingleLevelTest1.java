
public class SingleLevelTest1 {
	public static void main(String args[]) {
		/*Person personObj=new Person('H',"Seeta", 21);
	personObj.showPerson();
	System.out.println("........");
	*/
		
//	Student studentObj=new Student('F',"Seeta",21,123,"SinhgadCollege","Electronics",999);
//	studentObj.showStudent();
	
	
	System.out.println(".....");
	Employee empObj=new Employee('F',"Seeta",21,123,"SinhgadCollege","Electronics",999,125,"Dassault System","SoftwareEngineer",10000);
	empObj.showStudent();
	
	}
}
class Person{
	private char gender;
	private String name;
	private int age;
	
	Person(){
		System.out.println("Person() ctor....");
	}
	
	Person(char gender,String name,int age ){
		System.out.println("Person(char,String,int) ctor...");
		if(gender=='M'|| gender=='F'){
			this.gender=gender;
			
		}
		else {
			RuntimeException runtimeGenderEx=new RuntimeException("Invalid gender :"+gender);
			throw runtimeGenderEx;
		}
		if(name.matches("^[a-zA-z]*$")) {
			this.name=name;
		}
		else {
			RuntimeException runtimeNameEx=new RuntimeException("Invalid gender :"+name );
			throw runtimeNameEx;
		}
		if(age>=1 && age<=120) {
			this.age=age;
			
		}
		else {
			RuntimeException runtimeAgeEx=new RuntimeException("Invalid gender :"+age );
			throw runtimeAgeEx;
			
		}
		this.gender=gender;
		this.name=name;
		this.age=age;	
	}
	void showPerson() {
		System.out.println("______PERSONAL______");
		System.out.println(" gender :"+gender);
		System.out.println(" name :"+name);
		System.out.println(" age :"+age);
	}
}
class Student extends Person{
	private int rollNumber;
	private String collegeName;
	private String stream;
	private float totalMarks;
	
	Student(char gender, String name, int age, int rollNumber,String collegeName, String stream, float totalMarks) {
		super(gender,name,age); 
		System.out.println("Student() ctor...");
		
		if(Validator.checkNumber(rollNumber, 1, 500)) {
			this.rollNumber = rollNumber;			
		}
		else {
			RuntimeException runtimeRollNumberEx = new RuntimeException("Invalid Roll Number : "+rollNumber);
			throw runtimeRollNumberEx;
		}
		
		if(Validator.checkString(collegeName)) {
			this.collegeName = collegeName;
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid collegeName : "+collegeName);
			throw runtimeNameEx;
		}
		
		if(Validator.checkString(stream)) {
			this.stream = stream;
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid stream : "+stream);
			throw runtimeNameEx;
		}
		

		if(Validator.checkNumber(totalMarks, 1, 1000)) {
			this.totalMarks = totalMarks;			
		}
		else {
			RuntimeException runtimeMarksEx = new RuntimeException("Invalid Marks : "+totalMarks);
			throw runtimeMarksEx;
		}
		
		this.totalMarks = totalMarks;
	}
	
	void showStudent() {
		super.showPerson(); 
		System.out.println("---- STUDENT ----");
		System.out.println("ROLLNO : "+rollNumber);
		System.out.println("COLLGE : "+collegeName);
		System.out.println("STREAM : "+stream);
		System.out.println("MARKS  : "+totalMarks);
	}
	
}
class Employee extends Student{
	private int empno;
	private String companyName;
	private String designation;
	float salary;
	
	Employee(char gender, String name, int age, int rollNumber,String collegeName, String stream, float totalMarks,int empno,String companyName, String designation,float salary){
		super(gender,  name,  age,  rollNumber, collegeName,  stream,  totalMarks);
		System.out.println("Employee() ctor...");
		if(Validator.checkNumber(empno, 100, 2000)) {
			this.empno = empno;			
		}
		else {
			RuntimeException runtimeEmpnoEx = new RuntimeException("Invalid empno : "+empno);
			throw runtimeEmpnoEx;
		}
		if(Validator.checkString(designation)){
			this.designation=designation;			
		}
		else {
			RuntimeException runtimeDesignationEx = new RuntimeException("Invalid designation : "+designation);
			throw runtimeDesignationEx;
		}
		if(Validator.checkNumber(salary, 5000, 20000)){
			this.salary=salary;			
		}
		else {
			RuntimeException runtimesalaryEx = new RuntimeException("Invalid salary : "+salary);
			throw runtimesalaryEx;
		}	
	}
	void showEmployee() {
		super.showStudent();
		System.out.println("---- EMPLOYEE ----");
		System.out.println("EMPNO  : "+empno);
		System.out.println("COMPANY: "+companyName);
		System.out.println("DESG   : "+designation);
		System.out.println("SALARY : "+salary);
	}
}