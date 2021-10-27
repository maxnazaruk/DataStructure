package com.luxoft.datastructure.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayQueueTest {
    @Test
    public void testEnqueueAndDequeue(){
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);

        assertEquals(2, arrayQueue.size());
        assertEquals(1, arrayQueue.dequeue());
        assertEquals(2, arrayQueue.dequeue());
        assertEquals(0, arrayQueue.size());
        assertTrue(arrayQueue.isEmpty());
    }

    @Test
    public void testEnqueueAndPeek() {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);

        assertEquals(2, arrayQueue.size());
        assertEquals(1, arrayQueue.peek());
        assertEquals(1, arrayQueue.peek());
        assertEquals(2, arrayQueue.size());
    }

    @Test
    public void testIsEmpty() {
        ArrayQueue arrayQueue = new ArrayQueue();

       assertTrue(arrayQueue.isEmpty());
    }

    @Test
    public void testContainsReturnTrue() {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);

        assertFalse(arrayQueue.contains(3));
    }

    @Test
    public void testContainsReturnFalseOnEmptyQueue() {
        ArrayQueue arrayQueue = new ArrayQueue();

        assertFalse(arrayQueue.contains(3));
    }

    @Test
    public void testThrowIllegalStateExceptionWhenPopOnEmptyQueue() {
        final ArrayQueue arrayQueue = new ArrayQueue();
        Assertions.assertThrows(IllegalStateException.class, () -> {
            arrayQueue.dequeue();
        });
    }
}
