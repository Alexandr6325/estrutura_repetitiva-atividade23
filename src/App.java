import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        System.out.println("Seus divisores sao:");

        for (int i=1; i<=n; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
