import java.util.Scanner;
interface calc{
    abstract void pay(int number,int money);
}
class upi implements calc{
    public void pay(int number,int money){
        int pin=1411;
        if(pin==number){
        System.out.println("money successfully send-"+money+"rs");}
        else{
            System.out.println("wrong pin");
        }
    }
}
class credit implements calc{
    public void pay(int number,int money){
         int pin=2005;
        if(pin==number){
         System.out.println("money successfully send-"+money+"rs");}
        else{
            System.out.println("wrong pin");
        }
      
    }
}
class debit implements calc{
    public void pay(int number,int money){
          int pin=2006;
        if(pin==number){
       System.out.println("money successfully send-"+money+"rs");}
        else{
            System.out.println("wrong pin");
        }

       
    }
}

class payment{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         upi obj1=new upi();
           credit obj2=new credit();
            debit obj3=new debit();
            System.out.println("enter payment method 1.upi /n 2.credit /n 3.debit");
        int choice=sc.nextInt();
         System.out.println("enter cash");
                int money=sc.nextInt();
            

        switch(choice){
            case 1:
                System.out.println("welcome upi payment method");
                    System.out.println("enter upi pin number");
                int number=sc.nextInt();
               
               obj1.pay(number,money);
                break;

        
          case 2:
             System.out.println("welcome credit card payment method");
           
               System.out.println("enter credit number");
             number=sc.nextInt();
              obj2.pay(number,money);
                break;

        
          case 3:
             System.out.println("welcome debit card payment method");
           
               System.out.println("enter debit number");
             number=sc.nextInt();
               obj3.pay(number,money);
                break;

        
        
        }
       
    }
}