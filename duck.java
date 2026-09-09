import java.util.Scanner;
class calc{
    public String num(int a){
        int count=0;
        while(a>0){
            

            int rem=a%10;
            if(rem==0){
                count+=1;
            }
            a=a/10;
        }


          String ans="";

        if(count>0){
            ans="duck number";

        }
        else{
            ans="not duck";
        }
        return ans;
        
        }
      

    }

class duck{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        calc obj=new calc();
        int a=sc.nextInt();
       String answer= obj.num(a);

       System.out.println(answer);
    }
}