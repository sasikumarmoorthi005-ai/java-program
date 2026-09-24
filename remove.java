class remove{
    public static void main(String args[]){
        String name="sasi kumar";

    String nm[]=name.split(" ");
    
    String out="";

    for(int i=0;i<nm.length;i++){
        out+=nm[i];
    }

    System.out.print(out);
    }
}