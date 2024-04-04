import java.util.Scanner;
class MaxMin{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);

int max =0;
System.out.println("Enter the size of Array");
int n = sc.nextInt();
int a[] = new int[n]; 
int min =a[0];
for(int i=0;i<n;i++){
System.out.println("Enter the value of array a index["+i+"]");
a[i]=sc.nextInt();

if(a[i]>max)
max=a[i];
if(a[i]<min)
min = a[i];
}
min=max;
for(int i=0;i<n;i++){
if(a[i]<min)
min = a[i];
}
System.out.println("The max number of Array is"+max);
System.out.println("The min number of Array is"+min);




}
}