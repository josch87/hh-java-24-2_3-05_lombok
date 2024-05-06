import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Course {
    long id;
    String name;
    Teacher teacher;
    Set<Student> students;
}
