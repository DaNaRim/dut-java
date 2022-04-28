package dataStructures.lesson5;

public class StopWatch {

    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }

    public long getTime() {
        return endTime - startTime;
    }
}
