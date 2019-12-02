package collections.list2;

import java.util.*;

// ArrayList
// underlying data structure: Array
// 1. new ArrayList<>(); // empty arrayList
// 2. new ArrayList<>(int capacity); // initial size
// 3. new ArrayList<>(Collection c);
public class MyArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0)
            elementData = new Object[initialCapacity];
        else
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
    }

    // <? extends E> : E or subclasses of E
    public MyArrayList(Collection<? extends E> c) {
        elementData = c.toArray();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    @Override
    public boolean add(E e) {
        if (size == elementData.length) {
            elementData = grow(size + 1);
        }
        elementData[size] = e;
        size++;
        return false;
    }

    /**
     * Some JVMs reserve some header words in an array.
     * Attempts to allocate larger arrays "may" result in OutOfMemoryOrder
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    private Object[] grow(int minCapacity) {
        // 1. make a bigger size array
        // 2. copy all values from the old array
        return elementData = Arrays.copyOf(elementData, newCapacity(minCapacity));
    }

    // either 50% bigger or currentSize + minCapacity
    private int newCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        // overflow of newCapacity
        if (newCapacity <= minCapacity) {
            // overflow-conscious code (minCapacity)
            if (minCapacity < 0 || minCapacity > MAX_ARRAY_SIZE) {
                throw new OutOfMemoryError("integer overflow");
            }
            return minCapacity;
        }
        // this is pretty dangerous. (depends on VMs)
        // alternative could be using 'long' type array
        return (newCapacity <= MAX_ARRAY_SIZE) ? newCapacity : MAX_ARRAY_SIZE + 1;
    }

    @Override
    public boolean remove(Object o) {
        int i = 0;
        found:
        {
            if (o == null) {
                for (; i < size; i++)
                    if (elementData[i] == null)
                        break found;
            } else {
                for (; i < size; i++)
                    if (o.equals(elementData[i]))
                        break found;
            }
            return false;
        }
        fastRemove(i);
        return true;

//        if (o == null) {
//            for (int i = 0; i < size; i++)
//                if (elementData[i] == null) fastRemove(i);
//        } else {
//            for (int i = 0; i < size; i++)
//                if (o.equals(elementData[i])) fastRemove(i);
//        }

    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        Object[] a = c.toArray();
        int length = a.length;
        if (length == 0) return false;
        if (elementData.length < length + size) elementData = grow(length + size);
        System.arraycopy(a, 0, elementData, size, length);
        size += length;
        return true;
    }

    @Override
    public boolean addAll(int i, Collection<? extends E> c) {
        // TODO: Exercise
        return false;
    }

    @Override
    public void clear() {
        for (int to = size, i = size = 0; i < to; i++)
            elementData[i] = null;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        // Objects.checkIndex(index, size); - same operation
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E element) {
        Objects.checkIndex(index, size);
        E oldValue = (E) elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public void add(int index, E element) {
        // 1. check index is valid range
        Objects.checkIndex(index, size);
        // 2. check the size -> grow?
        if (size == elementData.length)
            elementData = grow(size + 1);
        // 3. shift everything after index i to the right
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    // @SuppressWarnings("unchecked")
    @Override
    public E remove(int index) {
        Objects.checkIndex(index, size);
        E removedValue = (E) elementData[index];

        return removedValue;
    }

    private void fastRemove(int index) {
        if (index < size - 1) // if the index is the last one, no need to shift all the elements
            System.arraycopy(elementData, index + 1, elementData, index, size - index);
        size--;
        elementData[size] = null;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) if (elementData[i] == null) return i;
        } else {
            // Object o exists
            for (int i = 0; i < size; i++) if (o.equals(elementData[i])) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size - 1; i >= 0; i--) if (elementData[i] == null) return i;
        } else {
            // Object o exists
            for (int i = size - 1; i >= 0; i--) if (o.equals(elementData[i])) return i;
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int i) {
        return null;
    }

    @Override
    public List subList(int i, int i1) {
        return null;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if (c == null) throw new NullPointerException();
        int i;
        for (i = size - 1; i >= 0; i--) {
            if (c.contains(elementData[i])) break;
            if (i == 0) return false;
        }
        for (; i >= 0; i--) if (c.contains(elementData[i])) fastRemove(i);
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object e : c)
            if (!contains(e)) return false;
        return true;
    }

    @Override
    public <T> T[] toArray(T[] objects) {
        // TODO: Exercise
        return null;
    }
}
