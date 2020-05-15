package p000;

import java.util.concurrent.Executor;

/* renamed from: cisd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisd implements Executor {

    /* renamed from: a */
    final /* synthetic */ Executor f191318a;

    /* renamed from: b */
    final /* synthetic */ int f191319b;

    /* renamed from: c */
    final /* synthetic */ boolean f191320c;

    /* renamed from: d */
    final /* synthetic */ int f191321d;

    public cisd(Executor executor, int i, boolean z, int i2) {
        this.f191318a = executor;
        this.f191319b = i;
        this.f191320c = z;
        this.f191321d = i2;
    }

    public final void execute(Runnable runnable) {
        this.f191318a.execute(new cirx(this, runnable));
    }
}
