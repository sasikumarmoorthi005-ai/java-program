import java.util.Scanner;
class add{
    public void me(int arr1[],int arr2[]){
        int a=arr1.length;
        int b=arr2.length;
        
        int merge1[]=new int[a+b];
        int k=0;

        for(int i=0;i<merge1.length;i++){
            if(i<arr1.length){
                merge1[i]=arr1[i];
            }
            else{
                merge1[i]=arr2[k];
                k++;
            }


    }

    for(int j=0;j<merge1.length;j++){
       

        System.out.print(merge1[j]);
    }

}}
class merge{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        add obj=new add();

        int arr1[]=new int[5];
        int arr2[]=new int[5];

        for(int i=0;i<arr1.length;i++){
            System.out.println("value of array 1");
            arr1[i]=sc.nextInt();
        }
        for (int j=0;j<arr2.length;j++){
             System.out.println(arr2[j]+"value of array 2");
            arr2[j]=sc.nextInt();
        }

obj.me(arr1,arr2);

    }
}