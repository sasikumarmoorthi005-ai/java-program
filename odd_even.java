class calc{
    public void num(int num){
        if (num%2==0){
            System.out.println("even");
        }
        else{
             System.out.println("odd");

        }
        

    }
}
class odd_even{
    public static void main(String[] args){
        calc obj=new calc();
        int num=5;
     obj.num(num);
    }
}