package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bqfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqfh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bqgg f140590a;

    /* renamed from: b */
    final /* synthetic */ bqgg f140591b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f140592c;

    /* renamed from: d */
    final /* synthetic */ bqgy f140593d;

    /* renamed from: e */
    final /* synthetic */ bqgg f140594e;

    public bqfh(bqgg bqgg, bqgg bqgg2, AtomicReference atomicReference, bqgy bqgy, bqgg bqgg3) {
        this.f140590a = bqgg;
        this.f140591b = bqgg2;
        this.f140592c = atomicReference;
        this.f140593d = bqgy;
        this.f140594e = bqgg3;
    }

    public final void run() {
        if (this.f140590a.isDone() || (this.f140591b.isCancelled() && this.f140592c.compareAndSet(bqfi.NOT_RUN, bqfi.CANCELLED))) {
            this.f140593d.mo69137b(this.f140594e);
        }
    }
}
