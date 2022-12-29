class override1{
//Do Not Make parent class function public/protected 
void PN()
{
String name="Faizy Khan";
System.out.println("Name ="+name);
}
}
class override2 extends override1
{
//If parent class method is public/ Protected then child class should be the same but visa-versa is true
void PN(){
String name="Mr. Khan";
System.out.println("Name = "+name);
}
}
class override{
public static void main(String args[]){
override2 h=new override2();
h.PN();
}
}