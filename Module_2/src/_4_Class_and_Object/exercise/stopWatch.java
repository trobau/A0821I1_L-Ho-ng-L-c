package _4_Class_and_Object.exercise;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class stopWatch {
    private Date startTime, endTime;

    public stopWatch() {
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        endTime = new Date();
    }

    public long getElapsedTime() {
        return (this.getEndTime().getTime() - this.getStartTime().getTime());
    }

    public static void main(String[] args) throws InterruptedException {
        stopWatch m = new stopWatch();
        m.start();
        Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        m.stop();
        System.out.println(m.getElapsedTime());
    }
}
