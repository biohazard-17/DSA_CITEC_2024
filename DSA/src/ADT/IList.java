package ADT;

public interface IList<T> {
    //C
    public void add(T element);
    public void addAll(T[] elements);
    public void insert(T element, int index);
    //R
    public T get(int index);
    //U
    public void modify(T newValue, int index);
    //D
    public boolean remove(T element);
    public boolean remove(int index);

    //others
    public int indexOf(T element);
    public boolean isEmpty();
    public int length();

    public T[] subList(int lowerBound, int maxBound);
}
