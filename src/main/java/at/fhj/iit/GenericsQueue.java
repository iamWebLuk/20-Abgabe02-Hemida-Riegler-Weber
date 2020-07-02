package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class GenericsQueue implements IQueue {

    private List<String> elements;
    private int maxSize;

    public GenericsQueue(List<String> elements, int maxSize) {
        this.elements = elements;
        this.maxSize = maxSize;
    }

    @Override
    public boolean offer(String obj) {
        if (elements.size() < maxSize) {
            elements.add(obj);
            return true;
        } else
            return false;
    }

    @Override
    public String poll() {
        String element = peek();
        if (element != null) {
            elements.remove(0);
        }
        return element;
    }

    @Override
    public String remove() {
        String element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        return element;
    }

    @Override
    public String peek() {
        String element = null;
        if (elements.size() > 0)
            element = elements.get(0);
        return element;
    }

    @Override
    public String element() {
        String element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        return element;
    }

}