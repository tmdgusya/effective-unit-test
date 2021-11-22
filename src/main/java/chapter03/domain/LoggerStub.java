package chapter03.domain;

public class LoggerStub implements Logger {

    @Override
    public void log(LogLevel logLevel, String message) {
        //NOTHING
    }

    @Override
    public LogLevel getLogLevel() {
        return LogLevel.WARN;
    }
}
