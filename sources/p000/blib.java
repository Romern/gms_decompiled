package p000;

import java.util.concurrent.Executor;

/* renamed from: blib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blib implements Runnable {

    /* renamed from: a */
    public bqeg f126598a;

    /* renamed from: b */
    public Executor f126599b;

    public blib(bqeg bqeg, Executor executor) {
        bmxy.m108581a(bqeg);
        this.f126598a = bqeg;
        bmxy.m108581a(executor);
        this.f126599b = executor;
    }

    public final void run() {
        this.f126598a = null;
        this.f126599b = null;
    }
}
