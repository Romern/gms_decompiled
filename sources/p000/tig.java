package p000;

/* renamed from: tig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tig implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Object f46065a;

    /* renamed from: b */
    final /* synthetic */ tih f46066b;

    public tig(tih tih, Object obj) {
        this.f46066b = tih;
        this.f46065a = obj;
    }

    public final void run() {
        this.f46066b.cancelLoad();
        this.f46066b.deliverResult(this.f46065a);
    }
}
