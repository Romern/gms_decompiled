package com.felicanetworks.cmnlib.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DateFormatter {
    public static final String DATE_MINUTE = "yyyyMMddHHmm";
    public static final String DATE_TIME = "yyyyMMddHHmmss";
    public static final String DATE_TIME_MSEC = "yyyyMMddHHmmssSSS";
    protected SimpleDateFormat sdf;

    public DateFormatter(String str) {
        this.sdf = new SimpleDateFormat(str, Locale.US);
    }

    public String format(Date date) {
        return this.sdf.format(date);
    }

    public String getSystemTime() {
        return this.sdf.format(CommonUtil.getSystemTime());
    }

    public Date parse(String str) {
        return this.sdf.parse(str);
    }

    public void setTimeZone(String str) {
        this.sdf.setTimeZone(TimeZone.getTimeZone(str));
    }

    public String toString() {
        return "DateFormatter[" + this.sdf.toLocalizedPattern() + "," + this.sdf.getTimeZone().getID() + "]";
    }

    public DateFormatter(String str, String str2) {
        this(str);
        setTimeZone(str2);
    }

    public Date parse(String str, ParsePosition parsePosition) {
        return this.sdf.parse(str, parsePosition);
    }
}
