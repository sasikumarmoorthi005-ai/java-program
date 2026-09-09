class calc{
    public int num(int a){
        
        int result=0;
        while(a>0){
            int rem=a%10;
            int sum=1;
            

            for(int i=rem;i>0;i--){
                
                sum=sum*i;
                
            }
            result=result+sum;
             
            a=a/10;

        }
return result;
    }
}
class peterson_num{
    public static void main(String[]args){

        calc obj=new calc();
        int a=145;
        System.out.println(obj.num(a));
    }
}