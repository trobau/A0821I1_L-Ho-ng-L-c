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
        SelectionSort ob = new SelectionSort();
        double[] arr = new double[100000];
        for (int i = 0;i<arr.length;i++){
            arr[i] = Math.round(Math.random()*99+0);
        }
        ob.sort(arr);
        ob.printArray(arr);
        m.stop();
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn (selection sort) cho 100,000 số :"+m.getElapsedTime());
    }
}
