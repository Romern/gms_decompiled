package p000;

import java.util.List;

/* renamed from: adod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adod extends cazu {

    /* renamed from: b */
    private final cazn f62253b;

    /* renamed from: c */
    private final cazn f62254c;

    /* renamed from: d */
    private final cazn f62255d;

    private adod(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(adod.class), cijl);
        this.f62253b = cbac.m127643a(cazn);
        this.f62254c = cbac.m127643a(cazn2);
        this.f62255d = cbac.m127643a(cazn3);
    }

    /* renamed from: a */
    public static adod m50894a(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        return new adod(cijl, cijl2, cazn, cazn2, cazn3);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        adrl adrl = (adrl) list.get(0);
        adqv adqv = (adqv) list.get(1);
        adqo adqo = (adqo) list.get(2);
        if (!ceqm.m137875f()) {
            return bqga.m112775a((Object) true);
        }
        return adnz.m50884a(adrl, adqv, 10, 7, adqo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62253b.mo75201b(), this.f62254c.mo75201b(), this.f62255d.mo75201b());
    }
}
