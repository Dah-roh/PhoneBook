import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private String name = "";
    private List<String> number = new ArrayList<>();
    private String address = "";
    private boolean isDeleted = false;

}
