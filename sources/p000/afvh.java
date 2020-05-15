package p000;

import android.content.Context;

/* renamed from: afvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afvh implements cayy {

    /* renamed from: a */
    private final cijl f64839a;

    /* renamed from: b */
    private final cijl f64840b;

    public afvh(cijl cijl, cijl cijl2) {
        this.f64839a = cijl;
        this.f64840b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        ayte b = aytf.m84780b();
        bely b2 = ((afvl) this.f64840b).mo6445a();
        long a = cfhd.f184080a.mo6606a().mo81231a();
        bmzi bmzi = afvb.f64833a;
        bmzi bmzi2 = afvc.f64834a;
        bmzi bmzi3 = afvd.f64835a;
        belr a2 = bels.m95262a((Context) this.f64839a.mo6445a());
        a2.f111790b = snp.m35704b(10);
        a2.f111791c = batx.m87540a(b, b2.mo60792a(), (int) a);
        a2.f111792d = bmzi;
        a2.f111793e = bmzi2;
        a2.f111794f = bmzi3;
        bels a3 = a2.mo60784a();
        cazf.m127593a(a3, "Cannot return null from a non-@Nullable @Provides method");
        return a3;
    }
}
