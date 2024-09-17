import java.util.Scanner;

interface StackInterface {
    void push(int item);
    int pop();
    int peek();
    void displayStack();
}

interface QueueInterface {
    void enqueue(int item);
    int dequeue();
    void displayQueue();
}

class StackQueue implements StackInterface, QueueInterface {
    private int[] stack;
    private int[] queue;
    private int stackTop;
    private int queueFront;
    private int queueRear;
    private int size;

    public StackQueue(int size) {
        this.size = size;
        stack = new int[size];
        queue = new int[size];
        stackTop = -1;
        queueFront = 0;
        queueRear = -1;
    }

    // Stack methods
    @Override
    public void push(int item) {
        if (stackTop == size - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++stackTop] = item;
        }
    }

    @Override
    public int pop() {
        if (stackTop == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[stackTop--];
        }
    }

    @Override
    public int peek() {
        if (stackTop == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[stackTop];
        }
    }

    @Override
    public void displayStack() {
        if (stackTop == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= stackTop; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Queue methods
    @Override
    public void enqueue(int item) {
        if (queueRear == size - 1) {
            System.out.println("Queue is full");
        } else {
            queue[++queueRear] = item;
        }
    }

    @Override
    public int dequeue() {
        if (queueFront > queueRear) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[queueFront++];
        }
    }

    @Override
    public void displayQueue() {
        if (queueFront > queueRear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            for (int i = queueFront; i <= queueRear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackQueueTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackQueue stackQueue = new StackQueue(5);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push to Stack");
            System.out.println("2. Pop from Stack");
            System.out.println("3. Peek Stack");
            System.out.println("4. Display Stack");
            System.out.println("5. Enqueue to Queue");
            System.out.println("6. Dequeue from Queue");
            System.out.println("7. Display Queue");
            System.out.println("8. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item to push: ");
                    int stackItem = scanner.nextInt();
                    stackQueue.push(stackItem);
                    break;
                case 2:
                    System.out.println("Popped item: " + stackQueue.pop());
                    break;
                case 3:
                    System.out.println("Top item: " + stackQueue.peek());
                    break;
                case 4:
                    stackQueue.displayStack();
                    break;
                case 5:
                    System.out.print("Enter item to enqueue: ");
                    int queueItem = scanner.nextInt();
                    stackQueue.enqueue(queueItem);
                    break;
                case 6:
                    System.out.println("Dequeued item: " + stackQueue.dequeue());
                    break;
                case 7:
                    stackQueue.displayQueue();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
