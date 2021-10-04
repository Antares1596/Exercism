public class LogLevels {
    
    public static String message(String logLine) {
        //logLine.replaceAll("\\s","");
        String s = logLine.substring(logLine.indexOf(":")+1);
        s = s.trim();
        return s;
        
    }
    public static String logLevel(String logLine) {
        String s = logLine.substring(logLine.indexOf("[")+1);
        s = s.substring(0,s.indexOf("]"));
        return s.toLowerCase();
    }
    public static String reformat(String logLine) {
        String message = message(logLine)+ " ";
        String level = "(" + logLevel(logLine)+")";
        return message+level;
    }
}
