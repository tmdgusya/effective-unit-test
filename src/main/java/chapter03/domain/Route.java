package chapter03.domain;

import java.util.List;

public class Route {

    private List<Direction> directions;

    public Route(List<Direction> directions) {
        this.directions = directions;
    }

    public List<Direction> getDirections() {
        return directions;
    }

}
