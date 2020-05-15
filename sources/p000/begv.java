package p000;

import java.io.Closeable;

/* renamed from: begv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class begv implements Closeable {

    /* renamed from: a */
    public Closeable f111550a;

    private begv(Closeable closeable) {
        this.f111550a = closeable;
    }

    /* renamed from: a */
    public static begv m95030a(Closeable closeable) {
        return new begv(closeable);
    }

    /* renamed from: a */
    public final Closeable mo60707a() {
        Closeable closeable = this.f111550a;
        this.f111550a = null;
        return closeable;
    }

    public final void close() {
        Closeable closeable = this.f111550a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
