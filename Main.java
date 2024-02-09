class Parent {
    protected String name;

    public Parent(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Parent: My name is " + name);
    }

    public void polymorphicMethod() {
        System.out.println("Parent: Polymorphic method in Parent class");
    }
}

class Child1 extends Parent {
    private int age;

    public Child1(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println("Child1: My name is " + name + " and I'm " + age + " years old.");
    }

    @Override
    public void polymorphicMethod() {
        System.out.println("Child1: Polymorphic method in Child1 class");
    }
}

class Child2 extends Parent {
    private String hobby;

    public Child2(String name, String hobby) {
        super(name);
        this.hobby = hobby;
    }

    @Override
    public void display() {
        System.out.println("Child2: My name is " + name + " and I love " + hobby);
    }

    @Override
    public void polymorphicMethod() {
        System.out.println("Child2: Polymorphic method in Child2 class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent person1 = new Child1("Ram", 20);
        Parent person2 = new Child2("Aditya", "painting");

        person1.display();
        person1.polymorphicMethod();

        person2.display();
        person2.polymorphicMethod();
    }
}
