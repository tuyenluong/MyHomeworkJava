package ThreadTap2;

import java.util.Scanner;

public class ThreadContest  extends Thread {

    private int guessNumber = 0;
    private int count = 0;

    public ThreadContest(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * 100 + 1);
            count++;
            System.out.println(getName() + " đoán số " + randomNumber);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (randomNumber != guessNumber);

        System.out.println(getName() + " đã đoán ra số " + guessNumber + " trong " + count + " lần đếm");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số nguyên để các thread đoán: ");
        int number = scanner.nextInt();

        ThreadContest thread1 = new ThreadContest(number);
        ThreadContest thread2 = new ThreadContest(number);
        ThreadContest thread3 = new ThreadContest(number);
        ThreadContest thread4 = new ThreadContest(number);
        ThreadContest thread5 = new ThreadContest(number);

        thread1.setName("Tuyền");
        thread2.setName("VĨ");
        thread3.setName("Dũng");
        thread4.setName("Quy");
        thread5.setName("Phong");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
