package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StringQueueTest {
    private Queue q;
    private List<String> elements = new ArrayList<>();


    /**
     * Inits a StringQueue
     */
    @BeforeEach
    void setUp(){
        elements.add("a");
        q = new Queue(elements,5);
    }
    /**
     * Tests functionality StringQueue offer
     */
    @Test
    @DisplayName("Testing StringQueue offer method with new String Object")
    public void testQueueOffer() {
        assertTrue(q.offer("b"));
       
    }
    /**
     * Tests functionality StringQueue.peek
     */
    @Test
    @DisplayName("Testing StringQueue peek method")
    public void testQueuePeek() {
        assertEquals("a", q.peek());

    }


    // TODO Write your own tests

}