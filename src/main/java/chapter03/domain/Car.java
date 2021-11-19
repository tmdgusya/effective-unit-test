package chapter03.domain;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }

    public void drive(Route route) {
        for (Direction direction : route.getDirections()) {
            direction.follow();
        }
    }

    public void stop() {
        this.engine.stop();
    }

}
