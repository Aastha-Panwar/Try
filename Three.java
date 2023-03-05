public class Three
{
int a;
int b;
String c;
Three(int a, int b, String c)
{
this.a=a;
this.b=b;
this.c=c;
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
public static void main(String[] ar)
{
Three t = new Three(101, 102, "Aastha");
}
}