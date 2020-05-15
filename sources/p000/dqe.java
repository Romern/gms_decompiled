package p000;

import java.util.concurrent.Executor;

/* renamed from: dqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dqe implements Executor {

    /* renamed from: a */
    final /* synthetic */ dqx f13810a;

    /* renamed from: b */
    final /* synthetic */ dqg f13811b;

    public dqe(dqg dqg, dqx dqx) {
        this.f13811b = dqg;
        this.f13810a = dqx;
    }

    public final void execute(Runnable runnable) {
        this.f13811b.mo9435a(runnable, this.f13810a);
    }
}
