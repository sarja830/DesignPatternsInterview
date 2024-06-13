public class Main {

    public static void main(String[] args) {

        Thread[] threads=  new Thread[100];
        for(int i=0;i<100;i++)
        {
            int finalI = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    CacheService cacheService = CacheService.getCache();
                    cacheService.put(finalI,"Hello");
                    System.out.println(cacheService.getValue(1));
                }
            });
        }
        for(int i=0;i<100;i++)
        {
            threads[i].start();

        }

        CacheService cacheService = CacheService.getCache();
        cacheService.put(1,"Hello");
        System.out.println(cacheService.getValue(1));

    }

}
