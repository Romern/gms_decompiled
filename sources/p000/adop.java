package p000;

import java.util.List;
import java.util.Set;

/* renamed from: adop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adop extends cazu {

    /* renamed from: b */
    private final cazn f62294b;

    /* renamed from: c */
    private final cazn f62295c;

    public adop(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(adop.class), cijl);
        this.f62294b = cbac.m127643a(cazn);
        this.f62295c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62294b.mo75201b(), this.f62295c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        adqr adqr = (adqr) list.get(0);
        adqq adqq = (adqq) list.get(1);
        if (adqq.mo33713a()) {
            adqr.mo33720a(adqq);
        }
        Set a = adql.m50999a(adqr.mo33718a("batch_indexing_windows"));
        new Object[1][0] = Integer.valueOf(a.size());
        return bqga.m112775a((Object) a);
    }
}
