package com.macwu.Duck.DuckClasses;

import com.macwu.Duck.interfaces.QuackBehavior;

public class Quack implements QuackBehavior
{
    @Override
    public void quack()
    {
        System.out.println("i can quack!!!");
    }
}