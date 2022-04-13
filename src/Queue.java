import java.awt.font.TextHitInfo;

public class Queue {
    private int[] queue;
    private final int head;
    private int tail;

    public Queue(int initialCapacity) {
        this.queue = new int[initialCapacity];
        this.head = 0;
        this.tail = queue.length;
    }

    public void add(int element) {
        if (size() >= this.queue.length) {
            enlargeQueue();

        }
        if (size() < this.queue.length) {
            for (int i = 0; i < this.queue.length; i++) {
                if (this.queue[i] == 0) {
                    this.queue[i] = element;
                    break;
                }
            }
        }
    }

    public int peak() {
        return queue[head];
    }

    public int poll() {
        int value = queue[head];
        for(int i = 0; i < queue.length - 1; i++) {
            queue[i] = queue[i+1];
        }
        tail = size() - 1;
        return value;
    }

    public void enlargeQueue() {
        int[] newArray = new int[this.queue.length << 1];
        queue = copyQueue(newArray);
    }

    public int[] copyQueue(int[] copyIn) {
        System.arraycopy(this.queue, 0, copyIn, 0, this.queue.length);
        return copyIn;
    }

    public int size() {
        int counter = 0;
        for (int j : queue) {
            if (j != 0) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }
}
