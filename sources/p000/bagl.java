package p000;

import java.util.List;

/* renamed from: bagl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bagl extends cazu {

    /* renamed from: b */
    private final cijl f100813b;

    /* renamed from: c */
    private final cazn f100814c;

    /* renamed from: d */
    private final cazn f100815d;

    /* renamed from: e */
    private final cazn f100816e;

    /* renamed from: f */
    private final cazn f100817f;

    /* renamed from: g */
    private final cazn f100818g;

    /* renamed from: h */
    private final cazn f100819h;

    /* renamed from: i */
    private final cazn f100820i;

    /* renamed from: j */
    private final cazn f100821j;

    public bagl(cijl cijl, cijl cijl2, cijl cijl3, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5, cazn cazn6, cazn cazn7, cazn cazn8) {
        super(cijl2, cbag.m127657a(bagl.class), cijl);
        this.f100813b = cijl3;
        this.f100814c = cbac.m127643a(cazn);
        this.f100815d = cbac.m127643a(cazn2);
        this.f100816e = cbac.m127643a(cazn3);
        this.f100817f = cbac.m127643a(cazn4);
        this.f100818g = cbac.m127643a(cazn5);
        this.f100819h = cbac.m127643a(cazn6);
        this.f100820i = cbac.m127643a(cazn7);
        this.f100821j = cbac.m127643a(cazn8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100814c.mo75201b(), this.f100815d.mo75201b(), this.f100816e.mo75201b(), this.f100817f.mo75201b(), this.f100818g.mo75201b(), this.f100819h.mo75201b(), this.f100820i.mo75201b(), this.f100821j.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        cayo b = cayx.m127580b(this.f100813b);
        bygz bygz = (bygz) list.get(0);
        byid byid = (byid) list.get(1);
        bafl bafl = (bafl) list.get(2);
        Long l = (Long) list.get(3);
        Long l2 = (Long) list.get(4);
        Integer num = (Integer) list.get(5);
        acdd acdd = (acdd) list.get(6);
        try {
            bagc.m86831a(b, bygz, byid, bafl, l, l2, num, (bara) list.get(7));
            return bqga.m112775a((Object) null);
        } catch (baow e) {
            ((achw) b.mo16713a()).mo25409a("Delta exception thrown when delta wasn't requested!", new Object[0]);
            throw new AssertionError(e);
        }
    }
}
