package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: bagz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bagz extends cazu {

    /* renamed from: b */
    private final cazn f100848b;

    /* renamed from: c */
    private final cazn f100849c;

    /* renamed from: d */
    private final cazn f100850d;

    /* renamed from: e */
    private final cazn f100851e;

    /* renamed from: f */
    private final cazn f100852f;

    /* renamed from: g */
    private final cazn f100853g;

    /* renamed from: h */
    private final cazn f100854h;

    /* renamed from: i */
    private final cazn f100855i;

    /* renamed from: j */
    private final cazn f100856j;

    /* renamed from: k */
    private final cazn f100857k;

    public bagz(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5, cazn cazn6, cazn cazn7, cazn cazn8, cazn cazn9, cazn cazn10) {
        super(cijl2, cbag.m127657a(bagz.class), cijl);
        this.f100848b = cbac.m127643a(cazn);
        this.f100849c = cbac.m127643a(cazn2);
        this.f100850d = cbac.m127643a(cazn3);
        this.f100851e = cbac.m127643a(cazn4);
        this.f100852f = cbac.m127643a(cazn5);
        this.f100853g = cbac.m127643a(cazn6);
        this.f100854h = cbac.m127643a(cazn7);
        this.f100855i = cbac.m127643a(cazn8);
        this.f100856j = cbac.m127643a(cazn9);
        this.f100857k = cbac.m127643a(cazn10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100848b.mo75201b(), this.f100849c.mo75201b(), this.f100850d.mo75201b(), this.f100851e.mo75201b(), this.f100852f.mo75201b(), this.f100853g.mo75201b(), this.f100854h.mo75201b(), this.f100855i.mo75201b(), this.f100856j.mo75201b(), this.f100857k.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        Long l;
        List list = (List) obj;
        babr babr = (babr) list.get(0);
        byik byik = (byik) list.get(1);
        bygz bygz = (bygz) list.get(2);
        bygv bygv = (bygv) list.get(3);
        byjj byjj = (byjj) list.get(4);
        Collection collection = (Collection) list.get(5);
        Collection collection2 = (Collection) list.get(6);
        Long l2 = (Long) list.get(7);
        bara bara = (bara) list.get(8);
        bmzi bmzi = (bmzi) list.get(9);
        if (collection.isEmpty()) {
            bara.mo55899b(0);
            bara.mo55897a(0, 0);
            bxvd da = bykc.f166732e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bykc bykc = (bykc) da.f164949b;
            byjj.getClass();
            bykc.f166735b = byjj;
            bykc.f166734a |= 1;
            return bqga.m112775a((bykc) da.mo74062i());
        }
        byjv byjv = (byjv) byjy.f166710h.mo74144da();
        if (byjv.f164950c) {
            byjv.mo74035c();
            byjv.f164950c = false;
        }
        byjy byjy = (byjy) byjv.f164949b;
        bygz.getClass();
        byjy.f166713b = bygz;
        int i = byjy.f166712a | 1;
        byjy.f166712a = i;
        byjj.getClass();
        byjy.f166715d = byjj;
        byjy.f166712a = 2 | i;
        byjv.mo74387a(collection);
        byjv.mo74388b(collection2);
        if (babr.mo32669A() && bygv.f166396g && (l = (Long) bmzi.mo6606a()) != null && l.longValue() != 0) {
            bxvd da2 = byjx.f166706c.mo74144da();
            long longValue = l.longValue();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byjx byjx = (byjx) da2.f164949b;
            byjx.f166708a = 1;
            byjx.f166709b = Long.valueOf(longValue);
            byjx byjx2 = (byjx) da2.mo74062i();
            if (byjv.f164950c) {
                byjv.mo74035c();
                byjv.f164950c = false;
            }
            byjy byjy2 = (byjy) byjv.f164949b;
            byjx2.getClass();
            byjy2.f166718g = byjx2;
            byjy2.f166712a |= 16;
        }
        byjy byjy3 = (byjy) byjv.mo74062i();
        bara.mo55899b((long) byjy3.f166714c.size());
        int i2 = byjy3.f164961ai;
        if (i2 == -1) {
            i2 = bxxm.f165037a.mo74228a(byjy3).mo74223b(byjy3);
            byjy3.f164961ai = i2;
        }
        long j = (long) i2;
        bara.mo55897a(j, j);
        return byik.mo74383a(byjy3);
    }
}
