package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class GenericsQueueTest {
    private GenericsQueue q;
    private List<String> elements = new ArrayList<>();


    /**
     * Inits a Queue
     */
    @BeforeEach
    void setUp(){
        elements.add("a");
        q = new GenericsQueue(elements,5);
    }
    /**
     * Tests functionality Queue offer
     */
    @Test
    @DisplayName("Testing StringQueue offer method with new String Object")
    public void testQueueOffer() {
        assertTrue(q.offer("b"));

    }
    /**
     * Tests functionality Queue peek
     */
    @Test
    @DisplayName("Testing StringQueue peek method")
    public void testQueuePeek() {
        assertEquals("a", q.peek());

    }

    /**
     * Tests functionality Queue poll
     */
    @Test
    @DisplayName("Testing StringQueue poll method")
    public void testQueuePoll() {
        assertEquals("a", q.peek());

    }


    // TODO Write your own tests

}