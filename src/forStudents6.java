import java.util.Scanner;

public class forStudents6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci sayısını girin: ");
        int ogrenciSayisi = scanner.nextInt();

        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.println("Öğrenci " + i + " bilgileri:");

            System.out.print("Adı: ");
            String ad = scanner.next();

            System.out.print("Soyadı: ");
            String soyad = scanner.next();

            System.out.print("1. Sınav Notu: ");
            int not1 = scanner.nextInt();

            System.out.print("2. Sınav Notu: ");
            int not2 = scanner.nextInt();

            System.out.print("3. Sınav Notu: ");
            int not3 = scanner.nextInt();

            double ortalama = (not1 + not2 + not3) / 3.0;
            System.out.println("Not Ortalaması: " + ortalama);
            System.out.println();
        }

        scanner.close();
    }
}
