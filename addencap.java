import java.util.Scanner;
class a{
    private int num1;
    private int num2;

    public void setNum1(int num1){
        if(num1>=0){
 this.num1=num1;
        }
      

    }
    public void setNum2(int num2){
        if(num2>=0){
              this.num2=num2;

        }
         
       
        
    }
    public int getNum1(){
        return num1;
        
    }
    public int getNum2(){
        return num2;
        
    }
}
class a2 extends a{
    
    public void display(int x,int y){
        System.out.println("addition:"+(x+y));
    }


}
class addencap{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        a2 obj=new a2();
        int a=sc.nextInt();
        int b=sc.nextInt();
        obj.setNum1(a);
          obj.setNum2(b);
          int x=obj.getNum1();
          int y=obj.getNum2();
          obj.display(x,y);
          
        
    }
}