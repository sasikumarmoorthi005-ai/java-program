class A{
 public void add(int a,int b){


System.out.println("Addition:"+(a+b));
}

public void sub(int a,int b)
{


System.out.println("subtraction:"+(a-b));

}

public void div(int a,int b)
{

System.out.println("division:"+(a/b));

}
public void mul(int a,int b)
{


System.out.println("multiplication:"+(a*b));

}


}

class arithmetic{
public static void main(String args[]){

A obj=new A();

int a=20;
int b=50;

obj.add(a,b);
obj.mul(a,b);
obj.div(a,b);
obj.sub(a,b);
}
}