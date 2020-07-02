package at.fhj.iit;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class GenericsQueue {

    private List<Object> elements;
    private int maxSize;

    public GenericsQueue(List<Object> elements, int maxSize) {
        this.elements = elements;
        this.maxSize = maxSize;
    }


    public boolean offer(Object obj) {
        if (elements.size() < maxSize) {
            elements.add(obj);
            return true;
        } else
            return false;
    }


    public Object poll() {
        Object element = peek();
        if (element != null) {
            elements.remove(0);
        }
        return element;
    }


    public Object remove() {
        Object element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        return element;
    }


    public Object peek() {
        Object element = null;
        if (elements.size() > 0)
            element = elements.get(0);
        return element;
    }


    public Object element() {
        Object element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        return element;
    }

}