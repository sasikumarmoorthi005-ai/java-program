class calc{
    int a;
    int count=0;
    calc(int a){
        this.a=a;
        


    }
    public void prime(){
        for(int i=2;i<a;i++){
            if(a%i==0){
                count=count+1;
            }
        }

        if(count>0){
            System.out.println("not a prime");
        }
        else{
            System.out.println("prime");
        }


    }
}
class maths2{
    public static void main(String args[]){
        calc obj=new calc(7);
        obj.prime();
    }
}