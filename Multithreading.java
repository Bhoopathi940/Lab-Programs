
/* 4. Write a Java Program to implement the concept of multithreading with the use of any three
multiplication tables and assign three different priorities to them.*/

public class Multithreading extends Thread {
    int tanum, limit;

    Multithreading(int tanum, int limit) {
        this.tanum = tanum;
        this.limit = limit;
    }

    public void run() {

        for (int i = 1; i <= limit; i++) {
            if (i == 1)
                System.out.println("Table " + tanum + "  Start \n........................................");
            System.out.println(i + " x " + tanum + " = " + (tanum * i));
            if (i == 10)
                    System.out.println("Table " + tanum + "  End\n........................................");
            try {
                    Thread.sleep(1000);
            } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public static void main (String[]args){

            System.out.println(" Multithreading \n ******************************");
            Multithreading t1 = new Multithreading(2, 10);
            Multithreading t2 = new Multithreading(3, 10);
            Multithreading t3 = new Multithreading(4, 10);
            t1.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.NORM_PRIORITY);
            t3.setPriority(Thread.MIN_PRIORITY);
            t1.start();
            t2.start();
            t3.start();
        }
    }