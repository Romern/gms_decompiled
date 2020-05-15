package p000;

import android.graphics.Bitmap;

/* renamed from: bbry */
final /* synthetic */ class bbry implements bmxj {

    /* renamed from: a */
    private final bbsc f103260a;

    /* renamed from: b */
    private final bcsj f103261b;

    /* renamed from: c */
    private final bcoh f103262c;

    public bbry(bbsc bbsc, bcsj bcsj, bcoh bcoh) {
        this.f103260a = bbsc;
        this.f103261b = bcsj;
        this.f103262c = bcoh;
    }

    public final Object apply(Object obj) {
        bcsj bcsj;
        bbsc bbsc = this.f103260a;
        bcsj bcsj2 = this.f103261b;
        bcoh bcoh = this.f103262c;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            bcsi l = bcsj2.mo57313l();
            l.mo57444a(false);
            l.mo57437a(bitmap);
            bcsj = l.mo57436a();
            bcfx bcfx = bbsc.f103275c;
            bcnr q = bcns.m89409q();
            q.mo57011b(38);
            q.mo57012b(bcoh.mo57058b().mo57074e());
            q.mo57010a(bcoh.mo57059c().mo73781l());
            q.mo57007a(bcsj2.mo57302a());
            bcfx.mo56753a(q.mo57002a());
        } else {
            bcsi l2 = bcsj2.mo57313l();
            l2.mo57444a(true);
            bcsj = l2.mo57436a();
            bcfx bcfx2 = bbsc.f103275c;
            bcnr q2 = bcns.m89409q();
            q2.mo57011b(39);
            q2.mo57012b(bcoh.mo57058b().mo57074e());
            q2.mo57010a(bcoh.mo57059c().mo73781l());
            q2.mo57007a(bcsj2.mo57302a());
            bcfx2.mo56753a(q2.mo57002a());
        }
        bbsc.mo56391a(bcoh).mo56652c(bcsj);
        return bcsj;
    }
}
