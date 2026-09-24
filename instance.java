class A{
    int a;
    int b;
    A(int a ,int b){
        this.a=a;
        this.b=b;
        }
        public void add(){
            System.out.println(a+b);
        }
        public void sub(){
            System.out.println(a-b);
        }
        public void mul(){
            System.out.println(a*b);
        }
        public void div(){
            System.out.println(a+b);
        }
}
class instance{
    public static void main(String[]args){
        A obj=new A(5,7);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();

    }
}