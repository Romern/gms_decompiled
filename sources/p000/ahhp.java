package p000;

import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ahhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahhp implements ahhq {

    /* renamed from: a */
    public final bqgj f67221a;

    public ahhp(bqgj bqgj) {
        this.f67221a = bqgj;
    }

    /* renamed from: a */
    private static ahho m55791a(Thread thread, ahho ahho) {
        ahho ahho2 = new ahho(ahho);
        ahho2.setStackTrace(thread.getStackTrace());
        return ahho2;
    }

    /* renamed from: b */
    public final void mo36504b() {
        this.f67221a.shutdownNow();
    }

    /* renamed from: a */
    public static bqgy m55792a(bqgj bqgj, ahho ahho) {
        bqgy c = bqgy.m112818c();
        try {
            bqgj.execute(new ahhn(c, Thread.currentThread(), ahho));
        } catch (RejectedExecutionException e) {
            c.mo69136a((Throwable) e);
        }
        return c;
    }

    /* renamed from: a */
    static final /* synthetic */ void m55793a(bqgy bqgy, Thread thread, ahho ahho) {
        long uptimeMillis = SystemClock.uptimeMillis();
        while (true) {
            try {
                bqgy.get(cfnv.m140743E(), TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
            } catch (TimeoutException e3) {
                bnsl bnsl = (bnsl) ahfp.f67119a.mo68388c();
                bnsl.mo68437a(m55791a(thread, ahho));
                bnsl.mo68415a("Method is still running after %d millis.", SystemClock.uptimeMillis() - uptimeMillis);
            }
        }
        if (SystemClock.uptimeMillis() - uptimeMillis > cfnv.m140743E()) {
            bnsl bnsl2 = (bnsl) ahfp.f67119a.mo68388c();
            bnsl2.mo68437a(m55791a(thread, ahho));
            bnsl2.mo68415a("Method finished running after %d millis.", SystemClock.uptimeMillis() - uptimeMillis);
        }
    }

    /* renamed from: a */
    public final Runnable mo36501a(Runnable runnable) {
        return new ahhl(this, new ahho(), runnable);
    }

    /* renamed from: a */
    public final Callable mo36502a(Callable callable) {
        return new ahhm(this, new ahho(), callable);
    }

    /* renamed from: a */
    public final void mo36503a() {
        this.f67221a.shutdown();
    }
}
