package p000;

import org.chromium.net.InlineExecutionProhibitedException;

/* renamed from: cisz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisz implements Runnable {

    /* renamed from: a */
    public Thread f191378a;

    /* renamed from: b */
    public InlineExecutionProhibitedException f191379b;

    /* renamed from: c */
    private final Runnable f191380c;

    public cisz(Runnable runnable, Thread thread) {
        this.f191380c = runnable;
        this.f191378a = thread;
    }

    public final void run() {
        if (Thread.currentThread() == this.f191378a) {
            this.f191379b = new InlineExecutionProhibitedException();
        } else {
            this.f191380c.run();
        }
    }
}
