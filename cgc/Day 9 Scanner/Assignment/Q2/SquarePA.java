import java.util.Scanner;
public class SquarePA
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);

int side=sc.nextInt();
int area= side*side;
int perimeter= 4*side;


System.out.println(area);
System.out.println(perimeter);
}
}