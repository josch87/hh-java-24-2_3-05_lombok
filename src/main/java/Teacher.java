import lombok.Builder;

import java.util.Set;

@Builder
public record Teacher(long id, String name, Set<String> subjects) {
}
