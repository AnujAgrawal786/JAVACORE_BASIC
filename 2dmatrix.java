import java.util.Scanner;
class AddMatrix{
public static void main(String args[]){
	int sum = 0;
	Scanner sc =new Scanner(System.in);
	int n ,k,l,m;
	System.out.println("Enter the element of second Array");
    n=sc.nextInt();
    k=sc.nextInt();
	System.out.println("Enter the element of second Array");
    l=sc.nextInt();
    m=sc.nextInt();
    int a[][] = new int[n][k];
    int b[][] = new int[l][m];
    int c[][] = new int[n][m];
for(int i=0;i<n;i++){
  for(int j=0;j<k;j++){
	System.out.println("Enter the value of First Array a index["+i+"]["+j+"]");
	a[i][j] = sc.nextInt();
	}
}
for(int i=0;i<l;i++){
  for(int j=0;j<m;j++){
	System.out.println("Enter the value of Second Array a index["+i+"]["+j+"]");
	b[i][j] = sc.nextInt();
	}
}

System.out.println("First matrix = ");
for(int i=0;i<n;i++){
  for(int j=0;j<k;j++){
	System.out.print(" "+a[i][j]);
	}
	System.out.println();
}
	System.out.println("---------------");
	System.out.println("Second matrix =");
for(int i=0;i<l;i++){
  for(int j=0;j<m;j++){
	System.out.print(" "+b[i][j]);
	}
	System.out.println("");
}
System.out.println("-------------");
if(l==n&&m==k){
	for(int i=0;i<n;i++){
  for(int j=0;j<m;j++){
	
	c[i][j] = a[i][j]+b[i][j];
	}
	}
}
System.out.println("Sum matrix = ");
for(int i=0;i<l;i++){
  for(int j=0;j<m;j++){
	System.out.print(" "+c[i][j]);
	}
	System.out.println(" ");
}

}

}