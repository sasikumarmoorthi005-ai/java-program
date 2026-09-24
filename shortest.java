class shortest{
    public static void main(String args[]){
        String name="sasi kumar hi sasikumar";

        String nm[]=name.split(" ");
        String srt=nm[0];

        for(int i=1;i<nm.length;i++){
            if(nm[i].length()<srt.length()){
                srt=nm[i];
            }
            }

            System.out.println(srt);
            }
        }
 