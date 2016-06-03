package com.macwu.Duck.demo;

import com.macwu.Duck.DuckClasses.Fly;
import com.macwu.Duck.DuckClasses.FlyRocketPowered;

/**
 * Created by macwu on 2016/6/3.
 */
public class DuckDemo {
    public static void main(String[] args)
    {
//        MallurdDuck mallurdDuck = new MallurdDuck();
//        mallurdDuck.performFly();
//        mallurdDuck.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
//        modelDuck.setFlyBehavior(new);
    }
}
