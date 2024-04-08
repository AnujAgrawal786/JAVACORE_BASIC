import java.util.Scanner;
class cal{
 private float a , b , c ;
public void setData(float a , float b){
this.a=a;
this.b=b;    
}
public void Display(){
	System.out.println("value of a and b"+a+b);
}
public  float add(float a ,float b){
    c=a+b;

	return c;
}
public float sub(float a , float b){
    c=a-b;
	
    return c;
}
public float multi(float a , float b){
    c=a*b;
	
    return c;
}
public float divi(float a,float b){
    c=a/b;
	
    return c;
}
}
class Calculatar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("1:  ADD");
        System.out.println("2:  Subtract");
        System.out.println("3:  Multiply");
        System.out.println("4:  Divide");
        cal ob = new cal();
    System.out.println("Enter the number");
		int n=sc.nextInt();
        float a,b;
        switch (n) {
            case 1:
                System.out.println("Enter The value a: ");
                 a = sc.nextFloat();
                System.out.println("Enter the value of b:");
                 b= sc.nextFloat();
				 ob.setData(a,b);
                float add =ob.add(a,b);
				System.out.println("Add of a and b:"+add);
                break;
            case 2:
            System.out.println("Enter The value a: ");
             a = sc.nextFloat();
            System.out.println("Enter the value of b:");
             b= sc.nextFloat();
            ob.setData(a,b);
			float subs = ob.sub(a,b);
            System.out.println("Subtract="+subs);
            break;
            case 3:
            System.out.println("Enter The value a: ");
            a = sc.nextFloat();
            System.out.println("Enter the value of b:");
            b= sc.nextFloat();
			ob.setData(a,b);
			float mult = ob.multi(a,b);
            System.out.println("Subtract="+mult);
           
            break;
            case 4:
            System.out.println("Enter The value a: ");
                a = sc.nextFloat();
                System.out.println("Enter the value of b:");
                b= sc.nextFloat();
				ob.setData(a,b);
			float divid = ob.divi(a,b);
            System.out.println("Dividation of two number ="+divid);
                
            break;
            default:
                break;
        }





    }
}