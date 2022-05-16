import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.HashMap;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
public class ContactStorage {
List<Contact> contactList;
//0,1,2,3,4,5,6
//<monsuru, 0>&&<08083747394, 0>
//<bayo, 1>&&<0808374723424, 1>
//phoneBook.get(1)=contact of bayo
//Bi-direction search
HashMap<String, Long> findByName;
HashMap<String, Long> findByNumber;
}
