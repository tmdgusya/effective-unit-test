package chapter03.domain;

public interface DLogTarget {

    public void write(LogLevel logLevel, String message);

}
