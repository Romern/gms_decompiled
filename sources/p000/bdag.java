package p000;

/* renamed from: bdag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdag implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bdah f105226a;

    public bdag(bdah bdah) {
        this.f105226a = bdah;
    }

    /* renamed from: a */
    public final void mo6480a(Object obj) {
        synchronized (this.f105226a) {
            bdah bdah = this.f105226a;
            bdah.f105230d = (bdar) bdah.f105227a.apply(obj);
            bdah bdah2 = this.f105226a;
            if (!bdah2.f105229c) {
                bdah2.f105230d.mo56710a(bdah2.f105228b);
            }
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
    }
}
