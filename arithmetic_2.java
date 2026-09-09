import java.util.Scanner;
class calculate{
    public int add(int a,int b){
        return a+b;
    }
     public int sub(int a,int b){
        return a-b;
    }
     public int mul(int x,int y){
        return x*y;
    }
     public int div(int x,int y){
        return x/y;
    }
    
}

class arithmetic_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        calculate obj=new calculate();
        System.out.println("enter a");
        
        int a=sc.nextInt();
          System.out.println("enter b");
         int b=sc.nextInt();

        int x=obj.add(a,b);
        int y=obj.sub(a,b);

        int mult=obj.mul(x,y);
        int divi=obj.div(x,y);

        System.out.println("add:"+x);
           System.out.println("sub:"+y);
              System.out.println("mul:"+mult);
                 System.out.println("div:"+divi);

    }
}