package p000;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* renamed from: behl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class behl implements Closeable {

    /* renamed from: a */
    public final behk f111562a;

    /* renamed from: b */
    private final long f111563b;

    /* renamed from: c */
    private long f111564c = System.currentTimeMillis();

    public behl(behk behk, long j, TimeUnit timeUnit) {
        this.f111562a = behk;
        this.f111563b = timeUnit.toMillis(j);
    }

    /* renamed from: a */
    public final void mo60709a(int i) {
        this.f111562a.mo56095a(i);
        if (System.currentTimeMillis() - this.f111564c >= this.f111563b) {
            this.f111562a.mo56094a();
            this.f111564c = System.currentTimeMillis();
        }
    }

    public final void close() {
        this.f111562a.mo56094a();
    }
}
