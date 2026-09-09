import java.util.Scanner;
class name{
    public String name(String a,String b){
        return a+b;

    }
}
class full_name{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        name obj=new name();

        String a=sc.nextLine();
         String b=sc.nextLine();
         System.out.println(obj.name(a,b));



    }
}