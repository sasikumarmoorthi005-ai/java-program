class calc{
    public int num(int a){
        int rev=0;
        while(a>0){
            int rem=a%10;
            rev=rev*10+rem;
            a=a/10;

        }
return rev;
    }

    public String check(int a2,int r2){
        int ch=0;
        while(r2>0){
            int rem=r2%10;
            ch=ch*10+rem;
            r2=r2/10;
        }
String answer="";
        if(ch==a2){
            answer="adam number";
        }
        else{
             answer="not adam number";

        }
    return answer;

        


    }
}
class adam{
    public static void main(String args[]){
        calc obj=new calc();

        int a=14;
int re=(obj.num(a));

    int a2=(int)Math.pow(a,2);
        int r2=(int)Math.pow(re,2);
        String ans=obj.check(a2,r2);
        System.out.println(ans);
        
    }
}