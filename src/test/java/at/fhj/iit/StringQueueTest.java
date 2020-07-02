package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StringQueueTest {
    private StringQueue q;
    private List<String> elements = new ArrayList<>();


    /**
     * Inits a StringQueue
     */
    @BeforeEach
    void setUp(){
        elements.add("a");
        q = new StringQueue();
    }
    /**
     * Tests functionality StringQueue.offer
     */
    @Test
    @DisplayName("Testing StringQueue offer method")
    public void testStringQueueOffer() {
        assertTrue(q.offer("b"));
       
    }


    // TODO Write your own tests

}