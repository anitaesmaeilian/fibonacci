import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int prepre=1,pre=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] fibo = new int[n][];
        for (int i=0,j=n;i<n;i++,j--)
            fibo[i] = new int[j];
        for(int i=0 ; i<n ; i++)
        {
            fibo [0][i] = prepre;
            System.out.printf("%d ",fibo[0][i]);
            int next=pre+prepre;
            prepre=pre;
            pre=next;
        }
    }
}
