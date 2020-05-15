package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: adqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqi extends cazu {

    /* renamed from: b */
    private final cazn f62495b;

    /* renamed from: c */
    private final cazn f62496c;

    /* renamed from: d */
    private final cijl f62497d;

    /* renamed from: e */
    private final cijl f62498e;

    /* renamed from: f */
    private final cazn f62499f;

    /* renamed from: g */
    private final cazn f62500g;

    /* renamed from: h */
    private final cazn f62501h;

    public adqi(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cijl cijl3, cijl cijl4, cazn cazn3, cazn cazn4, cazn cazn5) {
        super(cijl2, cbag.m127657a(adqi.class), cijl);
        this.f62495b = cbac.m127643a(cazn);
        this.f62496c = cbac.m127643a(cazn2);
        this.f62497d = cijl3;
        this.f62498e = cijl4;
        this.f62499f = cbac.m127643a(cazn3);
        this.f62500g = cbac.m127643a(cazn4);
        this.f62501h = cbac.m127643a(cazn5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62495b.mo75201b(), this.f62496c.mo75201b(), this.f62499f.mo75201b(), this.f62500g.mo75201b(), this.f62501h.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        Throwable th;
        List list = (List) obj;
        int i = 0;
        HashMap hashMap = (HashMap) list.get(0);
        Long l = (Long) list.get(1);
        cijl cijl = this.f62497d;
        cijl cijl2 = this.f62498e;
        adqr adqr = (adqr) list.get(2);
        adqo adqo = (adqo) list.get(3);
        Executor executor = (Executor) list.get(4);
        Long a = adqr.mo33717a();
        ArrayList arrayList = new ArrayList();
        adqg adqg = new adqg(adqr, new adqq(l, a));
        if (ceqm.m137874e()) {
            for (Integer num : hashMap.values()) {
                i += num.intValue();
            }
            if (((long) i) >= ceqm.m137882m() || hashMap.containsKey(2)) {
                adqt adqt = new adqt(5);
                adqt.mo33729c();
                adqo.mo33709a(adqt);
                adrk b = ((adpt) cijl).mo6445a();
                adqx b2 = ((adps) cijl2).mo6445a();
                adru a2 = b.mo33742a(l, null);
                try {
                    bqgg a3 = b2.mo33737a(a2, adqt);
                    if (a2 != null) {
                        a2.close();
                    }
                    bqga.m112781a(a3, adqg, executor);
                    arrayList.add(a3);
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            }
        }
        return bqdx.m112673a(bqga.m112774a((Iterable) arrayList), new adqf(), executor);
        throw th;
    }
}
