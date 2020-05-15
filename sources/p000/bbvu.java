package p000;

import android.graphics.Bitmap;

/* renamed from: bbvu */
final /* synthetic */ class bbvu implements bmxj {

    /* renamed from: a */
    private final bbwq f103543a;

    /* renamed from: b */
    private final bcsp f103544b;

    /* renamed from: c */
    private final bcoh f103545c;

    public bbvu(bbwq bbwq, bcsp bcsp, bcoh bcoh) {
        this.f103543a = bbwq;
        this.f103544b = bcsp;
        this.f103545c = bcoh;
    }

    public final Object apply(Object obj) {
        bcsp bcsp;
        bbwq bbwq = this.f103543a;
        bcsp bcsp2 = this.f103544b;
        bcoh bcoh = this.f103545c;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            bcso m = bcsp2.mo57329m();
            m.mo57468b(false);
            m.mo57458a(bitmap);
            bcsp = m.mo57457a();
            bcfx bcfx = bbwq.f103608f;
            bcnr q = bcns.m89409q();
            q.mo57011b(38);
            q.mo57012b(bcoh.mo57058b().mo57074e());
            q.mo57010a(bcoh.mo57059c().mo73781l());
            q.mo57008a(bcsp2.mo57317a());
            bcfx.mo56753a(q.mo57002a());
        } else {
            bcso m2 = bcsp2.mo57329m();
            m2.mo57468b(true);
            bcsp = m2.mo57457a();
            bcfx bcfx2 = bbwq.f103608f;
            bcnr q2 = bcns.m89409q();
            q2.mo57011b(39);
            q2.mo57012b(bcoh.mo57058b().mo57074e());
            q2.mo57010a(bcoh.mo57059c().mo73781l());
            q2.mo57008a(bcsp2.mo57317a());
            bcfx2.mo56753a(q2.mo57002a());
        }
        bbwq.mo56473c(bcoh).mo56621a(bcsp);
        return bcsp;
    }
}
