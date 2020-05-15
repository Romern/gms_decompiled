package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* renamed from: nus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nus implements Runnable {

    /* renamed from: a */
    public final CountDownLatch f36565a = new CountDownLatch(1);

    /* renamed from: b */
    public Object f36566b;

    /* renamed from: c */
    public IllegalStateException f36567c;

    /* renamed from: d */
    private final Callable f36568d;

    public nus(Callable callable) {
        this.f36568d = callable;
    }

    public final void run() {
        try {
            this.f36566b = this.f36568d.call();
        } catch (IllegalStateException e) {
            this.f36567c = e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
        this.f36565a.countDown();
    }
}
