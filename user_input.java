import java.util.Scanner;
class input{
    public int add(int a ,int b){
         int c=a+b;
         return c;
    }
     public int sub(int a ,int b){
         int c=a-b;
         return c;
    }
     public int mul(int a ,int b){
         int c=a*b;
         return c;
    }
     public int div(int a ,int b){
         int c=a/b;
         return c;
    }
}

class user_input{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    input obj1=new input();
System.out.println("enter a");
    int a=sc.nextInt();
    System.out.println("enter b");
    int b=sc.nextInt();
 System.out.println("enter choice");
    int choice=sc.nextInt();

    

    if(choice==1){
        System.out.println("add:"+obj1.add(a,b));
    }
    else if(choice==2){
        System.out.println("sub:"+obj1.sub(a,b));

    }
    else if(choice==3){
        System.out.println("mul:"+obj1.mul(a,b));
    }
    else if(choice==4){
        System.out.println("div:"+obj1.sub(a,b));
    }
    else{
        System.out.println("invalid");
    }



    }

}