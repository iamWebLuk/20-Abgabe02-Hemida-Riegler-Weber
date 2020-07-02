package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class StringQueueTest {
    private StringQueue q, q1;
    private List<String> elements = new ArrayList<>();
    private List<String> elements1 = new ArrayList<>();


    /**
     * Inits two StringQueues One has maxSize five and two elements, one has max Size one and one element
     */
    @BeforeEach
    void setUp() {
        elements.add("a");
        q1 = new StringQueue(elements, 1);
        elements1.add("c");
        elements1.add("a");
        q = new StringQueue(elements1, 5);
    }

    /**
     * Tests functionality StringQueue offer by offering a String, if maxSize is reached return false
     */
    @Test
    @DisplayName("Testing StringQueue offer method with new String Object")
    public void testStringQueueOffer() {
        assertTrue(q.offer("b"));
        assertFalse(q1.offer("b"));

    }

    /**
     * Tests functionality StringQueue peek by looking if the value is equal to the added element and checking if after a poll the result is null
     */
    @Test
    @DisplayName("Testing StringQueue peek method")
    public void testStringQueuePeek() {
        assertEquals("a", q1.peek());
        assertEquals("a", q1.poll());
        assertNull(q1.peek());
    }

    /**
     * Tests functionality StringQueue poll function and checks if null when empty
     */
    @Test
    @DisplayName("Testing StringQueue poll method")
    public void testStringQueuePoll() {
        assertEquals("a", q1.poll());
        assertNull(q1.poll());
    }

    /**
     * Tests functionality StringQueue remove function
     */
    @Test
    @DisplayName("Testing StringQueue remove method")
    public void testStringQueueRemove() {
        assertEquals("a", q1.remove());
        assertEquals("c", q.remove());
    }

    /**
     * Tests if exception is thrown when remove in StringQueue has no element to remove
     */
    @Test
    @DisplayName("Testing StringQueue NoSuchElementException in remove method")
    public void whenExceptionThrown_thenAssertionSucceeds() {
        q1.remove();
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            q1.remove();
        });
        String expectedMessage = "there's no element any more";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }



}