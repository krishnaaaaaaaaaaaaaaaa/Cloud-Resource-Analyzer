import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class MetricsExporter {
    public void logMetrics(double cpu, long mem) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("metrics.csv", true))) {
            writer.printf("%d,%.2f,%d%n", System.currentTimeMillis(), cpu, mem);
        } catch (IOException e) { e.printStackTrace(); }
    }
}