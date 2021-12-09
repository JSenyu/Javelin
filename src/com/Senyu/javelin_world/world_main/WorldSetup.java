package com.Senyu.javelin_world.world_main;

import com.Senyu.javelin_world.world_main.time.WorldTime;

import java.util.Scanner;

public class WorldSetup {
    WorldSetup(){

    }


    public static void setup(){
        WorldTime.timeSetup();

    }

    public static void command(){
        Scanner scanner = new Scanner(System.in);
        String com = scanner.nextLine();

    }


    public static void commandList(){

    }

}
