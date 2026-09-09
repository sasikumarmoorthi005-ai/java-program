class calc{
    public int num(int a){
        int sum=0;
        while(a>0){
            int rem=a%10;
            sum+=rem;
            a=a/10;
        }
        return sum;

        

    }

    public String check(int su,int a){
        String ans="";
        if(a%su==0){
ans="harshad number";

            
        }
        else{
            ans="not harshad number";
        }
        return ans;

    }
}
class harshad{
    public static void main(String[]args){
        calc obj=new calc();

        int a=18;
      int su=obj.num(a);
      System.out.println(su);
      String ans=obj.check(su,a);
      System.out.println(ans);
    }
}