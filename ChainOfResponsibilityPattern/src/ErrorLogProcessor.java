public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(int level) {
        super(null);
    }

    @Override
    public void log(int level,String message) {
        if(level==ERROR)
           System.out.println("Error Log: " + message);
        else
            super.log(level,message);
    }

}
