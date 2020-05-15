package com.android.volley;

import android.util.Log;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VolleyLog {
    public static boolean DEBUG = false;
    public static String TAG = "Volley";

    /* renamed from: a */
    private static final String f7309a = VolleyLog.class.getName();

    /* renamed from: a */
    private static String m4763a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f7309a)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* renamed from: d */
    public static void m4764d(String str, Object... objArr) {
        m4763a(str, objArr);
    }

    /* renamed from: e */
    public static void m4765e(String str, Object... objArr) {
        Log.e(TAG, m4763a(str, objArr));
    }

    public static void setTag(String str) {
        m4764d("Changing log tag to %s", str);
        TAG = str;
        DEBUG = false;
    }

    /* renamed from: v */
    public static void m4767v(String str, Object... objArr) {
        if (DEBUG) {
            m4763a(str, objArr);
        }
    }

    public static void wtf(String str, Object... objArr) {
        Log.wtf(TAG, m4763a(str, objArr));
    }

    /* renamed from: e */
    public static void m4766e(Throwable th, String str, Object... objArr) {
        Log.e(TAG, m4763a(str, objArr), th);
    }

    public static void wtf(Throwable th, String str, Object... objArr) {
        Log.wtf(TAG, m4763a(str, objArr), th);
    }
}
