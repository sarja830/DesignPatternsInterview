public abstract class LogProcessor {

    static  int INFO = 1;
    static  int DEBUG = 2;
    static  int ERROR = 3;

    LogProcessor nextProcessor;
    public  LogProcessor(LogProcessor nextProcessor)
    {
        this.nextProcessor = nextProcessor;
    }
     public void log(int level, String message)
     {
         nextProcessor.log(level,message);
     }
}
