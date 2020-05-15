package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: bahw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bahw extends cazu {

    /* renamed from: b */
    private final cazn f100912b;

    /* renamed from: c */
    private final cazn f100913c;

    /* renamed from: d */
    private final cazn f100914d;

    /* renamed from: e */
    private final cazn f100915e;

    /* renamed from: f */
    private final cazn f100916f;

    /* renamed from: g */
    private final cazn f100917g;

    /* renamed from: h */
    private final cazn f100918h;

    /* renamed from: i */
    private final cazn f100919i;

    /* renamed from: j */
    private final cazn f100920j;

    /* renamed from: k */
    private final cazn f100921k;

    public bahw(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5, cazn cazn6, cazn cazn7, cazn cazn8, cazn cazn9, cazn cazn10) {
        super(cijl2, cbag.m127657a(bahw.class), cijl);
        this.f100912b = cbac.m127643a(cazn);
        this.f100913c = cbac.m127643a(cazn2);
        this.f100914d = cbac.m127643a(cazn3);
        this.f100915e = cbac.m127643a(cazn4);
        this.f100916f = cbac.m127643a(cazn5);
        this.f100917g = cbac.m127643a(cazn6);
        this.f100918h = cbac.m127643a(cazn7);
        this.f100919i = cbac.m127643a(cazn8);
        this.f100920j = cbac.m127643a(cazn9);
        this.f100921k = cbac.m127643a(cazn10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100912b.mo75201b(), this.f100913c.mo75201b(), this.f100914d.mo75201b(), this.f100915e.mo75201b(), this.f100916f.mo75201b(), this.f100917g.mo75201b(), this.f100918h.mo75201b(), this.f100919i.mo75201b(), this.f100920j.mo75201b(), this.f100921k.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        bygv bygv;
        Long l;
        List list = (List) obj;
        babr babr = (babr) list.get(0);
        byik byik = (byik) list.get(1);
        bygw bygw = (bygw) list.get(2);
        bygz bygz = (bygz) list.get(3);
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
        byjy.f166712a = i | 2;
        byjv.mo74387a(collection);
        byjv.mo74388b(collection2);
        if (babr.mo32669A()) {
            bxwc bxwc = bygw.f166400a;
            int size = bxwc.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    bygv = (bygv) bxwc.get(i2);
                    bygz bygz2 = bygv.f166392c;
                    if (bygz2 == null) {
                        bygz2 = bygz.f166410c;
                    }
                    i2++;
                    if (bygz.equals(bygz2)) {
                        break;
                    }
                } else {
                    bygv = bygv.f166388h;
                    break;
                }
            }
            if (!(!bygv.f166396g || (l = (Long) bmzi.mo6606a()) == null || l.longValue() == 0)) {
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
        }
        byjy byjy3 = (byjy) byjv.mo74062i();
        bara.mo55899b((long) byjy3.f166714c.size());
        int i3 = byjy3.f164961ai;
        if (i3 == -1) {
            i3 = bxxm.f165037a.mo74228a(byjy3).mo74223b(byjy3);
            byjy3.f164961ai = i3;
        }
        long j = (long) i3;
        bara.mo55897a(j, j);
        return byik.mo74383a(byjy3);
    }
}
