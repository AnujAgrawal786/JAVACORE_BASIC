import java.util.Scanner;
class Odd{
public static void main(String args[]){
int n;

Scanner sc = new Scanner(System.in);
System.out.println("enter the element of array");
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
System.out.println("Enter the element in array a index["+i+"]");
a[i]=sc.nextInt();

}
for(int i=0;i<n;i++){
	if(a[i]%2!=0)
		System.out.println("odd no."+a[i]);
}
}
}