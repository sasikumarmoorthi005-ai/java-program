import java.util.Scanner;
abstract class  bank{
    abstract void check();
     abstract void withdraw(int numb);
     abstract void deposit(int num);


}

class SBI extends bank{
    int balance=10000;
    public void check(){
        System.out.println(balance);
    }
    public void withdraw(int numb){
    
        if(numb<balance){
             balance=balance-numb;
              System.out.println(balance);

        }
        else{
 System.out.println("insufficient balance");
        }
       
       
    }
    public void deposit(int num){
        int number=num;
        if(number>0){
            System.out.println(balance=number+balance);
        }
        else{
            System.out.println("enter valid number");
        }
    }
}
class ATM{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        SBI obj =new SBI();

       
while(true){
    System.out.println("check or withdraw or deposit");
     String val=sc.nextLine();
        if(val.equals("check")){
            obj.check();
        }
        else if(val.equals("withdraw")){
            System.out.println("enter a withdraw amount");
            int numb=sc.nextInt();
            sc.nextLine();
            obj.withdraw(numb);
        }
        else if(val.equals("deposit")){
            System.out.println("enter a deposit amount");
             int num=sc.nextInt();
              sc.nextLine();
            obj.deposit(num);
        }
        else if(val.equals("cancel")){
            break;
        }
        
    }}
}