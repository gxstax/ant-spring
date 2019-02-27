import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: Test
 * @Description: TODO
 * @datetime 2018/11/29 14:24
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ExecutorService threadPool = null;
        for (int i = 0; i < 30; i++) {
            threadPool = ThreadPoolUtil.INSTANCE.getInstance();
        }

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 302; i++) {
            integers.add(i);
        }



        int lstSize = integers.size();
        int toIndex = 25;
        for(int i = 0; i < lstSize; i += 25){
            if(i + 25 > lstSize){//作用为toIndex最后没有100条数据则剩余几条newList中就装几条
                toIndex = lstSize - i;
            }
            List<Integer> newtLst = integers.subList(i,i+toIndex);
            threadPool.execute(new Thread(()->{
                System.out.println(newtLst+";");
            }));
        }


        threadPool.shutdown();
    }
}
