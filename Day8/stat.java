import java.util.Scanner;
class stat
{
Scanner sc=new Scanner(System.in);
static{
System.out.println("Static block");
}
static void show()
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int z=x/y;
System.out.println("z is : "+z);
}
public static void main(String args[])
{
stat.show();
stat a = new stat();
a.show();
}
}