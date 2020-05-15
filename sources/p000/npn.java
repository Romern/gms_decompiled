package p000;

import java.lang.Thread;

/* renamed from: npn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class npn implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    Thread.UncaughtExceptionHandler f36337b;

    /* renamed from: c */
    public boolean f36338c;

    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f36337b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
