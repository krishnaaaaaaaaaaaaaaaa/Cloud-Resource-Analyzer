public class SystemProfiler {
    public static void main(String[] args) {
        ThresholdAnalyzer analyzer = new ThresholdAnalyzer();
        MetricsExporter exporter = new MetricsExporter();

        System.out.println("Starting System Monitoring...");
        for (int i = 0; i < 10; i++) {
            double cpu = MetricsCollector.getCpuLoad();
            long mem = MetricsCollector.getUsedMemory();

            exporter.logMetrics(cpu, mem);
            analyzer.checkThreshold(cpu);

            System.out.printf("Time: %d | CPU: %.2f%% | Mem: %d MB%n", i, cpu, mem);
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}