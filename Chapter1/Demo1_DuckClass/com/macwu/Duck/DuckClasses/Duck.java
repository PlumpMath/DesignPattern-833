package com.macwu.Duck.DuckClasses;

import com.macwu.Duck.interfaces.FlyBehavior;
import com.macwu.Duck.interfaces.QuackBehavior;

public abstract class Duck
{
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();
    public abstract void performFly();
    public abstract void performQuack();

    public void setFlyBehavior(FlyBehavior fb)
    {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior)
    {
        this.quackBehavior = quackBehavior;
    }
}