import java.util.Scanner;
class a1{
    public int add(int a,int b){
        return a+b;
    }

}
class a2 extends a1{
    public int sub(int a,int b){
        return a-b;
    }
    
}
class a3 extends a1{
    public int mul(int x,int y){
        return (x*y);
    }
    
}
class a4 extends a1{
     public int div(int x,int y){
      return (x/y);
    }
    
}
class hierarical{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        a2 obj1=new a2();
                a3 obj2=new a3();
                        a4 obj3=new a4();
        int a=sc.nextInt();
         int b=sc.nextInt();

         int x=obj1.add(a,b);
         int y=obj1.sub(a,b);
         

         int num=sc.nextInt();

         if(num==1){
            System.out.println(x);
         }
         else if(num==2){
            System.out.println(y);
         }
         else if(num==3){
             System.out.println(obj2.add(x,y));
            System.out.println(obj2.mul(x,y));
         }
         else if(num==4){
             System.out.println(obj3.add(x,y));
            System.out.println(obj3.div(x,y));

         }


    }
    
}