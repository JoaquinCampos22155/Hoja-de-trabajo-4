import structure5.SinglyLinkedList;
import java.util.EmptyStackException;


    public class FormaSLL<T> implements FunStack<T> {
        private SinglyLinkedList<T> sLList;
        
        public FormaSLL() {
            sLList = new SinglyLinkedList<>();
        }
        
        
        /** 
         * @return T
         * @throws EmptyStackException
         */
        public T pop() throws EmptyStackException {
            if (empty()) {
                throw new EmptyStackException();
            }
            return sLList.removeFirst();
        }
        public void push(T item) {
            sLList.addFirst(item);
        }
        
        public T peek() throws EmptyStackException {
            if (empty()) {
                throw new EmptyStackException();
            }
            return sLList.getFirst();
        }
        
        public boolean empty() {
            return sLList.isEmpty();
        }
        
        public int size() {
            return sLList.size();
        }
    }
