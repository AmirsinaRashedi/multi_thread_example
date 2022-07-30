package part1;

public class IntSleep {

    public static void main(String[] args) {

        Runnable backgroundThreadRun = () -> {

            int count = 0;

            while (true) {

                try {

                    System.out.println(++count + "- Hello");

                    Thread.sleep(100);

                } catch (InterruptedException e) {

                    return;

                }

            }

        };

        Thread backgroundThread = new Thread(backgroundThreadRun);

        backgroundThread.start();

        try {

            Thread.sleep(2000);

        } catch (InterruptedException ignored) {

        }

        backgroundThread.interrupt();


    }


}
