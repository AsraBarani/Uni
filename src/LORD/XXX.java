package LORD;

import java.util.concurrent.atomic.AtomicInteger;

public class XXX {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(1);
        for (int i = 0; i < 2; i++) {
            System.out.println(count.getAndIncrement());
        }
    }
}
