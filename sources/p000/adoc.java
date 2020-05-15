package p000;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: adoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adoc extends cazu {

    /* renamed from: b */
    private final cazn f62250b;

    /* renamed from: c */
    private final cazn f62251c;

    /* renamed from: d */
    private final cazn f62252d;

    private adoc(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(adoc.class), cijl);
        this.f62250b = cbac.m127643a(cazn);
        this.f62251c = cbac.m127643a(cazn2);
        this.f62252d = cbac.m127643a(cazn3);
    }

    /* renamed from: a */
    public static adoc m50891a(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        return new adoc(cijl, cijl2, cazn, cazn2, cazn3);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        adqy adqy = (adqy) list.get(0);
        cazn cazn = this.f62251c;
        Executor executor = (Executor) list.get(1);
        if (!ceqm.m137875f()) {
            return bqga.m112775a((Object) true);
        }
        return bqdx.m112674a(adqy.mo33734a(), new adnx(cazn), executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62250b.mo75201b(), this.f62252d.mo75201b());
    }
}
