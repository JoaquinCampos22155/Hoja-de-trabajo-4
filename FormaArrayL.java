import java.util.ArrayList;
import java.util.EmptyStackException;

public class FormaArrayL<T> implements FunStack<T> {

    private ArrayList<T> dataStck = new ArrayList<T>();

    
    /** 
     * @return T
     * @throws EmptyStackException
     */
    public T pop() throws EmptyStackException {
        try {
            return dataStck.remove(dataStck.size() - 1);
        } catch (IndexOutOfBoundsException e) {
            throw new EmptyStackException();
        }
    }
    public void push(T item) { 
        dataStck.add(item);
    }

    public T peek() throws EmptyStackException {
        try {
            return dataStck.get(dataStck.size() - 1);
        } catch (IndexOutOfBoundsException e) {
            throw new EmptyStackException();
        }
    }
    
    public boolean empty() { 
        return dataStck.isEmpty();
    }

    public int size() { 
        return dataStck.size();
    }
}