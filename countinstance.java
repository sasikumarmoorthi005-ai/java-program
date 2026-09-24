class a{
    int id;
    String name;
    static int count=0;
    
    public void a(int id,String name){
        this.name=name;
        this.id=id;
        count++;
        System.out.println(count);

    }
    public void display(){
            System.out.println("count:"+count);

    }
    
}
class countinstance{
    public static void main(String args[]){
        a obj=new a();

        String name="sasi";
        int id=30;

        obj.a(id,name);
        obj.a(id,name);
        obj.a(id,name);
        obj.a(id,name);
        obj.a(id,name);
        obj.display();
        
    }
}