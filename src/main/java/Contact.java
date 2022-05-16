import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private String name;
    private List<String> number;
    private String address;

}
