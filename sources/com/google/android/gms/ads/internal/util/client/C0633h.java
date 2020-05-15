package com.google.android.gms.ads.internal.util.client;

import android.util.Log;

/* renamed from: com.google.android.gms.ads.internal.util.client.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0633h {
    /* renamed from: a */
    public static void m5664a(String str) {
        if (m5667a(3)) {
            Log.d("Ads", str);
        }
    }

    /* renamed from: b */
    public static void m5668b(String str) {
        if (m5667a(6)) {
            Log.e("Ads", str);
        }
    }

    /* renamed from: c */
    public static void m5670c(String str) {
        if (m5667a(4)) {
            Log.i("Ads", str);
        }
    }

    /* renamed from: d */
    public static void m5672d(String str) {
        if (m5667a(5)) {
            Log.w("Ads", str);
        }
    }

    /* renamed from: e */
    static String m5674e(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m5665a(String str, Throwable th) {
        if (m5667a(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* renamed from: b */
    public static void m5669b(String str, Throwable th) {
        if (m5667a(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* renamed from: c */
    public static void m5671c(String str, Throwable th) {
        if (m5667a(4)) {
            Log.i("Ads", str, th);
        }
    }

    /* renamed from: d */
    public static void m5673d(String str, Throwable th) {
        if (m5667a(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* renamed from: e */
    public static void m5675e(String str, Throwable th) {
        if (!m5667a(5)) {
            return;
        }
        if (th == null) {
            m5672d(m5674e(str));
        } else {
            m5673d(m5674e(str), th);
        }
    }

    /* renamed from: a */
    public static void m5666a(Throwable th) {
        m5669b("", th);
    }

    /* renamed from: a */
    public static boolean m5667a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
