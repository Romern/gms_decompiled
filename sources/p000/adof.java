package p000;

import java.util.List;

/* renamed from: adof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adof extends cazu {

    /* renamed from: b */
    private final cazn f62259b;

    /* renamed from: c */
    private final cazn f62260c;

    /* renamed from: d */
    private final cazn f62261d;

    private adof(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(adof.class), cijl);
        this.f62259b = cbac.m127643a(cazn);
        this.f62260c = cbac.m127643a(cazn2);
        this.f62261d = cbac.m127643a(cazn3);
    }

    /* renamed from: a */
    public static adof m50900a(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        return new adof(cijl, cijl2, cazn, cazn2, cazn3);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        adrl adrl = (adrl) list.get(0);
        adqy adqy = (adqy) list.get(1);
        adqo adqo = (adqo) list.get(2);
        if (!ceqm.m137875f()) {
            return bqga.m112775a((Object) true);
        }
        return adnz.m50884a(adrl, adqy, 12, 9, adqo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62259b.mo75201b(), this.f62260c.mo75201b(), this.f62261d.mo75201b());
    }
}
