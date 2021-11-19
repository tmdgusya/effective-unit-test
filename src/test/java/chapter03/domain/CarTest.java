package chapter03.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void engineIsStartedWithCarStarts() {
        TestEngine engine = new TestEngine();
        new Car(engine).start();
        assertTrue(engine.isRunning());
    }

    public class TestEngine extends Engine {
        private boolean isRunning;

        public void start() {
            this.isRunning = true;
        }

        public boolean isRunning() {
            return this.isRunning;
        }

    }

}