package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: bqfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqfq implements Runnable {

    /* renamed from: a */
    final Future f140602a;

    /* renamed from: b */
    final bqfp f140603b;

    public bqfq(Future future, bqfp bqfp) {
        this.f140602a = future;
        this.f140603b = bqfp;
    }

    public final void run() {
        Throwable f;
        Future future = this.f140602a;
        if (!(future instanceof bqhj) || (f = ((bqhj) future).mo69141f()) == null) {
            try {
                this.f140603b.mo6480a(bqga.m112780a(this.f140602a));
            } catch (ExecutionException e) {
                this.f140603b.mo6481a(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f140603b.mo6481a(e2);
            }
        } else {
            this.f140603b.mo6481a(f);
        }
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66881a(this.f140603b);
        return a.toString();
    }
}
