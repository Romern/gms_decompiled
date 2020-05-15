package p000;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: qcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qcq {

    /* renamed from: b */
    private static qcq f40932b;

    /* renamed from: a */
    public final ConcurrentLinkedQueue f40933a = new ConcurrentLinkedQueue();

    private qcq() {
    }

    /* renamed from: a */
    public static synchronized qcq m31858a() {
        qcq qcq;
        synchronized (qcq.class) {
            if (f40932b == null) {
                f40932b = new qcq();
            }
            qcq = f40932b;
        }
        return qcq;
    }
}
