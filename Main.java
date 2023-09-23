import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double sum=0.0;

        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=inp.nextInt();

        for(int i=1;i<=n;i++){

            sum=sum+(1.0/i);

        }
        System.out.print("Harmonic Total:" + sum);

    }
}
