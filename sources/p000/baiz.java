package p000;

import java.util.List;

/* renamed from: baiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baiz extends cazu {

    /* renamed from: b */
    private final cazn f101028b;

    /* renamed from: c */
    private final cazn f101029c;

    public baiz(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(baiz.class), cijl);
        this.f101028b = cbac.m127643a(cazn);
        this.f101029c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f101028b.mo75201b(), this.f101029c.mo75201b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [bngx, baiu]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        bajy bajy = new bajy(((Long) list.get(1)).longValue());
        bxvd da = byhb.f166421b.mo74144da();
        bajy.getClass();
        List a = bnkn.m109668a((List) ((bngx) list.get(0)), (bmxj) new baiu(bajy));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byhb byhb = (byhb) da.f164949b;
        if (!byhb.f166423a.mo73666a()) {
            byhb.f166423a = GeneratedMessageLite.m124021a(byhb.f166423a);
        }
        bxsy.m123078a(a, byhb.f166423a);
        return bqga.m112775a((byhb) da.mo74062i());
    }
}
