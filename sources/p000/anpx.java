package p000;

/* renamed from: anpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anpx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f77424a;

    /* renamed from: b */
    final /* synthetic */ anqe f77425b;

    public anpx(anqe anqe, int i) {
        this.f77425b = anqe;
        this.f77424a = i;
    }

    public final void run() {
        anqe anqe = this.f77425b;
        anqe.f77444q = 2;
        if (this.f77424a == -1) {
            anqe.mo42079g();
        } else {
            anqe.mo42080h();
        }
    }
}
