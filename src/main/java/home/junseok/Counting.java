package home.junseok;

import java.util.concurrent.atomic.AtomicInteger;

public class Counting {

    public void execute() {
        Count count = new Count();
        AtomicInteger atomicInteger =  new AtomicInteger();
        for (int i = 0; i < 100; i++) {
            new Thread(){
                @Override
                public void run(){
                    for (int j = 0; j < 100; j++) {
                        System.out.println("atomicInteger.incrementAndGet() : " + atomicInteger.incrementAndGet());
                        System.out.println(count.view());
                    }
                }
            }.start();
        }
    }

    class Count {
        private int count;
        public int view() {return count++;}
        public int getCount() {return count;}
    }
}
