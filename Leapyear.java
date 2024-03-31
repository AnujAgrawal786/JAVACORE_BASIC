import java.util.Scanner;
class LeapYear{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int y ;
System.out.println("Enter YEAR");
y = sc.nextInt();
if(y % 4 == 0)
System.out.println("This  Year is Leap Year:");
else
System.out.println("This Year Is not Leap Year ");




}


}