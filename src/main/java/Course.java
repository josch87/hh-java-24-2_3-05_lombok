import lombok.Data;

import java.util.Set;

@Data
public class Course {
    long id;
    String name;
    Teacher teacher;
    Set<Student> students;
}
