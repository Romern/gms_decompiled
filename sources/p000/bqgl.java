package p000;

/* renamed from: bqgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqgl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f140621a;

    /* renamed from: b */
    final /* synthetic */ bqgm f140622b;

    public bqgl(bqgm bqgm, Runnable runnable) {
        this.f140622b = bqgm;
        this.f140621a = runnable;
    }

    public final void run() {
        this.f140622b.f140623a = false;
        this.f140621a.run();
    }

    public final String toString() {
        return this.f140621a.toString();
    }
}
