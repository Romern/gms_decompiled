package p000;

import java.util.concurrent.Executor;

/* renamed from: bqfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqfg implements Executor {

    /* renamed from: a */
    final /* synthetic */ bqgg f140588a;

    /* renamed from: b */
    final /* synthetic */ Executor f140589b;

    public bqfg(bqgg bqgg, Executor executor) {
        this.f140588a = bqgg;
        this.f140589b = executor;
    }

    public final void execute(Runnable runnable) {
        this.f140588a.mo741a(runnable, this.f140589b);
    }
}
