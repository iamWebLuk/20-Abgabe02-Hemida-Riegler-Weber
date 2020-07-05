package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StringQueueTest {
    private StringQueue q, q1;
    private List<String> elements = new ArrayList<>();
    private List<String> elements1 = new ArrayList<>();


    /**
     * Inits two StringQueues One has maxSize five and two elements, one has max Size one and one element
     */
    @BeforeEach
    void setUp() {
        elements.add("a");
        q = new StringQueue(elements, 1);
        elements1.add("c");
        elements1.add("a");
        q1 = new StringQueue(elements1, 5);
    }

    /**
     * Tests functionality StringQueue offer by offering a String, if maxSize is reached return false
     * 
     */
    @Test
    @DisplayName("Testing StringQueue offer method")
    void testStringQueueOffer() {
        assertTrue(q1.offer("b"));
        assertFalse(q.offer("b"));
    }

    /**
     * Tests functionality StringQueue peek by looking if the value is equal to the added element and checking if after a poll the result is null
     */
    @Test
    @DisplayName("Testing StringQueue peek method")
    void testStringQueuePeek() {
        assertEquals("a", q.peek());
        assertEquals("a", q.poll());
        assertNull(q.peek());
    }

    /**
     * Tests functionality StringQueue poll function and checks if null when empty
     */
    @Test
    @DisplayName("Testing StringQueue poll method")
    void testStringQueuePoll() {
        assertEquals("a", q.poll());
        assertNull(q.poll());
    }

    /**
     * Tests functionality StringQueue remove function
     */
    @Test
    @DisplayName("Testing StringQueue remove method")
    void testStringQueueRemove() {
        assertEquals("a", q.remove());
        assertEquals("c", q1.remove());
    }

    /**
     * Tests if exception is thrown when remove in StringQueue has no element to remove
     */
    @Test
    @DisplayName("Testing StringQueue NoSuchElementException in remove method")
    void ExceptionThrown_thenAssertionSucceeds_Remove() {
        q.remove();
        Exception exception = assertThrows(NoSuchElementException.class, () -> q.remove());
        String expectedMessage = "there's no element any more";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Tests functionality of element method (basically same as peek method)
     */
    @Test
    @DisplayName("Testing StringQueue element method")
    void testStringQueueElement() {
        assertEquals("a", q.element());
    }

    /**
     * Tests if exception is thrown when element in StringQueue has no element (remove element in q with poll function)
     */
    @Test
    @DisplayName("Testing StringQueue NoSuchElementException in element method")
    void ExceptionThrown_thenAssertionSucceeds_Element() {
        q.poll();
        Exception exception = assertThrows(NoSuchElementException.class, () -> q.element());
        String expectedMessage = "there's no element any more";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}