package by.epamtc.jwd.entity;

import java.util.Objects;

public class Ball {
    private BallColor color;
    private double weight;

    public Ball(BallColor color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public BallColor getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return weight == ball.weight && color == ball.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}