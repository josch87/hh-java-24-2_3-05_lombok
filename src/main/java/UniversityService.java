import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;

public class UniversityService {
    public BigDecimal calcAverageGrade(Course course) {
        Set<Student> students = course.getStudents();

        BigDecimal sum = students.stream()
                .map(Student::getGrade)
                .map(a -> new BigDecimal(a.toString()))
                .reduce(BigDecimal.ZERO, (a, b) -> new BigDecimal(a.toString()).add(new BigDecimal(b.toString())));

        return sum.divide(new BigDecimal(students.size()), 2, RoundingMode.HALF_UP);
    }
}
