import java.util.Scanner;
interface a1{
    abstract void  add(int a,int b);
    abstract void sub(int a,int b);

    default void mul(int a,int b){
      
        System.out.println(a*b);
    }

    static void div(int a,int b){
        
        System.out.println(a/b);

    }
}
class imple implements a1{
   public void add(int a,int b){
        System.out.println(a+b);
    }
     public void sub(int a,int b){
        System.out.println(a-b);
    }

}

class interex{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        imple obj=new imple();

        System.out.println("enter two value");
        int a=sc.nextInt();
        int b=sc.nextInt();

        obj.add(a,b);
         obj.sub(a,b);
         obj.mul(a,b);
          a1.div(a,b);

        
    }
}