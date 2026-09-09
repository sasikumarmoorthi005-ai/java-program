class A{
 public void add(int a,int b){


return a+b;
}

public void sub(int a,int b)
{


return a-b;

}

public void div(int a,int b)
{

return a/b;

}
public void mul(int a,int b)
{


return a*b;

}


}

class return{
public static void main(String args[]){

A obj=new A();

int a=20;
int b=50;

int x=obj.add(a,b);
int y=obj.mul(a,b);
int z=obj.div(a,b);
int r=obj.sub(a,b);

System.out.println("addition"+x);
System.out.println("subtraction"+r);
System.out.println("multiplication"+y);
System.out.println("division"+r);

}
}