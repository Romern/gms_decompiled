package p000;

import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: bqes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqes extends IdentityHashMap implements Closeable {

    /* renamed from: a */
    private volatile boolean f140554a;

    /* renamed from: b */
    private volatile CountDownLatch f140555b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69183a(Closeable closeable, Executor executor) {
        bmxy.m108581a(executor);
        if (closeable != null) {
            synchronized (this) {
                if (!this.f140554a) {
                    put(closeable, executor);
                } else {
                    bqeu.m112718a(closeable, executor);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo69184b(Closeable closeable, Executor executor) {
        bmxy.m108581a(executor);
        if (closeable != null) {
            mo69183a(closeable, executor);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        p000.bqeu.m112718a((java.io.Closeable) r1.getKey(), (java.util.concurrent.Executor) r1.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        r0 = entrySet().iterator();
     */
    public final void close() {
        if (!this.f140554a) {
            synchronized (this) {
                if (!this.f140554a) {
                    this.f140554a = true;
                }
            }
        }
    }
}
