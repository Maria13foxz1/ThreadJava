public class WorkerThread extends Thread{
    private final int id;
    private final BreakThread breakThread;
    private final int step;

    public WorkerThread(int id, BreakThread breakThread, int step) {
        this.id = id;
        this.breakThread = breakThread;
        this.step = step;
    }

    @Override
    public void run() {
        long sum = 0;
        long count = 0;
        while (!breakThread.isCanBreak()) {
            sum += count * step;
            count++;
        }
        System.out.println("Tread №"+id + "  Sum: " + sum + ", Count: " + count);
    }
}
