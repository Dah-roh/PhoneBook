import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Collections;

@RunWith(JUnit4.class)
public class ContactOperationsTest extends TestCase {
    public Contact contact;

    @Before
    public void startMethod(){

        contact = new Contact("Mr. Bleah",
                new ArrayList<String>(Collections.singleton("08123444454")),
                "no blah blah", false);
    }

    @Test
    public void testSave() {
        assertEquals(contact.getNumber().get(0), "08123444454");
    }
}