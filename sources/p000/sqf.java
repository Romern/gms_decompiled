package p000;

/* renamed from: sqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sqf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ sqj f44958a;

    public sqf(sqj sqj) {
        this.f44958a = sqj;
    }

    public final void run() {
        synchronized (this.f44958a.f44962a) {
            synchronized (this.f44958a.f44963b) {
                sqj sqj = this.f44958a;
                sqj.mo25973a(sqj.f44966e);
            }
            this.f44958a.f44966e.clear();
        }
    }
}
