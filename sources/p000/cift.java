package p000;

import java.util.logging.Level;

/* renamed from: cift */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cift implements Runnable {

    /* renamed from: a */
    final /* synthetic */ chwu f190031a;

    public cift(chwu chwu) {
        this.f190031a = chwu;
    }

    public final void run() {
        chwu chwu = this.f190031a;
        long j = chwu.f189424a;
        long max = Math.max(j + j, j);
        if (chwu.f189425b.f189428c.compareAndSet(chwu.f189424a, max)) {
            chwv.f189426a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{chwu.f189425b.f189427b, Long.valueOf(max)});
        }
    }
}
