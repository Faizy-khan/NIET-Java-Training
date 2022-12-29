import java.util.Scanner;
class ques3{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
a=sc.nextInt();
b=sc.nextInt();
System.out.println("a= "+a+" b="+b);
a=a*b;
b=a/b;
a=a/b;
System.out.println("after Swapping");
System.out.println("a= "+a+" b="+b);
}
}