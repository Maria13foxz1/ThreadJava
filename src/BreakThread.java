public class BreakThread implements Runnable {
    //private boolean[] canBreak;
    //private final int[] id;
    //private final int[] times;
    private boolean canBreak = false;
    /*public BreakThread(int[] id, int[] times) {
        this.id = id;
        this.times = times;
        this.canBreak = new boolean[times.length];
    }*/

    @Override
    public void run() {
        /*for (int i = 0; i < times.length; i++) {
            if (i == id[i])
            {
                try {
                    Thread.sleep(times[i]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                canBreak[i] = true;
            }
        }*/
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        canBreak = true;
    }

    synchronized public boolean isCanBreak() {
        return canBreak;
    }
}