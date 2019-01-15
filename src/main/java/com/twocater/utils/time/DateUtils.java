package com.twocater.utils.time;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

public class DateUtils {

    public static String currentDateTime() {
        return DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
    }
}
