import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean nhapso = false;
        while(!nhapso)
        {
            try
            {
                System.out.print("Nhap so n:");
                n = scanner.nextInt();
                if(n <= 0)
                {
                    System.out.println("Vui long nhap so lon hon 0");
                }
                else
                {
                    int tong = 0;
                    for(int i = 0; i <= n; i++)
                    {
                        if(i % 2 == 1)
                        {
                            tong += i;
                        }
                    }
                    System.out.println("Tong cac so le be hon la:" + tong);
                    nhapso = true;
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Vui long nhap so");
                scanner.nextLine();
            }
        }
    scanner.close();
    }
}