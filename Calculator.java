import java.io.* ;
class Calculator{
     int a,b,result;
     int op;
     public static void main(String b[]) throws java.io.IOException{  
   //  DataInputStream i =new DataInputStream(i.readLine()) ;
     BufferedReader i= new BufferedReader(new InputStreamReader(System.in)); 
     Calculator obj1 =new Calculator() ;
     System.out.println("enter the first number");
     a=Integer.parseInt(i.readLine());
     System.out.println("enter the 2nd number");
     b=Integer.parseInt(i.readLine());
     System.out.println("enter the operation to do /n 1. for add /n 2. for subtraction /n 3. for div /n 4. for multiplication");
     //op=Charecter.ParseChar(i.readLine());
     op=Integer.parseInt(i.readLine());
     if(op == 1){
     obj1.add(a,b);
     System.out.println("the sum of two numbers is " +result);
     }
     if(op == 2){
     obj1.sub(a,b);
     System.out.println("the difference of two numbers is " +result);
     }
     if(op == 3){
     obj1.div(a,b);
     System.out.println("the division result of two numbers is " +result);
     }
     if(op == 4){
     obj1.mul(a,b);
     System.out.println("the multiplication result of two numbers is " +result);
     }
     }
     public void add(int x ,int y){
     result = (x+y);
     }
     public void sub(int p ,int q){
     result = (p-q);
     }    
     public void div(int c ,int d){
     result = (c/d);
     }
     public void mul(int e ,int f){
     result = (e*f);
     }

}




