import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        boolean nhapso = false;
        while(!nhapso)
        {
            try
            {
                System.out.print("Nhap canh cua khoi lap phuong:");
                a = scanner.nextInt();
                nhapso = true;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Vui long nhap so");
                scanner.nextLine();
            }
        }

        System.out.println("The tich:" + (int)Math.pow(a,3));
        scanner.close();
    }
}