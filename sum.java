class calc{
    int a;
    int sum;
    int product;
    calc(int a){
        this.a=a;
        
         sum=0;
         product=1;

    }

    public void sum(){
        while(a>0){
            int rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        
    }

    public void product(){
         while(a>0){
            int rem=a%10;
            product=product*rem;
            a=a/10;
        }

    }

    public void  check(){
        if(sum==product){
            System.out.println("spy");
        }
        else{
              System.out.println("not spy");

        }
    }
}
class sum{
    public static void main(String[]args){
         int a=10;
        calc obj=new calc(a);
        obj.check();
       
        
    }
} 



