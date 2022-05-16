import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
public class ContactStorage {
    //contactList.get(0)
    //Time-complexity
List<Contact> contactList =  new ArrayList<>();
//Bi-direction search
    //Space-complexity
HashMap<String, Long> findByName = new HashMap<>();
HashMap<String, Long> findByNumber = new HashMap<>();
}
