import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.LinkedList;
import java.util.List;
import src.main.java.com.User;
import src.main.java.com.Event;

class EventTest{
    private Event event;
    private LinkedList<Integer> attendees;

    @BeforeEach
    // Initialize a Event object before each test
    void setUp(){
        attendees = new LinkedList<>();
        attendees.add(new User("Alice"));

        event = new Event(956, "Smith Wedding", "John and Janet's Wedding", "John's backyard", "May 5th", "John", 56, attendees, True);
    }

    // Verify constructor initialization
    @Test 
    void eventConstructor(){
        asertEquals(956, event.getEventId()):
        assertEquals("Smith Wedding", event.title());
        assertEquals("John and Janet's Wedding", event.getDescription);
        assertEquals("John's backyard", event.getLocation);
        assertEquals("May 5th", event.getDateTime);
        assertEquals("John", event.getCreatedBy());
        assertEquals(56, event.getMaxAttendees());
        
        assertEquals(1, event.getAttendees().size());
        assertEquals(28, event.getAttendees().get(0));
    }

    @Test
    void testSettersAndGetters(){
        event.setEventId(26);
        event.setEventTitle("Old Wedding");
        event.setEventDescription("Vow renewall with old theme");
        event.setEventLocation("Janet's backyard");
        event.setEventDateTime("May 4th");
        event.setCreatedBy("Janet");
        event.setEventAttendees(56);
        event.setMaxAttendees(102);

        asertEquals(26, event.getEventId()):
        assertEquals("Old Wedding", event.title());
        assertEquals("Vow renewall with old theme", event.getDescription);
        assertEquals("Janet's backyard", event.getLocation);
        assertEquals("May 4th", event.getDateTime);
        assertEquals("Janet", event.getCreatedBy());
        assertEquals(102, event.getMaxAttendees());
        
        assertEquals(1, event.getAttendees().size());
        assertEquals(56, event.getAttendees().get(0));
    }
}