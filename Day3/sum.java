import java.util.Scanner;
class sum{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int x=sc.nextInt();
int sum=0;
int a;
int dig=0;
int y=100;
for(int i=1;i<=3;i++)
{
a=x%10;
sum=sum+a;
dig=dig+a*y;
y=y/10;
x=x/10;
}
System.out.println(sum);
System.out.println(dig);
}
}
