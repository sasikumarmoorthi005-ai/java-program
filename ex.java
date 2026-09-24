import java.util.Scanner;
class ex{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String name="sasikumar";
        System.out.println("enter character");
        String a=sc.nextLine();
        int count=0;
        

        for(int i=name.length()-1;i>=0;i--){
            if(a.equals(String.valueOf(name.charAt(i)))){
                count++;
            }

        }
        System.out.println(a +"number of count is"+count);

    }
}