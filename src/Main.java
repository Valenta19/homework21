import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        List<Person> list = Arrays.asList(
                new Person(1, "Александр"),
                new Person(2, "Татьяна"),
                new Person(-2, "Вадим"),
                new Person(-1, "Михаил"));
        Predicate<Person> personPredicate = new PersonVisionPredicate();
        for (Person person : list) {
            if (personPredicate.test(person)) {
                System.out.println(person);
            }

        }
       Predicate<Person> predicate = person -> person.getVision() >= 0;
        for (Person person : list) {
            if (predicate.test(person)) {
                System.out.println(person);
            }
        }
        System.out.println("Задание 2");
        Consumer<Person> personConsumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println("Привет " + person.getName());
            }

        };
        for (Person person1 : list) {
            personConsumer.accept(person1);
        }
        Consumer<Person> consumer = (person) -> System.out.println("Hi " + person.getName());
        for (Person person1 : list) {
            consumer.accept(person1);
        }
        System.out.println("Задание 3");
        Temperature temperature1 = new Temperature(12.3);
        Temperature temperature2 = new Temperature(35.8);
        Temperature temperature3 = new Temperature(38.9);
        List<Temperature> temperatures = new  ArrayList<>();
        temperatures.add(temperature1);
        temperatures.add(temperature2);
        temperatures.add(temperature3);

        Function<Temperature, Long> function = new Function<Temperature, Long>() {

            @Override
            public Long apply(Temperature temperature) {
                return (long) temperature.getTemperature();


            }
        };
        for (Temperature temperature : temperatures) {
            System.out.println(function.apply(temperature));
        }
        Function<Temperature, Long> function1 = temperature12 ->{
return (long) temperature12.getTemperature();
        };
        for (Temperature temperature12  : temperatures) {
            System.out.println(function1.apply(temperature12));

        }
        System.out.println("Задание 4");
        Supplier<Integer> numberSupplierSupplier = new NumberSupplier();
        System.out.println(numberSupplierSupplier.get());

        Supplier<Integer> random = () -> new Random().nextInt(100);
        System.out.println(random.get());
    }
}