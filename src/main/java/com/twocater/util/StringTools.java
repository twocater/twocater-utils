package com.twocater.util;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 字符串工具
 */
public class StringTools {

    /**
     * 字符串数组转整型列表
     *
     * @param stringArray
     * @return
     */
    public static List<Integer> stringArrayToIntegerList(String[] stringArray) {
        List<Integer> list = new LinkedList<>();
        for (String s : stringArray) {
            list.add(Integer.valueOf(s));
        }
        return list;
    }

    /**
     * 字符串数组转列表
     *
     * @param stringArray
     * @return
     */
    public static List<String> stringArrayToList(String[] stringArray) {
        List<String> list = new LinkedList<>();
        for (String s : stringArray) {
            list.add(s);
        }
        return list;
    }

    /**
     * 逗号分隔，转成String列表
     *
     * @param string
     * @return
     */
    public static List<String> stringSplitCommaToList(String string) {
        string = StringUtils.trimToNull(string);
        List<String> list = new LinkedList<>();
        if (string != null) {
            for (String s : string.split(",")) {
                list.add(s);
            }
        }
        return list;
    }

    /**
     * 逗号分隔，转成Integer列表
     *
     * @param string
     * @return
     */
    public static List<Integer> stringSplitCommaToIntegerList(String string) {
        string = StringUtils.trimToNull(string);
        List<Integer> list = new LinkedList<>();
        if (string != null) {
            for (String s : string.split(",")) {
                list.add(Integer.valueOf(s));
            }
        }
        return list;
    }

    /**
     * 逗号分隔，转成float列表
     *
     * @param string
     * @return
     */
    public static List<Float> stringSplitCommaToFloatList(String string) {
        string = StringUtils.trimToNull(string);
        List<Float> list = new LinkedList<>();
        if (string != null) {
            for (String s : string.split(",")) {
                list.add(Float.valueOf(s));
            }
        }
        return list;
    }

    /**
     * 逗号分隔，转成String列表
     *
     * @param string
     * @return
     */
    public static Set<String> stringSplitCommaToSet(String string) {
        string = StringUtils.trimToNull(string);
        Set<String> set = new HashSet<>();
        if (string != null) {
            for (String s : string.split(",")) {
                set.add(s);
            }
        }
        return set;
    }
}
