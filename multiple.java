class a1{
    public void add(int a,int b){
        int add=a+b;
        System.out.println(add);
    }
}
class a2 extends a1{
    public void sub(int a,int b){
        int sub=a-b;
        System.out.println(sub);
    }
}
class a3 extends a2{
    public void mul(int a,int b){
        int mul=a*b;
        System.out.println(mul);
    }
}
class a4 extends a3{
    public void div(int a,int b){
        int div=a/b;
        System.out.println(div);
    }
}
class multiple{
    public static void main(String args[]){
        a4 obj=new a4();
        int a=23;
        int b=40;
        obj.add(a,b);
         obj.mul(a,b);
          obj.div(a,b);
           obj.sub(a,b);
    }
}