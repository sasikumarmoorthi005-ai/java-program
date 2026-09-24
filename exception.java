import java.util.Scanner;
import java.util.*;

class exception{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        calc obj=new calc();

       
try{
    
        int a=sc.nextInt();
        int b=sc.nextInt();
    obj.sub(a,b);

}
catch(InputMismatchException e){
    System.out.println("enter correct value");

}
catch(ArithmeticException e){
      System.out.println("cannot divided by zero ");
}
catch(Exception e){
      System.out.println("something went wrong");

}
    }
}

class calc{
    public void sub(int a,int b){
        try{
         int c=a/b;
        System.out.println(c);
        }
        catch(InputMismatchException e){
    System.out.println("enter correct value");

}
catch(ArithmeticException e){
      System.out.println("cannot divided by zero ");
}
catch(Exception e){
      System.out.println("something went wrong");

}
finally{
    System.out.println("code excecuted");
    
}
    }
}
