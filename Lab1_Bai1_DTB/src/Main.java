import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten:");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap diem trung binh:");
        Double dtb = scanner.nextDouble();

        System.out.println("Ho ten:" + hoTen);
        System.out.println("Diem trung binh:" + dtb);
        scanner.close();
    }
}