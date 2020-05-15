package p000;

import java.io.Closeable;
import java.util.concurrent.Semaphore;

/* renamed from: begq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class begq implements Closeable {

    /* renamed from: a */
    private Semaphore f111547a;

    public begq(Semaphore semaphore) {
        this.f111547a = semaphore;
    }

    public final void close() {
        Semaphore semaphore = this.f111547a;
        if (semaphore != null) {
            semaphore.release();
            this.f111547a = null;
        }
    }
}
