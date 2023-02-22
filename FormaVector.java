
import java.util.NoSuchElementException;
import java.util.EmptyStackException;
import java.util.Vector;
public class FormaVector<T> implements FunStack<T> {
    protected Vector<T> stackElements;

    public FormaVector(){
        this.stackElements = new Vector<>();
    }

    
    /** 
     * @return T
     * @throws EmptyStackException
     */
    public T pop() throws EmptyStackException{
        if (empty()){
            throw new NoSuchElementException("Esta vacio revise el documento");
        } 
        return this.stackElements.remove(this.stackElements.size()-1);
    }

    public void push(T item){
        this.stackElements.add(item);
    }

    public T peek() throws EmptyStackException{
        if (empty()){
            throw new NoSuchElementException("Esta vacio revise el documento");
        }
        return stackElements.get(stackElements.size()-1);
    }

    public boolean empty(){
        return this.stackElements.isEmpty();
    }

    public int size(){
        return this.stackElements.size();
    }
}
