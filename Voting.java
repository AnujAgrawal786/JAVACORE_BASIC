import java.util.Scanner;
class Voting{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int age ;
System.out.println("Enter Your Age:");
age = sc.nextInt();
if(age <= 0)
System.out.println("Please Enter Vaild Age ");
else if(age>=18)
System.out.println("You are eligble to vote:)");

else
System.out.println("You are not eligble to vote:)");






}


}