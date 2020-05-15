package p000;

import android.os.Process;

/* renamed from: ceq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ceq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f6624a;

    public ceq(Runnable runnable) {
        this.f6624a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.f6624a.run();
    }
}
