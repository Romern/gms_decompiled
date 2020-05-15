package p000;

import java.util.List;

/* renamed from: adoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adoe extends cazu {

    /* renamed from: b */
    private final cazn f62256b;

    /* renamed from: c */
    private final cazn f62257c;

    /* renamed from: d */
    private final cazn f62258d;

    private adoe(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(adoe.class), cijl);
        this.f62256b = cbac.m127643a(cazn);
        this.f62257c = cbac.m127643a(cazn2);
        this.f62258d = cbac.m127643a(cazn3);
    }

    /* renamed from: a */
    public static adoe m50897a(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        return new adoe(cijl, cijl2, cazn, cazn2, cazn3);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        adrl adrl = (adrl) list.get(0);
        adqw adqw = (adqw) list.get(1);
        adqo adqo = (adqo) list.get(2);
        if (!ceqm.m137875f()) {
            return bqga.m112775a((Object) true);
        }
        return adnz.m50884a(adrl, adqw, 11, 8, adqo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62256b.mo75201b(), this.f62257c.mo75201b(), this.f62258d.mo75201b());
    }
}
