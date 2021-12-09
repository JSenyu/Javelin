package com.Senyu.javelin_world.world_main.rule;

public class Rule001 {
    public static boolean rule001_0(int i){
        if (i % 2 == 0 && i != 0){
            return true;
        }else {
            return false;
        }
    }

    public static int rul001_1(int i){
        if (i > 0) {
            return --i;
        }else {
            return 0;
        }
    }
}
