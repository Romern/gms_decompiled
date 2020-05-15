package p000;

import android.os.Process;

/* renamed from: bboq */
final /* synthetic */ class bboq implements Runnable {

    /* renamed from: a */
    private final Runnable f103027a;

    public bboq(Runnable runnable) {
        this.f103027a = runnable;
    }

    public final void run() {
        Runnable runnable = this.f103027a;
        Process.setThreadPriority(10);
        runnable.run();
    }
}
