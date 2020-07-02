package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StringGenericsQueueTest {
    private StringQueue q;
    private List<String> elements = new ArrayList<>();


    /**
     * Inits a StringQueue
     */
    @BeforeEach
    void setUp(){
        elements.add("a");
        q = new StringQueue(elements,5);
    }
    /**
     * Tests functionality StringQueue offer by offering a String
     */
    @Test
    @DisplayName("Testing StringQueue offer method with new String Object")
    public void testStringQueueOffer() {
        assertTrue(q.offer("b"));
       
    }
    /**
     * Tests functionality StringQueue peek by looking if the value is equal to the added element
     */
    @Test
    @DisplayName("Testing StringQueue peek method")
    public void testQueuePeek() {
        assertEquals("a", q.peek());

    }

    /**
     * Tests functionality StringQueue poll function
     */
    @Test
    @DisplayName("Testing StringQueue poll method")
    public void testQueuePoll() {
        assertEquals("a", q.poll());

    }


    // TODO Write your own tests

}