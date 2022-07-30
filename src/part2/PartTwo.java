package part2;

public class PartTwo {

    public static void main(String[] args) {

        final CheckingAccount ca = new CheckingAccount(100);

        Runnable r = new Runnable() {

            @Override
            public void run() {

                String name = Thread.currentThread().getName();

                for (int i = 0; i < 10; i++) {
                    System.out.println(name + " withdraws $10: " + ca.withdraw(10));
                }

            }

        };

        Thread thHusband = new Thread(r);

        thHusband.setName("Husband");

        Thread thWife = new Thread(r);

        thWife.setName("Wife");

        thHusband.start();

        thWife.start();


    }


}
