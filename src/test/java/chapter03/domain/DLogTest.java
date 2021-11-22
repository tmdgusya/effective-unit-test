package chapter03.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DLogTest {

    @Test
    void writesEachMessageToAllTargets() {
        SpyTarget spy1 = new SpyTarget();
        SpyTarget spy2 = new SpyTarget();
        DLog dLog = new DLog(spy1, spy2);
        dLog.write(LogLevel.WARN, "message");
        assertTrue(spy1.received(LogLevel.WARN, "message"));
        assertTrue(spy2.received(LogLevel.WARN, "message"));
    }

    private class SpyTarget implements DLogTarget {

        private List<String> log = new ArrayList<>();

        @Override
        public void write(LogLevel logLevel, String message) {
            log.add(concatenated(logLevel, message));
        }

        boolean received(LogLevel logLevel, String message) {
            return log.contains(concatenated(logLevel, message));
        }

        private String concatenated(LogLevel logLevel, String message) {
            return logLevel + " " + message;
        }

    }

}