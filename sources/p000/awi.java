package p000;

/* renamed from: awi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ awj f2421a;

    public awi(awj awj) {
        this.f2421a = awj;
    }

    public final void run() {
        for (int size = this.f2421a.f2422a.f1807a.size() - 1; size >= 0; size--) {
            awe awe = (awe) this.f2421a.f2422a.f1807a.get(size);
        }
        this.f2421a.f2422a.mo2194a();
    }
}
