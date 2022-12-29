import java.util.Scanner;
class excep
{
Scanner sc=new Scanner(System.in);
void show()
{
int x=sc.nextInt();
int y=sc.nextInt();
try{
int z=x/y;
System.out.println("z is : "+z);
}
catch(Exception e)
{
e.printStackTrace();
System.out.println("Error as y=0");
}
int h[]=new int[5];
try{
h[5]=10;
System.out.println("x is : "+h);
}
catch(Exception e)
{
e.printStackTrace();
System.out.println("index cant be greater than 4");
}
}
public static void main(String args[])
{


excep a = new excep();
a.show();
}
}