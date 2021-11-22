package chapter03.domain;

public interface Logger {

    public void log(LogLevel logLevel, String message);

    public LogLevel getLogLevel();

}
