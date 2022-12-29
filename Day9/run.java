package p1;
import java.util.Scanner;
public class run
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter a Task!!: ");
System.out.println("1.Calculator   2.Fibonacci   3.Table : ");
int z=sc.nextInt();
if(z==1)
{
System.out.println("Please Enter the Operator 1!!: ");
int a=sc.nextInt();
System.out.println("Please Enter the operand +,-,*,/ !!: ");
char b=sc.next().charAt(0);
System.out.println("Please Enter the Operator 2!!: ");
int c=sc.nextInt();
Calci d=new Calci();
d.cal(a,b,c);
}
if(z==2)
{
System.out.println("Please Enter the N!!: ");
int n=sc.nextInt();
fibo e= new fibo();
e.fib(n);
}
if(z==3)
{
System.out.println("Please Enter the Number!!: ");
int f=sc.nextInt();
table g= new table();
g.tab(f);
}
}
}