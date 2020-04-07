public class Main {
    public static void main(String[] args) {
        QueueCircleLink listNumbers = new QueueCircleLink();
        listNumbers.enQueue(1);
        listNumbers.enQueue(2);
        listNumbers.enQueue(3);
        listNumbers.enQueue(4);
        System.out.println(listNumbers.deQueue().data);
        System.out.println(listNumbers.deQueue().data);
        System.out.println(listNumbers.deQueue().data);
        listNumbers.enQueue(5);
        listNumbers.enQueue(6);
        System.out.println(listNumbers.deQueue().data);
        System.out.println(listNumbers.deQueue().data);
    }
}
