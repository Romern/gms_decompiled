package p000;

/* renamed from: aycz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aycz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aydn f97194a;

    public aycz(aydn aydn) {
        this.f97194a = aydn;
    }

    public final void run() {
        aycm aycm = this.f97194a.f97225f;
        if (aycm != null) {
            ayjn.m84115a(aycm);
            this.f97194a.f97225f = null;
        }
        aycs aycs = this.f97194a.f97226g;
        if (aycs != null) {
            ayjn.m84115a(aycs);
            this.f97194a.f97226g = null;
        }
        ayds ayds = this.f97194a.f97228i;
        if (ayds != null) {
            ayjn.m84115a(ayds);
            this.f97194a.f97228i = null;
        }
        aybl aybl = this.f97194a.f97227h;
        if (aybl != null) {
            aybl.mo53859a();
            this.f97194a.f97227h = null;
        }
    }
}
