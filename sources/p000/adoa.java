package p000;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: adoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adoa extends cazu {

    /* renamed from: b */
    private final cazn f62244b;

    /* renamed from: c */
    private final cazn f62245c;

    /* renamed from: d */
    private final cazn f62246d;

    private adoa(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(adoa.class), cijl);
        this.f62244b = cbac.m127643a(cazn);
        this.f62245c = cbac.m127643a(cazn2);
        this.f62246d = cbac.m127643a(cazn3);
    }

    /* renamed from: a */
    public static adoa m50885a(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        return new adoa(cijl, cijl2, cazn, cazn2, cazn3);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        adqv adqv = (adqv) list.get(0);
        cazn cazn = this.f62245c;
        Executor executor = (Executor) list.get(1);
        if (!ceqm.m137875f()) {
            return bqga.m112775a((Object) true);
        }
        return bqdx.m112674a(adqv.mo33734a(), new adnw(cazn), executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62244b.mo75201b(), this.f62246d.mo75201b());
    }
}
