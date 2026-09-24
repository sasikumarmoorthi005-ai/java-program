class longest{
    public static void main(String args[]){
        String name="sasi kumar sasikumar";

        String nm[]=name.split(" ");
        String longest=nm[0];

        for(int i=1;i<nm.length;i++){
            if(nm[i].length()>longest.length()){
                longest=nm[i];
            }
            }

            System.out.println(longest);
            }
        }
 