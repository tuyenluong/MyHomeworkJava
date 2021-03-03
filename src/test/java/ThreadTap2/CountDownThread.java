package ThreadTap2;

public class CountDownThread extends Thread { //or you can use implements Runnable

    @Override
    public void run() {
        int count = 10;
        for (int i = count; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Hết giờ");
    }
    public static void main(String[] args) {
        CountDownThread countDownThread = new CountDownThread();
        countDownThread.start();
    }
}
