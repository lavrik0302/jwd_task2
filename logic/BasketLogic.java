package by.epamtc.jwd.logic;

import by.epamtc.jwd.entity.Ball;
import by.epamtc.jwd.entity.BallColor;
import by.epamtc.jwd.entity.Basket;

public class BasketLogic {
    public static int countColoredBalls(Basket basket, BallColor color){
        if (basket == null || color == null)
            return 0;
        int amount = 0;
        for (int i = 0; i < basket.getSize(); i++) {
            Ball ball = basket.getBall(i);
            if (ball.getColor() == color)
                amount++;
        }
        return amount;
    }

    public static double countWeight(Basket basket){
        if (basket == null)
            return 0;
        double weight = 0;
        for (int i = 0; i < basket.getSize(); i++) {
            Ball ball = basket.getBall(i);
            weight += ball.getWeight();
        }
        return weight;
    }
}