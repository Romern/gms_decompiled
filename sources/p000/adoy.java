package p000;

import java.util.List;

/* renamed from: adoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adoy extends cazu {

    /* renamed from: b */
    private final cazn f62313b;

    /* renamed from: c */
    private final cazn f62314c;

    /* renamed from: d */
    private final cazn f62315d;

    /* renamed from: e */
    private final cazn f62316e;

    public adoy(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4) {
        super(cijl2, cbag.m127657a(adoy.class), cijl);
        this.f62313b = cbac.m127643a(cazn);
        this.f62314c = cbac.m127643a(cazn2);
        this.f62315d = cbac.m127643a(cazn3);
        this.f62316e = cbac.m127643a(cazn4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62313b.mo75201b(), this.f62314c.mo75201b(), this.f62315d.mo75201b(), this.f62316e.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        boolean z = false;
        adov adov = (adov) list.get(0);
        Boolean bool = (Boolean) list.get(1);
        adqr adqr = (adqr) list.get(2);
        Long l = (Long) list.get(3);
        if (adov.f62307a.booleanValue()) {
            adqr.mo33722c();
            Long l2 = adov.f62308b;
            if (l2 == null || l2.longValue() <= l.longValue()) {
                adqr.mo33719a(l.longValue());
            } else {
                adqr.mo33719a(l2.longValue());
            }
        }
        if (adov.f62307a.booleanValue() && bool.booleanValue()) {
            z = true;
        }
        return bqga.m112775a(Boolean.valueOf(z));
    }
}
