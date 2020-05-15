package com.android.volley.toolbox;

import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HttpHeaderParser {
    /* renamed from: a */
    public static SimpleDateFormat m4784a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static Cache.Entry parseCacheHeaders(NetworkResponse networkResponse) {
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        long j5;
        long j6;
        long j7;
        NetworkResponse networkResponse2 = networkResponse;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = networkResponse2.headers;
        String str = (String) map.get("Date");
        long j8 = 0;
        if (str != null) {
            j = parseDateAsEpoch(str);
        } else {
            j = 0;
        }
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            j3 = 0;
            j2 = 0;
            int i2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(trim.substring(8));
                    } catch (Exception e) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            j3 = 0;
            j2 = 0;
            z = false;
        }
        String str3 = (String) map.get("Expires");
        if (str3 != null) {
            j4 = parseDateAsEpoch(str3);
        } else {
            j4 = 0;
        }
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j5 = parseDateAsEpoch(str4);
        } else {
            j5 = 0;
        }
        String str5 = (String) map.get("ETag");
        if (z) {
            long j9 = currentTimeMillis + (j3 * 1000);
            if (i == 0) {
                j7 = (j2 * 1000) + j9;
            } else {
                j7 = j9;
            }
            j6 = j7;
            j8 = j9;
        } else {
            if (j > 0 && j4 >= j) {
                j8 = currentTimeMillis + (j4 - j);
            }
            j6 = j8;
        }
        Cache.Entry entry = new Cache.Entry();
        entry.data = networkResponse2.data;
        entry.etag = str5;
        entry.softTtl = j8;
        entry.ttl = j6;
        entry.serverDate = j;
        entry.lastModified = j5;
        entry.responseHeaders = map;
        entry.allResponseHeaders = networkResponse2.allHeaders;
        return entry;
    }

    public static String parseCharset(Map map) {
        return parseCharset(map, "ISO-8859-1");
    }

    public static long parseDateAsEpoch(String str) {
        try {
            return m4784a().parse(str).getTime();
        } catch (ParseException e) {
            VolleyLog.m4766e(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    public static String parseCharset(Map map, String str) {
        String str2 = (String) map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }
}
