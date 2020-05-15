package p000;

import java.util.concurrent.TimeoutException;

/* renamed from: bqhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqhc extends TimeoutException {
    public bqhc(String str) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
