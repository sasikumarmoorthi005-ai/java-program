class calculate{
    public int sum(int a){
        int sum=0;
        while(a>0){
            int rem=a%10;
            a=a/10;
            sum+=rem;
            

        }
        return sum;
        

    }
    public int product(int a){
         int sum=1;
        while(a>0){
            int rem=a%10;
            a=a/10;
            sum=sum*rem;

    }
    return sum;

}
public int spynum(int x,int y,int a){
     int spy=x+y;
    if(spy==a){
        System.out.println("spy number");
    }
    else{
          System.out.println("not spy number");
    }
    return spy;

}
}
class spy_number{
    public static void main(String args[]){

        calculate obj=new calculate();
        int a=59;
        int x=obj.sum(a);
        int y=obj.product(a);
        System.out.println(x);
        System.out.println(y);
       
obj.spynum(x,y,a);

    }
}