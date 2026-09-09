import static java.lang.Math.pow;
class calc{
    public int num(int num){
        int length=String.valueOf(num).length();
        int rem=0;
        int count=length;
        int sum= 0;
        while(num>0){
           
            rem=num%10;
            
           

            
              int val=(int)Math.pow(rem,count);
              sum=sum+val;

                count=count-1;
                 num=num/10;
            
        }
        return sum;

    }
}
class disarium_num{
    public static void main(String args[]){
        calc obj=new calc();
        int num=135;
       System.out.println( obj.num(num));

    }
}