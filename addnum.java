class A{
 public int add(){

int a=20;
int b=30;
System.out.println("Addition:"+(a+b));
}

public void sub()
{
int a=20;
int b=50;

System.out.println("multiplication:"+(a-b));

}

public void div()
{
int a=20;
int b=50;

System.out.println("division:"+(a/b));

}
public void mul()
{
int a=20;
int b=50;

System.out.println("multiplication:"+(a*b));

}


}

class addnum{
public static void main(String args[]){

A obj=new A();

obj.add();
obj.mul();
obj.div();
obj.sub();
}
}