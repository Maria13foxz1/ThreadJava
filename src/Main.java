//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] id = {0,1,2};
        int[] times = {3000,10000,2000};
        BreakThread breakThread = new BreakThread();

        new WorkerThread(id[0], breakThread, 1).start();
        new WorkerThread(id[1], breakThread, 5).start();
        new WorkerThread(id[2], breakThread, 3).start();

        new Thread(breakThread).start();
    }
}