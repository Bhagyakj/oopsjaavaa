public class Student
{
	int mark;
	int rollno;
	String name;
}
public class Objects
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.name="anu";
		s1.rollno=54;
		s1.mark=90;
		Student s2=new Student();
		s2.name="amal";
		s2.rollno=56;
		s2.mark=98;
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].name+":"+students[i]);
		}
	}
}
