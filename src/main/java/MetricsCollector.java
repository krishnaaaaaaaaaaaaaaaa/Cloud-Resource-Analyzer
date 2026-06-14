import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class MetricsCollector {
    private static final OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

    public static double getCpuLoad() { return osBean.getCpuLoad() * 100; }
    public static long getUsedMemory() { return (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024); }
}