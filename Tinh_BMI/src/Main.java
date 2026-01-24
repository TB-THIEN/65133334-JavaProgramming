import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap can nang (kg): ");
        double cannang = scanner.nextDouble();

        System.out.print("Nhap chieu cao (m): ");
        double chieucao = scanner.nextDouble();

        if (chieucao > 0 && cannang > 0) {
            double bmi = cannang / Math.pow(chieucao, 2);
            System.out.printf("BMI: %.2f\n", bmi);

            if (bmi < 18.5)
            {
                System.out.println("Danh gia: Gay");
            }
            else if (bmi < 25)
            {
                System.out.println("Danh gia: Binh thuong");
            }
            else if (bmi < 30)
            {
                System.out.println("Danh gia: Thua can");
            }
            else
            {
                System.out.println("Danh gia: Beo phi");
            }
        }
        else
        {
            System.out.println("Du lieu nhap vao khong hop le (phai > 0)!");
        }
        scanner.close();
    }
}