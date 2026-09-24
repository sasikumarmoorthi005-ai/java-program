class cons{
    cons(){
        System.out.println("this is constructor");
    }
    public String greet(String a){
        return "welcome"+a;
    }
}
class greetings{
    public static void main(String[]args){
        cons obj=new cons();
        String a="sasi";
        
         System.out.println(obj.greet(a));
    }
}