package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StringQueueTest {
    private StringQueue q, q1;
    private List<String> elements = new ArrayList<>();


    /**
     * Inits a StringQueue
     */
    @BeforeEach
    void setUp() {
        elements.add("a");
        q = new StringQueue(elements, 5);
        q1 = new StringQueue(elements, 1);
    }

    /**
     * Tests functionality StringQueue offer by offering a String
     */
    @Test
    @DisplayName("Testing StringQueue offer method with new String Object")
    public void testStringQueueOffer() {
        assertTrue(q.offer("b"));
        assertFalse(q1.offer("b"));

    }

    /**
     * Tests functionality StringQueue peek by looking if the value is equal to the added element
     */
    @Test
    @DisplayName("Testing StringQueue peek method")
    public void testStringQueuePeek() {
        assertEquals("a", q.peek());
        assertEquals("a", q.poll());
        assertNull(q.peek());
    }

    /**
     * Tests functionality StringQueue poll function
     */
    @Test
    @DisplayName("Testing StringQueue poll method")
    public void testStringQueuePoll() {
        assertEquals("a", q.poll());
        assertNull(q.poll());

    }


    // TODO Write your own tests

}