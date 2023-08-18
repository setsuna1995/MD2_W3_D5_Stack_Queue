import java.util.EmptyStackException;
import java.util.LinkedList;


class Reverse<T> {
    private final LinkedList<T> stack;
    public Reverse() {
        stack = new LinkedList<>();
    }
    public int push (T element) {
     stack.addFirst(element);
     return (int) element;
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
