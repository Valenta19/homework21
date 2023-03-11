import java.util.function.Predicate;

public class PersonVisionPredicate implements Predicate<Person> {
    private static final int PERSON_VISION = 0;
    @Override
    public boolean test(Person person) {
        return person.getVision() >= PERSON_VISION;
    }
}
