import java.util.Scanner;
class ques1
{
public static void main(String args[])
{
double a,b;
Scanner sc= new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
if (a>0.0 && a<1.0 && b>0.0 && b<1.0)
{
System.out.println("The doubles are between 0 to 1");
}
else {
System.out.println("The double are not between 0 to 1");
}
}
}