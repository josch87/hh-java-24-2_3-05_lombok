import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student aljoscha = new Student(1, "Aljoscha", "Berlin", 1.0F);
        Student jonas = new Student();
        Student goekhan = new Student();
        Student daniel = Student.builder().build();
        System.out.println(aljoscha);

        jonas.setId(2);
        jonas.setName("Jonas");

        goekhan.builder()
                .id(3)
                .name("Gökhan")
                .build();

        Student daniel1 = daniel.builder().name("Daniel").id(4).build();

        System.out.println("daniel1: " + daniel1);

        System.out.println("Daniel: " + daniel);

        Teacher florian = new Teacher(1, "Florian", Set.of("Java", "Web") );
        System.out.println(florian);

        Course javaBootcamp = new Course(1, "Java Bootcamp", florian, Set.of(aljoscha, jonas, goekhan,daniel1));
        System.out.println(javaBootcamp);
    }
}
