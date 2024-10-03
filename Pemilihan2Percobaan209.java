import java.util.Scanner;

public class Pemilihan2Percobaan209 {
    public static void main(String[] args) {
        Scanner A9 = new Scanner(System.in);

        //INPUT
        int pilihan_menu;
        String member, pembayaran;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = A9.nextInt();
        A9.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = A9.nextLine();
        System.out.print("Apakah pembayaran melalui QRIS (y/n) ? = ");
        pembayaran = A9.nextLine();
        System.out.println("-------------------------------------");

        double harga = 0;
        double harga_bayar;
        double diskon = 0;

        //KONDISI PERTAMA (MEMBER)
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");

            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan menu dengan benar");
                return;
            }

            // Menghitung harga keseluruhan setelah diskon
            harga_bayar = harga - (harga * diskon);

        // KONDISI KEDUA (NON-MEMBER)
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan menu dengan benar");
                return;
            }

            // Menghitung harga keseluruhan tanpa diskon
            harga_bayar = harga;

        } else {
            System.out.println("Member tidak valid");
            return;
        }

        // Pengecekan jika pembayaran dilakukan melalui QRIS
        if (pembayaran.equalsIgnoreCase("y")) {
            System.out.println("Pembayaran melalui QRIS, potongan Rp.1.000");
            harga_bayar -= 1000;  // Mengurangi Rp.1.000 dari total bayar
        }

        System.out.println("Total bayar = " + harga_bayar);
        System.out.println("-------------------------------------");
    }
}
