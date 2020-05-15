package p000;

/* renamed from: cibf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cibf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cibg f189705a;

    public cibf(cibg cibg) {
        this.f189705a = cibg;
    }

    public final void run() {
        cibg cibg = this.f189705a;
        cibg.f189708c.f189719j.remove(cibg.f189706a);
        if (this.f189705a.f189708c.f189723n.f189033a == chrg.SHUTDOWN && this.f189705a.f189708c.f189719j.isEmpty()) {
            this.f189705a.f189708c.mo85901d();
        }
    }
}
