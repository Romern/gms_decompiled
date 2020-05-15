package p000;

/* renamed from: awf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ awg f2418a;

    public awf(awg awg) {
        this.f2418a = awg;
    }

    public final void run() {
        for (int size = this.f2418a.f2419a.f1807a.size() - 1; size >= 0; size--) {
            ((awe) this.f2418a.f2419a.f1807a.get(size)).mo2750a();
        }
        this.f2418a.f2419a.mo2194a();
    }
}
