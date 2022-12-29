import java.util.Scanner;
class excep
{
Scanner sc=new Scanner(System.in);
void show()
{

int x[]=new int[5];

try{
x[5]=10;
System.out.println("x is : "+x);
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