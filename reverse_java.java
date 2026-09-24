class reverse_java{
    public static void main(String args[]){
        String name="java full stack";

        String a[]=name.split(" ");
        String out=""+" ";

        for(int i=a.length-1;i>=0;i--){
            out=out+a[i]+" ";
            
        }
        System.out.println(out+" ");
    }
}