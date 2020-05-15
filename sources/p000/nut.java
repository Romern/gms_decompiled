package p000;

/* renamed from: nut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nut implements Runnable {

    /* renamed from: a */
    private final Runnable f36569a;

    /* renamed from: b */
    private volatile boolean f36570b = false;

    /* renamed from: c */
    private Exception f36571c;

    public nut(Runnable runnable) {
        this.f36569a = runnable;
    }

    /* renamed from: a */
    public final void mo21620a() {
        synchronized (this) {
            while (!this.f36570b) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            Exception exc = this.f36571c;
            if (exc != null) {
                throw new RuntimeException(exc);
            }
        }
    }

    public final void run() {
        try {
            this.f36569a.run();
        } catch (Exception e) {
            this.f36571c = e;
        }
        synchronized (this) {
            this.f36570b = true;
            notifyAll();
        }
    }
}
