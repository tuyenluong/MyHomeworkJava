/*package ThreadTap1;

import java.util.Scanner;

public class Thread1 extends Thread {

    private int count = 0;
    private boolean isStop = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đợi người dùng nhấn một phím để bắt đầu
        System.out.println("Nhấn phím bất kỳ để quay số");
        scanner.nextLine();

        // Khai báo & Khởi chạy CountTheNumberThread như là một Thread thông qua
        // phương thức start()
        Thread1 countingThread = new Thread1();
        countingThread.start();

        // Đợi người dùng nhấn một phím để kết thúc
        System.out.println("Nhấn phím bất kỳ để kết thúc quay số");
        scanner.nextLine();
        scanner.close();

        // Ngừng Thread và xem hiện đang "quay" tới số nào
        countingThread.end();
        System.out.println("Con số may mắn: " + countingThread.getCount());
    }
    @Override
    public void run() {
        while(!isStop) {
            count++;
            if (count > 100) {
                count = 0;
            }
        }
    }
    public void end() {
        isStop = true;
    }

    public int getCount() {
        return count;
    }
}
*/