package com.luxoft.datastructure.queue;

public class ArrayQueue implements Queue {
    int size;
    Object[] queue;

    public ArrayQueue() {
        this.queue = new Object[10];
    }

    public void enqueue(Object value) {
        this.queue[size++] = value;
    }

    public Object dequeue() {
        if(this.isEmpty()){
            throw new IllegalStateException("The queue is empty");
        }
        Object o = queue[0];
        for (int i = 0; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }
        size--;
        return o;
    }

    public Object peek() {
        return queue[0];
    }

    public boolean contains(Object value) {
        for (int i = 0; i < size; i++) {
            if(queue[i].equals(value)){
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        queue = new Object[10];
        size = 0;
    }
}
