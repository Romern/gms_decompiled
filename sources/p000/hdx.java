package p000;

/* renamed from: hdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hdx implements bqfp {

    /* renamed from: a */
    final /* synthetic */ hdz f19552a;

    public hdx(hdz hdz) {
        this.f19552a = hdz;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        hdz hdz = this.f19552a;
        hdz.f19562c.add(hdz.f19563d);
        hdz hdz2 = this.f19552a;
        hdz2.mo12422a(hdz2.f19563d, true);
        if (bmxv.mo66813a()) {
            this.f19552a.f19563d = bmxv.mo66814b();
            this.f19552a.mo12428f();
            return;
        }
        this.f19552a.f19560a.run();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        hdz hdz = this.f19552a;
        hdz.f19562c.add(hdz.f19563d);
        hdz hdz2 = this.f19552a;
        hdz2.mo12422a(hdz2.f19563d, false);
        this.f19552a.f19561b.mo9443a(th);
    }
}
