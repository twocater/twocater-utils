package com.twocater.util.time;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * 时间处理工具
 */
public class DateTools {

    public static String currentDateTime() {
        return DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
    }
}
