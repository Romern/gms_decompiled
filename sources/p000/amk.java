package p000;

/* renamed from: amk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ amm f907a;

    public amk(amm amm) {
        this.f907a = amm;
    }

    public final void run() {
        amm amm = this.f907a;
        int size = amm.f915g.size();
        for (int i = 0; i < size; i++) {
            ((alo) amm.f915g.valueAt(i)).mo958a(null, null);
        }
        amm.f915g.clear();
    }
}
