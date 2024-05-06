import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
@Builder
public class Course {
    long id;
    String name;
    Teacher teacher;
    Set<Student> students;
}
