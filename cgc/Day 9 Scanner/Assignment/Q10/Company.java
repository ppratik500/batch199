import java.util.Scanner;


public class Company
{
Scanner sc= new Scanner(System.in);

public void manager()
{
String name=sc.next();
int salary=sc.nextInt();
int experience=sc.nextInt();
int age=sc.nextInt();
String department=sc.next();

System.out.println("name");
System.out.println("salary");
System.out.println("experience");
System.out.println("age");
System.out.println("department");
}



public void employee()
{
String name=sc.next();
int salary=sc.nextInt();
int age=sc.nextInt();
String department=sc.next();
String city=sc.next();


System.out.println("name");
System.out.println("salary");
System.out.println("experience");
System.out.println("age");
System.out.println("department");
System.out.println("city");
}
}