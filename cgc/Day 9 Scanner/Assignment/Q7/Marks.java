
import java.util.Scanner;

public class Marks
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);

int Sub1=sc.nextInt();
int Sub2=sc.nextInt();
int Sub3=sc.nextInt();

System.out.println("Subject1 mark");
System.out.println("Subject2 mark");
System.out.println("Subject3 mark");

int total=Sub1+Sub2+Sub3;
double percentage=(total/300)*100;

System.out.println("Total mark="+total);
System.out.println("Percentage="+percentage);
}
}