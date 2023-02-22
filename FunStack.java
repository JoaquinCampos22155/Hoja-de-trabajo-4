import java.util.EmptyStackException;
//funciones de stack q se implementan en las otras clases
public interface FunStack<T> {
    public T pop() throws EmptyStackException;
    public void push(T item);
    public T peek() throws EmptyStackException;
    public boolean empty();
    public int size();
 }