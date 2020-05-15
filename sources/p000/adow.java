package p000;

import android.content.Context;
import java.util.List;

/* renamed from: adow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adow extends cazu {

    /* renamed from: b */
    private final cazn f62309b;

    /* renamed from: c */
    private final cazn f62310c;

    /* renamed from: d */
    private final cazn f62311d;

    public adow(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(adow.class), cijl);
        this.f62309b = cbac.m127643a(cazn);
        this.f62310c = cbac.m127643a(cazn2);
        this.f62311d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62310c.mo75201b(), this.f62311d.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        cazn cazn = this.f62309b;
        adqo adqo = (adqo) list.get(1);
        if (adqn.m51003a((Context) list.get(0))) {
            adqo.mo33712c();
            return cazn.mo75201b();
        }
        if (ceqm.m137878i()) {
            adnt.m50874c("Mediastore access denied");
        }
        return bqga.m112775a((Object) true);
    }
}
