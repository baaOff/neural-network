package ru.vsu.cs;

/**
 * Created with IntelliJ IDEA.
 * User: bardakov
 * Date: 29.11.13
 * Time: 14:44
 * To change this template use File | Settings | File Templates.
 */
public class Element {
    public double health;
    public double actionPoints;
    public double Grenade;
    public double Medkit;
    public double Med;
    public double Eat;
    public double Enemy;
    double[] out = new double[NeuralNetwork.OUTPUT];

    public Element(double health,
                   double actionPoints,
                   double Grenade,
                   double Medkit,
                   double Med,
                   double Eat,
                   double Enemy,
                   double[] out){
        this.health = health;
        this.actionPoints = actionPoints;
        this.Grenade = Grenade;
        this.Medkit = Medkit;
        this.Med = Med;
        this.Eat = Eat;
        this.Enemy = Enemy;
        this.out = out;
    }
}
