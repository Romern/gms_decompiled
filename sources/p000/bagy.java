package p000;

import java.util.List;

/* renamed from: bagy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bagy extends cazu {

    /* renamed from: b */
    private final cazn f100846b;

    /* renamed from: c */
    private final cazn f100847c;

    public bagy(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(bagy.class), cijl);
        this.f100846b = cbac.m127643a(cazn);
        this.f100847c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100846b.mo75201b(), this.f100847c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        babr babr = (babr) list.get(0);
        bafl bafl = (bafl) list.get(1);
        banx a = bafl.mo55677c().mo55798a();
        try {
            bamm a2 = bafl.mo55674b().mo55761a(a, babr.mo32670B());
            a.close();
            return bqga.m112775a(a2);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
