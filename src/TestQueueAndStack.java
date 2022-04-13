public class TestQueueAndStack {
    public static void main(String[] args) {
        Queue testQueue = new Queue(8);
        for(int i = 1; i < 12; i++){
            testQueue.add(i);
        }
        System.out.println(testQueue.peak());
        testQueue.poll();
        System.out.println(testQueue.peak());

    }
}
