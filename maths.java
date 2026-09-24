class a{
    int x;
    int y;
    a(int num,int num2){
        x=num+num2;
        y=num-num2;

    }
    public void mul(){
        System.out.println(x*y);
    }
}
class maths{
    public static void main(String[]args){
        a obj=new a(3,6);
        obj.mul();
    }
}