package org.webrtc;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Logging {

    /* renamed from: a */
    private static final Logger f191839a;

    /* renamed from: b */
    private static volatile boolean f191840b;

    /* renamed from: a */
    public static void m151177a(int i, String str, String str2) {
        Level level;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        }
        int i2 = i - 1;
        if (i2 == 1) {
            level = Level.INFO;
        } else if (i2 != 2) {
            level = Level.SEVERE;
        } else {
            level = Level.WARNING;
        }
        Logger logger = f191839a;
        StringBuilder sb = new StringBuilder(str.length() + 2 + str2.length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        logger.logp(level, "org.webrtc.Logging", "log", sb.toString());
    }

    /* renamed from: b */
    public static void m151180b(String str, String str2) {
        m151177a(4, str, str2);
    }

    /* renamed from: c */
    public static void m151181c(String str, String str2) {
        m151177a(3, str, str2);
    }

    static {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        f191839a = logger;
    }

    /* renamed from: a */
    public static void m151178a(String str, String str2) {
        m151177a(2, str, str2);
    }

    /* renamed from: a */
    public static void m151179a(String str, String str2, Throwable th) {
        m151177a(4, str, str2);
        m151177a(4, str, th.toString());
        StringWriter stringWriter = new StringWriter();
        bqye.m113760a(th, new PrintWriter(stringWriter));
        m151177a(4, str, stringWriter.toString());
    }
}
