package p000;

import java.util.List;

/* renamed from: bajr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bajr extends cazu {

    /* renamed from: b */
    private final cazn f101070b;

    /* renamed from: c */
    private final cazn f101071c;

    /* renamed from: d */
    private final cazn f101072d;

    public bajr(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(bajr.class), cijl);
        this.f101070b = cbac.m127643a(cazn);
        this.f101071c = cbac.m127643a(cazn2);
        this.f101072d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f101070b.mo75201b(), this.f101071c.mo75201b(), this.f101072d.mo75201b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [bxwc, bmxj]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        bafh bafh = (bafh) list.get(0);
        bngx bngx = (bngx) list.get(1);
        bykc bykc = (bykc) list.get(2);
        byjj byjj = bykc.f166735b;
        if (byjj == null) {
            byjj = byjj.f166658c;
        }
        bany b = bafh.mo55653a().mo55799b();
        try {
            bnkn.m109668a((List) bykc.f166737d, bajk.f101059a);
            byhd byhd = bykc.f166736c;
            if (byhd == null) {
                byhd = byhd.f166431c;
            }
            if ((1 & byhd.f166433a) != 0) {
                byhd byhd2 = bykc.f166736c;
                if (byhd2 == null) {
                    byhd2 = byhd.f166431c;
                }
                ByteString.m123258a(byhd2.f166434b).getKey();
            }
            bafh.mo55657e();
            bafh.mo55745a(b, byjj);
            b.mo55796b();
            b.close();
            return bqga.m112775a(byjj);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
