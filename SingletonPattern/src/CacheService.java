import java.util.HashMap;

public class CacheService {

    // eager initialization of cache
    private static CacheService cacheService = new CacheService();
    private HashMap<Integer,String> cacheMap;

    // so that no one access it from outside
    private CacheService(){
        cacheMap = new HashMap<>();
    }

    //Method 1  to make threads enter one by one
//    public static  synchronized  CacheService getCache()
    public static   CacheService getCache()
    {
        if(cacheService==null)
            cacheService = new CacheService();

        return cacheService;
    }

    public void put(int key, String value)
    {
        cacheMap.put(key,value);
    }

    public String getValue(int key)
    {
        return cacheMap.getOrDefault(key,"Key not found");
    }
}
