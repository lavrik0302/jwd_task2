package by.epamtc.jwd;

import by.epamtc.jwd.entity.Ball;
import by.epamtc.jwd.entity.BallColor;
import by.epamtc.jwd.entity.Basket;
import by.epamtc.jwd.logic.BasketLogic;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(BallColor.GREEN, 2.4));
        basket.addBall(new Ball(BallColor.BLUE, 1.5));
        basket.addBall(new Ball(BallColor.BLACK, 3));
        basket.addBall(new Ball(BallColor.BLACK, 0.5));
        basket.addBall(new Ball(BallColor.WHITE, 1.1));
        basket.addBall(new Ball(BallColor.BLUE, 3.7));
        basket.addBall(new Ball(BallColor.BLACK, 4.2));
        int amountOfBlueBalls = BasketLogic.countColoredBalls(basket, BallColor.BLACK);
        System.out.println("amount of blue balls: " + amountOfBlueBalls);
        double basketWeight = BasketLogic.countWeight(basket);
        System.out.println("basket weight " + basketWeight);



    }
}