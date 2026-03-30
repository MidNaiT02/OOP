package lab3.task3;
public interface MyCollection<T> {
    void add(T element);
    void remove(T element);
    int size();
    boolean isEmpty();
    boolean contains(T element);
}