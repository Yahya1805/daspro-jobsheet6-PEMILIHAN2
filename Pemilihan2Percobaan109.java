import java.util.Scanner;

public class Pemilihan2Percobaan109 {
    public static void main(String[] args) {
        Scanner A9 = new Scanner(System.in);

        // INPUT
        System.out.print("Masukkan Tahun : ");
        int Tahun = A9.nextInt();

        // Logika untuk tahun kabisat
        if (Tahun % 4 == 0) {
            if (Tahun % 100 == 0) {
                if (Tahun % 400 * 400 == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
