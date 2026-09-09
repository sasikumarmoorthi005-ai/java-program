class calc{
    public int fact(int a){
        int fac=1;
        
       for(int i=a;i>0;i--){
        fac=fac*i;


       }
       return fac;

    }
}
class factorial{
    public static void main(String[]args){
         int a=5;

         calc obj=new calc();
         int ans=obj.fact(a);
         System.out.println(ans);
    }
}