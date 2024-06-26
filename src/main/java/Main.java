import java.math.BigDecimal;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student aljoscha = new Student(1, "Aljoscha", "Berlin", 1.0F);
        Student jonas = new Student();
        Student goekhan = new Student();
        Student daniel = Student.builder()
                .id(4)
                .grade(2.6F)
                .build();
        System.out.println(aljoscha);

        jonas.setId(2);
        jonas.setName("Jonas");
        jonas.setGrade(1.5F);

        // Static member 'Student.builder()' accessed via instance reference (Funktioniert nicht, es wird nichts geändert)
        goekhan.builder()
                .id(3)
                .name("Gökhan")
                .build();

        //Static member 'Student.builder()' accessed via instance reference  (Funktioniert, es wird etwas zurückgegeben und weiterverwendet / man sollte jedoch stattdessen @With verwenden)
        Student daniel1 = daniel.builder().name("Daniel").build();

        System.out.println("daniel1: " + daniel1);

        System.out.println("Daniel: " + daniel);

        Teacher florian = new Teacher(1, "Florian", Set.of("Java", "Web"));
        System.out.println(florian);

        Course javaBootcamp = new Course(1, "Java Bootcamp", florian, Set.of(aljoscha, jonas, goekhan, daniel1));
        System.out.println(javaBootcamp);

        Teacher florian2 = florian.withSubjects(Set.of("Java", "Web", "Cooking"));

        System.out.println(florian2);

        UniversityService universityService = new UniversityService();

        BigDecimal javaBootcampAverageGrade = universityService.calcAverageGrade(javaBootcamp);

        System.out.println(javaBootcampAverageGrade);
    }
}
