package com.google.android.gms.common.stats.radio;

import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RadiosTracingLoggerProvider {

    /* renamed from: a */
    private static NetworkActivityLogger f30387a;

    /* renamed from: b */
    private static NetworkLatencyLogger f30388b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Logger {
        int deleteEntries(String str, long j, long j2);

        List getEvents(long j, long j2, int i, int i2);

        List getEvents(long j, long j2, int i, int i2, int i3, int i4);

        boolean isNopLogger();

        void logAsync(Object obj);
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface NetworkActivityLogger extends Logger {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface NetworkLatencyLogger extends Logger {
    }

    private RadiosTracingLoggerProvider() {
    }

    public static NetworkActivityLogger getNetworkActivityLoggerImpl() {
        return f30387a;
    }

    public static NetworkLatencyLogger getNetworkLatencyLoggerImpl() {
        return f30388b;
    }

    public static void setNetworkActivityLoggerImpl(NetworkActivityLogger networkActivityLogger) {
        f30387a = networkActivityLogger;
    }

    public static void setNetworkLatencyLoggerImpl(NetworkLatencyLogger networkLatencyLogger) {
        f30388b = networkLatencyLogger;
    }
}
