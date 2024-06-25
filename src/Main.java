import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int prepre=1,pre=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] fibo = new int[n][];
        for (int i=0,j=n;i<n;i++,j--)
            fibo[i] = new int[j];

        // prints the first n fibonacci numbers
        for(int i=0 ; i<n ; i++)
        {
            fibo [0][i] = prepre;
            System.out.printf("%d ",fibo[0][i]);
            int next=pre+prepre;
            prepre=pre;
            pre=next;
        }

        // prints the difference of the numbers of the previous line until there is no more numbers left
        System.out.println();
        int z=n;
        for (int j = 0 ; j<=z ; j++)
        {
            for (int i = 0; i < n-1; i++)
            {
                int difference;
                if (fibo[j][i] > fibo[j][i+1])
                    difference = fibo[j][i] - fibo[j][i+1];
                else
                    difference = fibo[j][i+1] - fibo[j][i];
                fibo[j+1][i] = difference;
                System.out.printf("%d ", fibo[j+1][i]);
            }
            n--;
            System.out.println();
        }
    }
}
