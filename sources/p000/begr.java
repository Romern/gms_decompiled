package p000;

import java.io.Closeable;
import java.util.concurrent.Semaphore;

/* renamed from: begr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class begr implements Closeable {

    /* renamed from: a */
    public Semaphore f111548a;

    public begr(Semaphore semaphore) {
        this.f111548a = semaphore;
    }

    /* renamed from: a */
    public final Semaphore mo60702a() {
        Semaphore semaphore = this.f111548a;
        this.f111548a = null;
        return semaphore;
    }

    public final void close() {
        Semaphore semaphore = this.f111548a;
        if (semaphore != null) {
            semaphore.release();
            this.f111548a = null;
        }
    }
}
