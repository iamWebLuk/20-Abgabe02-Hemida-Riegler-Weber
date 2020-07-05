package at.fhj.iit;

import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

/**
 * This class works exactly the same as StringQueue, only it can run with all Generics
 */

public class GenericsQueue implements IQueue {

    private List<Object> elements;
    private int maxSize;

    //Constructor for GenericsQueue
    public GenericsQueue(List<Object> elements, int maxSize) {
        this.elements = elements;
        this.maxSize = maxSize;
    }

    //Adds the element obj to the queue, if
    @Override
    public boolean offer(Object obj) {
        if (elements.size() < maxSize) {
            elements.add(obj);
            return true;
        } else
            return false;
    }

    //Returns first element in the queue, and deletes it
    @Override
    public Object poll() {
        Object element = peek();
        if (element != null) {
            elements.remove(0);
        }
        return element;
    }

    //deletes first element in queue, also has an Exception
    @Override
    public Object remove() {
        Object element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        return element;
    }

    //returns first element in queue
    @Override
    public Object peek() {
        Object element = null;
        if (elements.size() > 0)
            element = elements.get(0);
        return element;
    }

    ////returns first element in queue, also has an Exception
    @Override
    public Object element() {
        Object element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        return element;
    }

}