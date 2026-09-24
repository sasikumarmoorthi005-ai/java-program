import java.util.Scanner;
class voterexception{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
        int age=sc.nextInt();

        if(age>18){
            System.out.println("you are eligible to vote");
        }
        else{
            throw new invalid(" not eligible" );
        }
    
        }
        catch(Exception e){
            System.out.println(e);

        }
        
        }
    }
class invalid extends Exception{
    public invalid(String msg){
        super(msg);
    }
}