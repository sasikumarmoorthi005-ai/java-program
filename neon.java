class calc{
    public int num(int sq){
        int rem=0;
        int sum=0;
        while(sq>0){
            rem=sq%10;
            sum+=rem;
            sq=sq/10;
        }
        return sum;

    }

    public String check(int re,int a){
        String ans="";
        if(re%a==0){
            ans="neon number";
            
        }
        else{
            ans="not neon number";
        }
        return ans;

    }
}
class neon{
    public static void main(String[] args){
        calc obj=new calc();

        int a=9;
        int sq=a*a;

       int re= obj.num(sq);
       System.out.println(obj.check(re,a));
    }
}