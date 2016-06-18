package com.twocater.utils.time;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * Created by cpaladin on 2016/6/18 15:42.
 * Email: 784615815@qq.com
 */
public class DateUtils {

    private static String currentTime() {
        return DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
    }
}
