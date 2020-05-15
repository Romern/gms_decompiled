package p000;

import android.os.Process;

/* renamed from: cirl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cirl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f191283a;

    /* renamed from: b */
    final /* synthetic */ cirm f191284b;

    public cirl(cirm cirm, Runnable runnable) {
        this.f191284b = cirm;
        this.f191283a = runnable;
    }

    public final void run() {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(this.f191284b.f191285a);
        this.f191283a.run();
    }
}
