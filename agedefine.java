import java.util.Scanner;
class AgeFinder{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int age ;
System.out.println("Enter Your Age:");
age = sc.nextInt();
if(age <= 0)
System.out.println("Please Enter Vaild Age ");
if(age<=13)
System.out.println("You are Child:)");
if(age<=19)
System.out.println("You are Teen:)");
else if(age<=59)
System.out.println("You are Adult:)");
else
System.out.println("You are senior citezen:)");






}


}