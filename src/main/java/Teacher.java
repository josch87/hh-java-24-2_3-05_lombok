import lombok.Builder;
import lombok.With;

import java.util.Set;

@Builder
@With
public record Teacher(long id, String name, Set<String> subjects) {
}
