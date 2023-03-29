package com.example.dsa_fx;

public class Queue {
    int[] queueArray;
    int front;
    int rear;
    int capacity;
    int count;

    public Queue(int size) {
        queueArray = new int[size];
        capacity = size;
        count = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (rear == capacity - 1);
    }

    public void enqueue(int num) {
        if (isFull()) {
            System.out.println("Que is full");
        }
        else {
            queueArray[++rear] = num;
            count++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
        } else {
            count--;
            return queueArray[front++];
        }
        return 0;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return queueArray[front];
    }

    public int size(){
        return count;
    }
}
