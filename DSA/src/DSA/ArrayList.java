package DSA;

import ADT.IList;
import Helpers.ArrayUtils;

public class ArrayList<T> implements IList<T> {

    private int elementCount = 0;
    private T[] data;
    private int MAX_CAPACITY = 100;
    private final int DEFAULT_RESIZE = 100;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        data = (T[]) new Object[MAX_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int size) {
        MAX_CAPACITY = size;
        data = (T[]) new Object[MAX_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public ArrayList(T[] data) {
        int size = ArrayUtils.realArrayLength(data);
        this.data = data;
        MAX_CAPACITY = data.length;
        elementCount = size;
        data = (T[]) new Object[MAX_CAPACITY];
    }

    @Override
    public void add(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void addAll(T[] elements) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public void insert(T element, int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void modify(T newValue, int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modify'");
    }

    @Override
    public boolean remove(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int indexOf(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public int length() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'length'");
    }

    @Override
    public T[] subList(int lowerBound, int maxBound) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }

}
