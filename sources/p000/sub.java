package p000;

import android.os.Process;

/* renamed from: sub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sub implements Runnable {

    /* renamed from: a */
    private final Runnable f45163a;

    /* renamed from: b */
    private final int f45164b;

    public sub(Runnable runnable, int i) {
        this.f45163a = runnable;
        this.f45164b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f45164b);
        this.f45163a.run();
    }
}
