package p000;

import android.content.Context;

/* renamed from: tpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tpy {

    /* renamed from: a */
    private final qws f46471a;

    /* renamed from: b */
    private final bsmt f46472b;

    private tpy(Context context, String str, bsmt bsmt) {
        this.f46471a = new qws(context, "IDENTITY_FRONTEND", str);
        this.f46472b = bsmt;
    }

    /* renamed from: a */
    public static tpy m37326a(Context context, String str, bsmt bsmt) {
        return new tpy(context, str, bsmt);
    }

    /* renamed from: a */
    public final void mo26715a(int i) {
        bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
        bsmt bsmt = this.f46472b;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp = (bspp) bxvf.f164949b;
        bspp.f146556b = bsmt.f145305dO;
        int i2 = bspp.f146555a | 1;
        bspp.f146555a = i2;
        bspp.f146557c = i - 1;
        bspp.f146555a = i2 | 2;
        bspp bspp2 = (bspp) bxvf.mo74062i();
        bxvd da = bspq.f146567d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspq bspq = (bspq) da.f164949b;
        bspp2.getClass();
        bspq.f146570b = bspp2;
        bspq.f146569a |= 1;
        mo26716a((bspq) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo26716a(bspq bspq) {
        this.f46471a.mo24335a(bspq.serializeToBytes()).mo24327b();
    }
}
