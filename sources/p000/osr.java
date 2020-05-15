package p000;

import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: osr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class osr implements Closeable {

    /* renamed from: a */
    private final Closeable f38357a;

    /* renamed from: b */
    private final int f38358b;

    /* renamed from: c */
    private final AtomicBoolean f38359c;

    public osr(Closeable closeable, AtomicBoolean atomicBoolean, int i) {
        this.f38357a = closeable;
        this.f38358b = i;
        this.f38359c = atomicBoolean;
    }

    public final void close() {
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        this.f38357a.close();
        if (this.f38358b == 1) {
            this.f38359c.set(false);
        }
    }
}
