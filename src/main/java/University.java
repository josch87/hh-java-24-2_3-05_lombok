import java.util.Set;

public record University(long id, String name, Set<Course> courses) {
}
