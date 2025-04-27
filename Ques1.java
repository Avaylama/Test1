import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        

        for (int i = 0; i * i <= num; i++) {
            if (i * i == num) {
                System.out.println(num + " is a perfect square.");
                return;
            } 
            
            
        }
        System.out.println(num + " is not a perfect square.");
        
        sc.close();
    }
}
