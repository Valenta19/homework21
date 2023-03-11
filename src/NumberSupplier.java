import java.util.Random;
import java.util.function.Supplier;

public class NumberSupplier implements Supplier<Integer> {
    @Override
    public Integer get() {
        Random random = new Random();
        int number = random.nextInt(100);
        return number;
    }
}
