import java.util.EmptyStackException;
import structure5.DoublyLinkedList;

public class FormaDLL<T> implements FunStack<T> {
        private DoublyLinkedList<T> DLList;
        
        public FormaDLL() {
            DLList = new DoublyLinkedList<>();
        }
        
        
        /** 
         * @return T
         * @throws EmptyStackException
         */
        public T pop() throws EmptyStackException {
            if (empty()) {
                throw new EmptyStackException();
            }
            return DLList.removeFirst();
        }

        public void push(T item) {
            DLList.addFirst(item); 
        }
        
        public T peek() throws EmptyStackException {
            if (empty()) {
                throw new EmptyStackException();
            }
            return DLList.getFirst();
        }
        
        public boolean empty() {
            return DLList.isEmpty();
        }
        
        public int size() {
            return DLList.size();
        }
    }