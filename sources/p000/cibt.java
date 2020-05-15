package p000;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cibt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cibt implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ cicv f189749a;

    public cibt(cicv cicv) {
        this.f189749a = cicv;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = cicv.f189797a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(this.f189749a.f189832g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
        sb.append("[");
        sb.append(valueOf);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$1", "uncaughtException", sb.toString(), th);
        cicv cicv = this.f189749a;
        if (!cicv.f189845t) {
            cicv.f189845t = true;
            cicv.mo85956b(true);
            cicv.mo85955a(false);
            cicv.mo85953a(new cibw(th));
            cicv.f189807E.mo85552a(4, "PANIC! Entering TRANSIENT_FAILURE");
            cicv.f189840o.mo85813a(chrg.TRANSIENT_FAILURE);
        }
    }
}
