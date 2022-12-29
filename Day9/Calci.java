package p1;
class Calci
{
void cal(int x,char h,int y)
{
int z;
if(h=='+')
{
z=x+y;
System.out.println(x+" "+h+" "+y+" "+"="+z);

}
else if(h=='-')
{
z=x-y;
System.out.println(x+" "+h+" "+y+" "+"="+z);

}
else if(h=='*')
{
z=x*y;
System.out.println(x+" "+h+" "+y+" "+"="+z);

}
else if(h=='/')
{
z=x/y;
System.out.println(x+" "+h+" "+y+" "+"="+z);

}
else 
{
System.out.println("Please enter correct operator");
}
}
}