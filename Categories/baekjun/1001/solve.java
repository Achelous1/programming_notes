import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
        
        System.out.println(a-b);
    }
}