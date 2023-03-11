public class Person {
    private int vision;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public Person(int vision, String name) {
        this.vision = vision;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "vision=" + vision +
                ", name='" + name + '\'' +
                '}';
    }
}
