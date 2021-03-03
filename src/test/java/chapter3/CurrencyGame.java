package chapter3;

import java.util.Scanner;

public class CurrencyGame {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int soTienCanThiet = 500000;

        System.out.println("Bạn muốn bao nhiêu tờ 10 ngàn đồng: ");
        int muoiNgan = scanner.nextInt();

        System.out.println("Bạn muốn bao nhiêu tờ 20 ngàn đồng: ");
        int haiMuoiNgan = scanner.nextInt();

        System.out.println("Bạn muốn bao nhiêu tờ 50 ngàn đồng: ");
        int namMuoiNgan = scanner.nextInt();

        System.out.println("Bạn muốn bao nhiêu tờ 100 ngàn đồng: ");
        int motTram = scanner.nextInt();

        System.out.println("Bạn muốn bao nhiêu tờ 200 ngàn đồng: ");
        int haiTram = scanner.nextInt();

        scanner.close();

        int tongThucTe = (10000 * muoiNgan) + (20000 * haiMuoiNgan) + (50000 * namMuoiNgan) + (100000 * motTram) +
                (200000 * haiTram);

        if (tongThucTe < soTienCanThiet){
            System.out.println("Nhỏ hơn " + (soTienCanThiet-tongThucTe) + " so với 500.000 đồng.");

        }
        else if (tongThucTe > soTienCanThiet){
            System.out.println("Lớn hơn " + (tongThucTe-soTienCanThiet) + " so với 500.000 đồng.");
        }
        else {
            System.out.println("Win the game. Bằng 500000");
        }
    }
}
