public class stringMethods5 {
    public static void main(String[] args) {
        String str = "Merhaba";
        // 1. length()
        int uzunluk = str.length();
        System.out.println("Uzunluk: " + uzunluk);

        // 2. charAt(int index)
        char karakter = str.charAt(2);
        System.out.println("3. Karakter: " + karakter);

        // 3. substring(int beginIndex, int endIndex)
        String altDize = str.substring(2, 5);
        System.out.println("3. ve 5. Aralıktaki Alt Dize: " + altDize);

        // 4. toUpperCase()
        String buyukHarfli = str.toUpperCase();
        System.out.println("Büyük Harfli: " + buyukHarfli);

        // 5. toLowerCase()
        String kucukHarfli = str.toLowerCase();
        System.out.println("Küçük Harfli: " + kucukHarfli);

        // 6. indexOf(String str)
        int indeks = str.indexOf("ha");
        System.out.println("İndeks: " + indeks);
    }
}