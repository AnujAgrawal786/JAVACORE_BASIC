import java.util.Scanner;
class Swaping{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int a , b;
System.out.println("Enter the Value of A");
a = sc.nextInt();
System.out.println("Enter the Value of B");
b = sc.nextInt();
a = a + b;
b = a - b;
a= a - b;
System.out.println("The Value of A "+a);
System.out.println("The Value of B "+b);


}


}