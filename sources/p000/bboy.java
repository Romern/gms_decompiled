package p000;

import android.os.Process;

/* renamed from: bboy */
final /* synthetic */ class bboy implements Runnable {

    /* renamed from: a */
    private final Runnable f103030a;

    public bboy(Runnable runnable) {
        this.f103030a = runnable;
    }

    public final void run() {
        Runnable runnable = this.f103030a;
        Process.setThreadPriority(10);
        runnable.run();
    }
}
