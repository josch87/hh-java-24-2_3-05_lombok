import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.Set;

@Value
@AllArgsConstructor
@Builder
public class Course {
    long id;
    String name;
    Teacher teacher;
    Set<Student> students;
}
