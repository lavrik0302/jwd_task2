package by.epamtc.jwd.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Basket {
    private final int SIZE = 20;
    ArrayList<Ball> balls = new ArrayList<>();

    public int getSize() {
        return balls.size();
    }

    public void addBall(Ball ball) {
        if (ball == null)
            return;
        if (SIZE > balls.size())
            balls.add(ball);
    }

    public Ball getBall(int index) {
        if (SIZE > index)
            return balls.get(index);
        return null;
    }

    public void removeBall(Ball ball) {
        if (ball == null)
            return;
        balls.remove(ball);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(balls, basket.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SIZE, balls);
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "balls = " + balls +
                '}';
    }
}