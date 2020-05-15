package p000;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: adob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adob extends cazu {

    /* renamed from: b */
    private final cazn f62247b;

    /* renamed from: c */
    private final cazn f62248c;

    /* renamed from: d */
    private final cazn f62249d;

    private adob(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(adob.class), cijl);
        this.f62247b = cbac.m127643a(cazn);
        this.f62248c = cbac.m127643a(cazn2);
        this.f62249d = cbac.m127643a(cazn3);
    }

    /* renamed from: a */
    public static adob m50888a(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        return new adob(cijl, cijl2, cazn, cazn2, cazn3);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        adqw adqw = (adqw) list.get(0);
        cazn cazn = this.f62248c;
        Executor executor = (Executor) list.get(1);
        if (!ceqm.m137875f()) {
            return bqga.m112775a((Object) true);
        }
        return bqdx.m112674a(adqw.mo33734a(), new adny(cazn), executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62247b.mo75201b(), this.f62249d.mo75201b());
    }
}
