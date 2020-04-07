

public class QueueCircleLink {
    protected Node front;
    protected Node rear;

    public QueueCircleLink() {
        front = null;
        rear = null;
    }

    public void enQueue(int data) {
        Node template = new Node(data);
        if (this.rear == null) {
            this.front = template;
            this.rear = template;
            rear.next = front;
            return;
        }
        this.rear.next = template;
        this.rear = template;
        rear.next = front;
    }

    public Node deQueue() {
        if (this.front == null) {
            return null;
        }
        Node template = this.front;
        this.front = this.front.next;
        this.rear.next = front;
        if (this.front == null) {
            this.rear = null;
        }
        return template;
    }

    public void display() {
        while (front != null) {
            System.out.println(deQueue().data);
            front = front.next;
        }
    }
}
