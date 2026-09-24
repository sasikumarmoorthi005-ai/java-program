import java.util.Scanner;

class stringex{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

    System.out.println("enter first name");
    String first=sc.nextLine();
       System.out.println("enter first name");
         String last=sc.nextLine();

         if(first.length() >3 && last.length() >3){
            if(first.equals(last)){
                System.out.println("first name and last name both are equal ");
            }
            else{
                System.out.println(first.concat(last));
            }

         }
         else{
             System.out.println("enter greater than 3 ");
         }
    }
}