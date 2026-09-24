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
public String check(int prime,int a){
    int count=0;
    for(int i=2;i<prime;i++){
        if(prime%i==0){
            count+=1;

        }
    }
    int count1=0;
     for(int j=2;j<a;j++){
        if(a%j==0){
            count+=1;

        }
    }
String answer="";
    if(count>1 && count1>1){
        answer="not empire number";

    }
    else{
        answer=" empire number";
    }

    return answer;

}

}
class empire{
    public static void main(String args[]){
        calc obj=new calc();
        int a=13;
       int prime= obj.num(a);
       String ans=obj.check(prime,a);
       System.out.println(ans);
    }
}