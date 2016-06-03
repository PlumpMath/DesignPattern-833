package com.macwu.Duck.DuckClasses;

import com.macwu.Duck.interfaces.FlyBehavior;

public class Fly implements FlyBehavior
{
    @Override
    public void fly()
    {
        System.out.println("i can fly");
    }
}