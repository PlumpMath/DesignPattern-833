package com.macwu.Duck.demo;

import com.macwu.Duck.DuckClasses.Duck;
import com.macwu.Duck.DuckClasses.FlyNoWay;
import com.macwu.Duck.DuckClasses.Quack;

/**
 * Created by macwu on 2016/6/3.
 */
public class ModelDuck extends Duck
{
    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display()
    {
        System.out.println("i am ModelDuck");
    }

    @Override
    public void performFly()
    {
        flyBehavior.fly();
    }

    @Override
    public void performQuack()
    {
        quackBehavior.quack();
    }
}
