package GoodJob.Lesson22_GoodJob;

public class Person {
    final String pol;

    public Person(String pol) {
        this.pol = pol;
    }
    // clever - умный
    private boolean clever;
    public boolean isClever() {
        return clever;
    }

    // name - имя
    private StringBuilder name;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder s) {
        name = s;
    }

    // age - возраст
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int i) {
        if (i > 0) {
            age = i;
        }
    }

    // weight - вес
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int i) {
        if (i > 0) {
            weight = i;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Person p = new Person("Man");
        p.setName(new StringBuilder("Nikita"));
        p.getName().append("!!!!!!");
        System.out.println(p.getName());
    }
}
