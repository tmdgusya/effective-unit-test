package chapter03.domain;

public class DLog {

    private final DLogTarget[] targets;

    public DLog(DLogTarget ... targets) {
        this.targets = targets;
    }

    public void write(LogLevel logLevel, String message) {
        for (DLogTarget dLogTarget : targets) {
            dLogTarget.write(logLevel, message);
        }
    }

}
