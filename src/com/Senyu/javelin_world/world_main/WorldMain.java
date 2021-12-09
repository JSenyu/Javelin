package com.Senyu.javelin_world.world_main;

import com.Senyu.javelin_world.entity.FirstEntity;
import com.Senyu.javelin_world.world_main.rule.Rule001;
import com.Senyu.javelin_world.world_main.time.WorldTime;

public class WorldMain {
    public static void main(String[] args) {
//        FirstEntity firstEntity = new FirstEntity();
//        FirstEntity firstEntity1 = new FirstEntity();
//        FirstEntity firstEntity2 = null;
//        if(Rule001.rule001_0(firstEntity.getA001()+firstEntity1.getA001())){
//            int sexOff = firstEntity.getSex() - firstEntity1.getSex();
//            firstEntity2 = sexOff != 0 ?
//                    firstEntity.getSex() > firstEntity1.getSex() ?
//                            new FirstEntity(firstEntity) :
//                            new FirstEntity(firstEntity1)
//                    : null;
//        }
//        System.out.println(firstEntity.getSex() + "--" + firstEntity.getA001());
//        System.out.println(firstEntity1.getSex() + "--" + firstEntity1.getA001());
//        if (firstEntity2 != null) {
//            System.out.println(firstEntity2.getSex() + "--" + firstEntity2.getA001());
//        }else {
//            System.out.println("Error!!!");
//        }
//        System.out.println(WorldTime.getDataTime());
        WorldSetup.setup();
    }
}
