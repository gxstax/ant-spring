import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: ThreadPoolUtil
 * @Description: 线程池工具
 * @datetime 2018/11/28 15:04
 * @Version 1.0
 */
public enum ThreadPoolUtil {
    INSTANCE;

    private ExecutorService newCachedThreadPool = null;

    private ThreadPoolUtil() {
        newCachedThreadPool = Executors.newCachedThreadPool();
    }

    public ExecutorService getInstance() {
        return newCachedThreadPool;
    }
}
