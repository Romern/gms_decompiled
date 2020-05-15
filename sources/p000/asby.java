package p000;

import android.os.Looper;
import java.lang.Thread;

/* renamed from: asby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asby implements Thread.UncaughtExceptionHandler {

    /* renamed from: c */
    private static final Logger f88683c = ascp.m73787a("Utils", "CascadingUncaughtExceptionHandler");

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f88684a;

    /* renamed from: b */
    final /* synthetic */ ascm f88685b;

    public asby(ascm ascm, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f88685b = ascm;
        this.f88684a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Logger Logger = f88683c;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Uncaught exception: ");
        sb.append(valueOf);
        Logger.mo25412b(sb.toString(), new Object[0]);
        try {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper.getThread() != thread) {
                new adzt(mainLooper).post(new ascl(this));
            } else {
                this.f88685b.mo49044a();
            }
        } catch (Exception e) {
            try {
                f88683c.mo25417e("Error reporting crash", e, new Object[0]);
            } catch (Exception e2) {
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f88684a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
