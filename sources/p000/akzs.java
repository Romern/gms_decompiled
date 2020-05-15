package p000;

import android.content.Context;

/* renamed from: akzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akzs {

    /* renamed from: a */
    public final Context f73187a;

    /* renamed from: b */
    qws f73188b;

    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context, ak], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public akzs(Context r4, akzl akzl) {
        this.f73187a = r4;
        this.f73188b = new qws(r4, "IDENTITY_FRONTEND", akzl.mo40018a());
        akzl.f73168c.mo2445a(r4, new akzr(this));
    }

    /* renamed from: a */
    public static bspq m60722a(int i) {
        bxvd da = bspq.f146567d.mo74144da();
        bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
        bsmt bsmt = bsmt.OCTARINE_WEBVIEWS;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp = (bspp) bxvf.f164949b;
        bspp.f146556b = bsmt.f145305dO;
        int i2 = bspp.f146555a | 1;
        bspp.f146555a = i2;
        bspp.f146557c = i - 1;
        int i3 = i2 | 2;
        bspp.f146555a = i3;
        bspp.f146555a = i3 | 16;
        bspp.f146560f = true;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspq bspq = (bspq) da.f164949b;
        bspp bspp2 = (bspp) bxvf.mo74062i();
        bspp2.getClass();
        bspq.f146570b = bspp2;
        bspq.f146569a |= 1;
        return (bspq) da.mo74062i();
    }

    public akzs(Context context, String str) {
        this.f73187a = context;
        this.f73188b = new qws(context, "IDENTITY_FRONTEND", str);
    }

    /* renamed from: a */
    public final void mo40030a() {
        mo40031a(m60722a(17003));
    }

    /* renamed from: a */
    public final void mo40031a(bspq bspq) {
        this.f73188b.mo24335a(bspq.serializeToBytes()).mo24327b();
    }
}
