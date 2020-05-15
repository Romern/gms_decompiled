package p000;

import android.content.Context;
import java.lang.Thread;
import java.util.ArrayList;

/* renamed from: fin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fin implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f16666a;

    /* renamed from: b */
    private final fjk f16667b;

    /* renamed from: c */
    private final Context f16668c;

    /* renamed from: d */
    private fip f16669d;

    /* renamed from: e */
    private fjh f16670e;

    public fin(fjk fjk, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        String str;
        if (context != null) {
            this.f16666a = uncaughtExceptionHandler;
            this.f16667b = fjk;
            this.f16670e = new fjh(context, new ArrayList());
            this.f16668c = context.getApplicationContext();
            if (uncaughtExceptionHandler != null) {
                str = uncaughtExceptionHandler.getClass().getName();
            } else {
                str = "null";
            }
            String valueOf = String.valueOf(str);
            fnq.m12016a(valueOf.length() == 0 ? new String("ExceptionReporter created, original handler is ") : "ExceptionReporter created, original handler is ".concat(valueOf));
            return;
        }
        throw new NullPointerException("context cannot be null");
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String str;
        if (this.f16670e == null) {
            str = "UncaughtException";
        } else {
            str = this.f16670e.mo10888a(thread != null ? thread.getName() : null, th);
        }
        String valueOf = String.valueOf(str);
        fnq.m12016a(valueOf.length() == 0 ? new String("Reporting uncaught exception: ") : "Reporting uncaught exception: ".concat(valueOf));
        fjk fjk = this.f16667b;
        fiq fiq = new fiq();
        fiq.mo10859a(str);
        fiq.mo10860a(true);
        fjk.mo10893a(fiq.mo10861a());
        if (this.f16669d == null) {
            this.f16669d = fip.m11765a(this.f16668c);
        }
        fip fip = this.f16669d;
        fip.mo10856b().mo10922b();
        fip.mo10856b().mo10924d();
        if (this.f16666a != null) {
            fnq.m12016a("Passing exception to the original handler");
            this.f16666a.uncaughtException(thread, th);
        }
    }
}
