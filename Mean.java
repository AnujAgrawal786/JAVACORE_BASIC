import java.util.Scanner;
class Mean{
public static void main(String args[]){
	int sum = 0;
	Scanner sc =new Scanner(System.in);
	int n;
float mean;
System.out.println("Enter the element of Array");
n=sc.nextInt();
int a[] = new int[n];
for(int i=0;i<n;i++){
	System.out.println("Enter the value of Array a index["+i+"]");
	a[i] = sc.nextInt();
	sum = a[i]+sum;
}
mean=sum/n;
System.out.println("Mean of Aray ="+mean);
}

}

