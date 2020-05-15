package p000;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: adpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adpa extends cazu {

    /* renamed from: b */
    private final cazn f62318b;

    /* renamed from: c */
    private final cazn f62319c;

    /* renamed from: d */
    private final cazn f62320d;

    /* renamed from: e */
    private final cazn f62321e;

    /* renamed from: f */
    private final cazn f62322f;

    /* renamed from: g */
    private final cazn f62323g;

    public adpa(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5, cazn cazn6) {
        super(cijl2, cbag.m127657a(adpa.class), cijl);
        this.f62318b = cbac.m127643a(cazn);
        this.f62319c = cbac.m127643a(cazn2);
        this.f62320d = cbac.m127643a(cazn3);
        this.f62321e = cbac.m127643a(cazn4);
        this.f62322f = cbac.m127643a(cazn5);
        this.f62323g = cbac.m127643a(cazn6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62318b.mo75201b(), this.f62319c.mo75201b(), this.f62320d.mo75201b(), this.f62321e.mo75201b(), this.f62322f.mo75201b(), this.f62323g.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        Long l = (Long) list.get(0);
        adrk adrk = (adrk) list.get(1);
        adqx adqx = (adqx) list.get(2);
        Executor executor = (Executor) list.get(3);
        adqo adqo = (adqo) list.get(4);
        adqr adqr = (adqr) list.get(5);
        if (!ceqm.m137874e()) {
            return bqga.m112775a(new adov(true, Long.MIN_VALUE));
        }
        adqt adqt = new adqt(5);
        adqt.mo33729c();
        adqo.mo33709a(adqt);
        return bqdx.m112674a(adqx.mo33734a(), new adou(adqr, adrk, adqt, adqx, executor), executor);
    }
}
