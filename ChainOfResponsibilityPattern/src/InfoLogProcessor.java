public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public  void log(int level, String message) {
        if(level==INFO)
            System.out.println("Info Log: " + message);
        else
            super.log(level,message);
    }
}
