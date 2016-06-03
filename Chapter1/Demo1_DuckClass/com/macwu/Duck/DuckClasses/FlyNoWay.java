package com.macwu.Duck.DuckClasses;

import com.macwu.Duck.interfaces.FlyBehavior;

/**
 * Created by macwu on 2016/6/3.
 */
public class FlyNoWay implements FlyBehavior
{
    @Override
    public void fly()
    {
        System.out.println("i can not fly");
    }
}
