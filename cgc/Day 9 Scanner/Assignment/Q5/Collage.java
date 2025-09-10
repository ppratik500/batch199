import java.util.Scanner;

public class Collage
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a Clgname");

String clgname=sc.next();
String cityname=sc.next();
int pincode=sc.nextInt();
String type=sc.next();

System.out.println("Collage Name="+clgname);
System.out.println("City Name="+cityname);
System.out.println("pin Code="+pincode);
System.out.println("Institute Type="+type);

}
}