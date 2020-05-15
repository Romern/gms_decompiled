package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: bajn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bajn extends cazu {

    /* renamed from: b */
    private final cazn f101063b;

    /* renamed from: c */
    private final cazn f101064c;

    public bajn(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(bajn.class), cijl);
        this.f101063b = cbac.m127643a(cazn);
        this.f101064c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f101063b.mo75201b(), this.f101064c.mo75201b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [java.util.List, baim]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        baqv baqv = (baqv) list.get(0);
        baio baio = new baio(baqv.m87417a() / 1000);
        baio.f101008a.f101007b = 0;
        return bqga.m112775a((Object) bngx.m109368a((Collection) bnkn.m109668a(bnkn.m109666a((List) ((bngx) list.get(1))), (bmxj) new baim(baio))).mo67670d());
    }
}
