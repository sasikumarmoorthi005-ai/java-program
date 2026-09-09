class calculate{
    public int reverse(int a){
        int reverse=0;
        int rem=0;
        int rev=0;
        while(a>0){
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;


        }
        return rev;

    }

    public String check(int a,int b){
        String ans="";
        if(a==b){
            ans="palindrome";
        }
        else{
            ans="not palindrome";
        }
return ans;
    }
}
class palindrome{
    public static void main(String[] args){

        calculate obj=new calculate();
        int a=56;
        int b=obj.reverse(a);
        System.out.println(b);
        String c=obj.check(a,b);
        System.out.println(c);
    }
}