package p000;

import java.util.concurrent.Executor;

/* renamed from: drq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class drq implements Executor {

    /* renamed from: a */
    final /* synthetic */ dqx f13889a;

    /* renamed from: b */
    final /* synthetic */ drv f13890b;

    public drq(drv drv, dqx dqx) {
        this.f13890b = drv;
        this.f13889a = dqx;
    }

    public final void execute(Runnable runnable) {
        this.f13890b.mo9435a(runnable, this.f13889a);
    }
}
