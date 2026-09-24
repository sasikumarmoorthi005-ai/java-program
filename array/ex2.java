import java.util.Scanner;

class cal {
    public void me(int n, int a, Scanner sc) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == a) {
                System.out.println("index " + i);
                return;
            }
        }

        System.out.println("-1");
    }
}

class ex2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int n = sc.nextInt();
        System.out.println("enter value");
        int a = sc.nextInt();

        cal obj = new cal();
        obj.me(n, a, sc);
    }
}