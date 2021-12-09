package com.Senyu.javelin_world.entity;

import com.Senyu.javelin_world.world_main.element.IEa001;
import com.Senyu.javelin_world.world_main.element.IEb001;

import java.util.Random;

public class FirstEntity implements IEa001 , IEb001 {
    protected int A001 = 1;
    protected int B001 = 1;
    protected int sex = new Random().nextInt(2) + 1;

    public FirstEntity() {
    }

    public FirstEntity(FirstEntity firstEntity){
        this.A001 = firstEntity.getA001();
        this.sex = new Random().nextInt(2) + 1;
    }

    public int getSex() {
        return sex;
    }

    @Override
    public int getA001() {
        return A001;
    }

    @Override
    public int getB001() {
        return B001;
    }
}
