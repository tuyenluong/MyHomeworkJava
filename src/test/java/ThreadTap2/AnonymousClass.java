package ThreadTap2;

public class AnonymousClass { //Extends from Thread
    public static void main(String[] args) {
        Thread countDownThread = new Thread(() -> {
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
        });
        countDownThread.start();
    }
}
