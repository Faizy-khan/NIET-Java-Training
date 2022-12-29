import java.util.Scanner;
class poww{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int mul=1;
for(int i=1;i<=y;i++)
{
mul=mul*x;
}
System.out.println(mul);
}
}
