public class NumberGenerator implements Runnable {
    @Override
    public void run() {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i+this.hashCode()+")");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberGenerator());
        Thread t2 = new Thread(new NumberGenerator());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
