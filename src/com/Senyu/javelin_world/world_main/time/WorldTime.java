package com.Senyu.javelin_world.world_main.time;


import java.io.*;


public class WorldTime {
    protected static long dataTime;
    protected static long dataYear;
    protected static File file = new File("time.txt");
    protected static File yearFile = new File("year.txt");

    public static void timeSetup(){
        WorldTimeUtil util = new WorldTimeUtil();
        util.run();
    }

    static void firstFile(){
        try {
            file.createNewFile();
            yearFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readFile(File file){
        long i;
        long is = 0;
        StringBuffer buffer = new StringBuffer();
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(file));
            char[] chars = bufferedReader.readLine().toCharArray();
            for (int j = 0 ; j < chars.length ; j ++){
                i = chars[j] - 48;
                for (int k = 0 ; k < chars.length - j -1 ; k ++){
                    i = i * 10;
                }
                is = is + i;
            }
            System.out.println("Setup time is " + is);
            dataTime = is;
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void writeFile(File file){
        String s = String.valueOf(getDataTime());
        StringBuffer buffer = new StringBuffer();
        try {
            BufferedWriter bufferedWriter =
                        new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(s);
            System.out.println("Writer time is " + s);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void delFileDataTime(){
        StringBuffer buffer = new StringBuffer();

    }

    static void setDataTime(long dataTime) {
        WorldTime.dataTime = dataTime;
    }

    static void setDataTime(long dataYear , int flags) {
        WorldTime.dataYear = dataYear;
    }

    public static long getDataTime() {
        return dataTime;
    }

    public static long getDataTime(int flags) {
        return dataYear;
    }


}


class WorldTimeUtil implements Runnable {

    @Override
    public void run() {
        WorldTime.firstFile();
        WorldTime.readFile(WorldTime.file);
//        WorldTime.readFile(WorldTime.yearFile);
        while (true){
            if (WorldTime.getDataTime() == 31536000L){
                WorldTime.setDataTime(0);
                WorldTime.setDataTime(WorldTime.getDataTime(1) + 1, 1);
                WorldTime.writeFile(WorldTime.yearFile);
            }
            try {
                Thread.sleep(100);
                WorldTime.setDataTime(WorldTime.getDataTime() + 1);
                WorldTime.writeFile(WorldTime.file);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}