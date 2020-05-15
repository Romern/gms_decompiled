package p000;

import java.util.concurrent.Executor;

/* renamed from: bqdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqdk {

    /* renamed from: a */
    static final bqdk f140506a = new bqdk(null, null);

    /* renamed from: b */
    final Runnable f140507b;

    /* renamed from: c */
    final Executor f140508c;
    bqdk next;

    public bqdk(Runnable runnable, Executor executor) {
        this.f140507b = runnable;
        this.f140508c = executor;
    }
}
