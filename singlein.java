class a1{
    public void add(int a,int b){
        int add=a+b;
        
           System.out.println(add);
       

    }
    public void sub(int a,int b){
       
        int sub=a-b;
         
         System.out.println(sub);

    }

}
class a2 extends a1{
     public void mul(int a,int b){
        int mul=a*b;
        
        System.out.println(mul);
       
        
    }
     public void div(int a,int b){
        
        int div=a/b;
       
         System.out.println(div);
        
    }

}
class singlein{
    public static void main(String args[]){
         a2 obj=new a2();
        int a=20;
        int b=30;
        obj.add(a,b);
        obj.sub(a,b);
        obj.mul(a,b);
        obj.div(a,b);
       
        
       

    }
}
