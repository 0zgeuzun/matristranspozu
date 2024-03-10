import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matris boyutlarını kullanıcıdan al
        System.out.print("Matris satır sayısını girin: ");
        int satir = scanner.nextInt();

        System.out.print("Matris sütun sayısını girin: ");
        int sutun = scanner.nextInt();

        // Matrisi kullanıcıdan al
        int[][] matris = new int[satir][sutun];
        System.out.println("Matris elemanlarını girin:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matris[i][j] = scanner.nextInt();
            }
        }

        // Transpoz matrisi oluştur
        int[][] transpozMatris = new int[sutun][satir];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        // Matrisi ekrana yazdır
        System.out.println("Matris:");
        matrisiYazdir(matris);

        // Transpoz matrisi ekrana yazdır
        System.out.println("Transpoz:");
        matrisiYazdir(transpozMatris);
    }

    // Matrisi ekrana yazdırmak için yardımcı fonksiyon
    public static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
    }
}