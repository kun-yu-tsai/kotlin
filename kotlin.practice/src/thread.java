public class thread{
    public static void main(String[]args)
    {
//        joinTest();
        interruptThread();
    }

    private void threadTest(){
        Runnable runnable = new MySecondRunnable();
        for(int i = 0; i <= 25; i++){
            Thread thread = new Thread(runnable);
            thread.setName("Thread " + i);
            thread.start();
        }
    }

    private static void interruptThread(){
        Thread thread1 = new Thread(new BetterRunnable());

        thread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt();
    }

    private static void joinTest(){
        Thread thread2 = new Thread(new WaitRunnable());
        thread2.setName("Thread 2");
        Thread thread3 = new Thread(new WaitRunnable());
        thread3.setName("Thread 3");

        System.out.printf("Current time millis : " + System.currentTimeMillis() + " %s\n", Thread.currentThread().getName());

        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Current time millis : " + System.currentTimeMillis() + " %s\n", Thread.currentThread().getName());

        thread3.start();

        try {
            thread3.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Current time millis : " + System.currentTimeMillis() + " %s\n", Thread.currentThread().getName());
    }

    public static class MySecondRunnable implements Runnable{
        @Override
        public void run() {
            System.out.printf("I'm running in thread %s \n", Thread.currentThread().getName());
        }
    }

    private static class WaitRunnable implements Runnable {
        @Override
        public void run() {
            try {
                System.out.printf("Thread start. Current time millis : " + System.currentTimeMillis() + " %s\n", Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.printf("Thread end. Current time millis : " + System.currentTimeMillis() + " %s\n", Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class UglyRunnable implements Runnable {
        @Override
        public void run() {
            while(!Thread.currentThread().isInterrupted()){
                //Heavy operation
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("The thread is interrupted : " + Thread.currentThread().isInterrupted());
                }
                //Other operation
            }
        }
    }

    public static class BetterRunnable implements Runnable {
        @Override
        public void run() {
            while(!Thread.currentThread().isInterrupted()){
                //Heavy operation
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("The thread is interrupted : " + Thread.currentThread().isInterrupted());
                    Thread.currentThread().interrupt();
                    System.out.println("The thread is interrupted : " + Thread.currentThread().isInterrupted());
                }
                //Other operation
            }
        }
    }

    private static class WaitRunnable2 implements Runnable {
        @Override
        public void run() {
            System.out.println("The thread is interrupted : " + Thread.currentThread().isInterrupted());
            System.out.println("Current time millis : " + System.currentTimeMillis());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("The thread has been interrupted");
                System.out.println("The thread is interrupted : " + Thread.currentThread().isInterrupted());
            }

            System.out.println("Current time millis : " + System.currentTimeMillis());
        }
    }
}