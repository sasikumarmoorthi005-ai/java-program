import java.util.Scanner;
abstract class bank{
   final void rules(){
       System.out.println("Student should have 75% or above marks");
}}
 class SBI extends bank{
    

    public void loan(int mark,int loan_amt){
        if(mark>=70){

            int intrest=loan_amt+((loan_amt/100)*5);
            System.out.println(intrest);

        }
        else{
              System.out.println("not eligible");
                

        }

    }
}
 class canara extends bank{
    

    public void loan(int mark,int loan_amt){
        if(mark>=70){
            int intrest=loan_amt+((loan_amt/100)*10);
            System.out.println(intrest);

        }
        else{
              System.out.println("not eligible");
               

        }

    }
}
 public class loan{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        SBI obj1=new SBI();
         canara obj2=new canara();
System.out.println("enter mark");
        int mark=sc.nextInt();
        System.out.println("enter loan amount");
        int loan_amt=sc.nextInt();
System.out.println("enter choice 1.sbi 2.canara");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                  obj1.rules();
                 obj1.loan(mark,loan_amt);
                
              
                 break;

                 case 2:
                     obj2.rules();
                     obj2.loan(mark,loan_amt);
                   
                     break;


        }
       
       
    }
}