package p000;

import android.os.Process;

/* renamed from: aace */
final /* synthetic */ class aace implements Runnable {

    /* renamed from: a */
    private final Runnable f27921a;

    public aace(Runnable runnable) {
        this.f27921a = runnable;
    }

    public final void run() {
        Runnable runnable = this.f27921a;
        Process.setThreadPriority(10);
        bljj bljj = aach.f27932a;
        bljg a = bljj.f126673a.mo66584a("common_PhantomFutures", bljj.f126674b, 1, bljj.f126675c);
        try {
            runnable.run();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
