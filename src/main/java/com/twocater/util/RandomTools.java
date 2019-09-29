package com.twocater.util;

import java.util.Random;

/**
 * 随机数工具
 */
public class RandomTools {

    public static boolean randomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    /**
     * 获取min到max之间的随机数,包括min和max
     *
     * @param min
     * @param max
     * @return
     */
    public static int getRandomNum(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static float getRandomNumFloat(float min, float max) {
        return (float) (Math.random() * (max - min)) + min;
    }

    /**
     * @param p 概率
     * @return
     */
    public static boolean randomTrue(float p) {
        if (Math.random() <= p) {
            return true;
        }
        return false;
    }
}
