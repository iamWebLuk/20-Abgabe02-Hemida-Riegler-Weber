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

    public GenericsQueue(List<Object> elements, int maxSize) {
        this.elements = elements;
        this.maxSize = maxSize;
    }

    @Override
    public boolean offer(Object obj) {
        if (elements.size() < maxSize) {
            elements.add(obj);
            return true;
        } else
            return false;
    }

    @Override
    public Object poll() {
        Object element = peek();
        if (element != null) {
            elements.remove(0);
        }
        return element;
    }

    @Override
    public Object remove() {
        Object element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        return element;
    }

    @Override
    public Object peek() {
        Object element = null;
        if (elements.size() > 0)
            element = elements.get(0);
        return element;
    }

    @Override
    public Object element() {
        Object element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        return element;
    }

}
