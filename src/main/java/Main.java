import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student aljoscha = new Student(1, "Aljoscha", "Berlin", 1.0F);
        System.out.println(aljoscha);

        Teacher florian = new Teacher(1, "Florian", Set.of("Java", "Web") );
        System.out.println(florian);

        Course javaBootcamp = new Course(1, "Java Bootcamp", florian, Set.of(aljoscha));
        System.out.println(javaBootcamp);
    }
}
