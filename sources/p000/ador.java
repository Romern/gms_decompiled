package p000;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ador */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ador extends cazu {

    /* renamed from: b */
    private final cazn f62297b;

    /* renamed from: c */
    private final cazn f62298c;

    public ador(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(ador.class), cijl);
        this.f62297b = cbac.m127643a(cazn);
        this.f62298c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62297b.mo75201b(), this.f62298c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        adqq adqq;
        List list = (List) obj;
        Long l = (Long) list.get(1);
        Long a = ((adqr) list.get(0)).mo33717a();
        if (ceqm.m137877h()) {
            adqq = new adqq(a, l);
        } else {
            adqq = new adqq(a, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())));
        }
        return bqga.m112775a(adqq);
    }
}
