package p000;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: bocc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bocc implements bqeh {

    /* renamed from: a */
    final /* synthetic */ bqgg f132527a;

    /* renamed from: b */
    final /* synthetic */ bocg f132528b;

    public bocc(bocg bocg, bqgg bqgg) {
        this.f132528b = bocg;
        this.f132527a = bqgg;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Exception]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo6375a(Object obj) {
        Exception exc = (Exception) obj;
        if (this.f132527a.isCancelled()) {
            return this.f132527a;
        }
        bocg bocg = this.f132528b;
        bobv bobv = bocg.f132541d;
        int i = bocg.f132545h;
        this.f132528b.f132543f.mo66928a(TimeUnit.MILLISECONDS);
        int d = bobv.mo68897d(i);
        if (d < 0 || !this.f132528b.f132542e.mo6527a(exc)) {
            bocg.f132537a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "terminalExceptionCaught", "RetryingFuture caught terminal exception", (Throwable) exc);
            int i2 = this.f132528b.f132545h;
            throw new bobq(exc);
        }
        bocg.f132537a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "retryableExceptionCaught", "RetryingFuture caught exception; retrying", (Throwable) exc);
        this.f132528b.mo68903a((long) d, TimeUnit.MILLISECONDS);
        return bqga.m112775a(bocg.f132538b);
    }
}
