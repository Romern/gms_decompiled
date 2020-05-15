package p000;

import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.RefCounted;

/* renamed from: ciup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciup implements RefCounted {

    /* renamed from: a */
    private final AtomicInteger f191499a = new AtomicInteger(1);

    /* renamed from: b */
    private final Runnable f191500b;

    public ciup(Runnable runnable) {
        this.f191500b = runnable;
    }

    public final void release() {
        Runnable runnable;
        int decrementAndGet = this.f191499a.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("release() called on an object with refcount < 1");
        } else if (decrementAndGet == 0 && (runnable = this.f191500b) != null) {
            runnable.run();
        }
    }

    public final void retain() {
        if (this.f191499a.incrementAndGet() < 2) {
            throw new IllegalStateException("retain() called on an object with refcount < 1");
        }
    }
}
