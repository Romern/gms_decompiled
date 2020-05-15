package p000;

/* renamed from: ill */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ill implements aubq {

    /* renamed from: a */
    final /* synthetic */ aubq f21291a;

    /* renamed from: b */
    final /* synthetic */ ilm f21292b;

    public ill(ilm ilm, aubq aubq) {
        this.f21292b = ilm;
        this.f21291a = aubq;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50387e() != null) {
            ilm.f21293a.mo25417e("Previous checkin failed", aucb.mo50387e(), new Object[0]);
        }
        ilm ilm = this.f21292b;
        aubq aubq = this.f21291a;
        qcw qcw = new qcw(ilm.f21295b, ilm);
        qcw.mo23921b();
        ilm.f21296c.mo23912a(qcw.mo23920a()).mo50371a(aubq);
    }
}
