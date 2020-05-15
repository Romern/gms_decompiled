package p000;

import java.util.concurrent.Executor;

/* renamed from: dqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dqc implements Executor {

    /* renamed from: a */
    final /* synthetic */ dqx f13806a;

    /* renamed from: b */
    final /* synthetic */ dqd f13807b;

    public dqc(dqd dqd, dqx dqx) {
        this.f13807b = dqd;
        this.f13806a = dqx;
    }

    public final void execute(Runnable runnable) {
        this.f13807b.mo9435a(runnable, this.f13806a);
    }
}
