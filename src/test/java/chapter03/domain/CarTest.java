package chapter03.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("Car 의 start 메소드를 호출할때 Engine 의 start 를 호출하는지 확인합니다.")
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