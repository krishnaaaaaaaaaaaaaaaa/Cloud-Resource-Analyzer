public class ThresholdAnalyzer {
    public void checkThreshold(double cpu) {
        if (cpu > 50.0) System.out.println("!!! ALERT: High CPU Usage Detected !!!");
    }
}