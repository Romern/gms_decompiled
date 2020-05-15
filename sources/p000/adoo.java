package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: adoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adoo extends cazu {

    /* renamed from: b */
    private final cazn f62286b;

    /* renamed from: c */
    private final cazn f62287c;

    /* renamed from: d */
    private final cijl f62288d;

    /* renamed from: e */
    private final cijl f62289e;

    /* renamed from: f */
    private final cazn f62290f;

    /* renamed from: g */
    private final cazn f62291g;

    /* renamed from: h */
    private final cazn f62292h;

    /* renamed from: i */
    private final cazn f62293i;

    public adoo(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cijl cijl3, cijl cijl4, cazn cazn3, cazn cazn4, cazn cazn5, cazn cazn6) {
        super(cijl2, cbag.m127657a(adoo.class), cijl);
        this.f62286b = cbac.m127643a(cazn);
        this.f62287c = cbac.m127643a(cazn2);
        this.f62288d = cijl3;
        this.f62289e = cijl4;
        this.f62290f = cbac.m127643a(cazn3);
        this.f62291g = cbac.m127643a(cazn4);
        this.f62292h = cbac.m127643a(cazn5);
        this.f62293i = cbac.m127643a(cazn6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62286b.mo75201b(), this.f62287c.mo75201b(), this.f62290f.mo75201b(), this.f62291g.mo75201b(), this.f62292h.mo75201b(), this.f62293i.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        Throwable th;
        Throwable th2;
        List list = (List) obj;
        adrm adrm = (adrm) list.get(1);
        cijl cijl = this.f62288d;
        cijl cijl2 = this.f62289e;
        int i = 2;
        Executor executor = (Executor) list.get(2);
        adqr adqr = (adqr) list.get(3);
        adqo adqo = (adqo) list.get(4);
        int i2 = 5;
        adqq adqq = (adqq) list.get(5);
        adqo.mo33712c();
        ArrayList arrayList = new ArrayList();
        for (adqq adqq2 : (Set) list.get(0)) {
            Long l = adqq2.f62514a;
            Long l2 = adqq2.f62515b;
            HashSet<Integer> hashSet = new HashSet();
            adrw b = adrm.mo33747b(l, l2);
            if (b != null) {
                while (b.mo33750a()) {
                    try {
                        adsf adsf = (adsf) b.mo33751b();
                        if (adsf != null && adsf.mo33757c().booleanValue()) {
                            hashSet.add(adsf.f62617h);
                        }
                    } catch (Throwable th3) {
                        bqye.m113761a(th2, th3);
                    }
                }
            }
            if (b != null) {
                b.close();
            }
            for (Integer num : hashSet) {
                if (num.intValue() == i) {
                    if (!ceqm.m137874e()) {
                        i = 2;
                        i2 = 5;
                    } else if (adqq2.f62514a.longValue() == 0) {
                        adqt adqt = new adqt(i2);
                        adqt.mo33729c();
                        adqo.mo33709a(adqt);
                        adrk b2 = ((adpt) cijl).mo6445a();
                        adqx b3 = ((adps) cijl2).mo6445a();
                        adru a = b2.mo33742a(adqq2.f62514a, adqq2.f62515b);
                        try {
                            bqgg a2 = bqdx.m112673a(b3.mo33737a(a, adqt), new adom(adqq2), executor);
                            if (a != null) {
                                a.close();
                            }
                            arrayList.add(a2);
                            i = 2;
                            i2 = 5;
                        } catch (Throwable th4) {
                            bqye.m113761a(th, th4);
                        }
                    } else {
                        i = 2;
                        i2 = 5;
                    }
                }
            }
            i = 2;
            i2 = 5;
        }
        return bqdx.m112673a(bqga.m112774a((Iterable) arrayList), new adol(adqq, adqr), executor);
        throw th2;
        throw th;
    }
}
