package p000;

/* renamed from: cazx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cazx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bqgg f176464a;

    /* renamed from: b */
    final /* synthetic */ cazy f176465b;

    public cazx(cazy cazy, bqgg bqgg) {
        this.f176465b = cazy;
        this.f176464a = bqgg;
    }

    public final void run() {
        synchronized (this.f176465b.f176467b) {
            this.f176465b.f176467b.remove(this.f176464a);
        }
    }
}
