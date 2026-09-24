class a1{
    final void name(int a){
        System.out.println(a+a);

    }
   

}
class a2 extends a1{
     public void name(int a){
        System.out.println(a*a);
        
    }

}
class finalkey{
    public static void main(String args[]){
        a2 obj=new a2();
        int a=30;
        obj.name(a);

    }
}