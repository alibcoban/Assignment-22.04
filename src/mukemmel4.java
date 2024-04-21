import java.util.Scanner;

public class mukemmel4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi <= 0) {
            System.out.println("Lütfen pozitif bir sayı girin.");
        } else {
            if (isMukemmelSayi(sayi)) {
                System.out.println(sayi + " mükemmel bir sayıdır.");
            } else {
                System.out.println(sayi + " mükemmel bir sayı değildir.");
            }
        }

        scanner.close();
    }

    // Bir sayının mükemmel sayı olup olmadığını kontrol eden metot
    public static boolean isMukemmelSayi(int sayi) {
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        return toplam == sayi;
    }
}

