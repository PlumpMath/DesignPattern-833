package com.macwu.Duck.demo;

import com.macwu.Duck.DuckClasses.*;
import com.macwu.Duck.interfaces.*;
//import com.macwu.Duck.

/**
 * Created by macwu on 2016/6/3.
 */
public class MallurdDuck extends Duck
{
    public MallurdDuck()
    {
        FlyBehavior flyBehavior = new Fly();
        QuackBehavior quackBehavior = new Quack();
    }

    @Override
    public void display()
    {
        System.out.println("i am a MallurdDuck!!!");
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
