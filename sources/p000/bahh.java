package p000;

import java.util.List;

/* renamed from: bahh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bahh extends cazu {

    /* renamed from: b */
    private final cazn f100871b;

    /* renamed from: c */
    private final cazn f100872c;

    public bahh(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(bahh.class), cijl);
        this.f100871b = cbac.m127643a(cazn);
        this.f100872c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100871b.mo75201b(), this.f100872c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        badr badr = (badr) list.get(0);
        Long l = (Long) list.get(1);
        bxvd da = byjp.f166682e.mo74144da();
        int a = badr.mo55635a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byjp byjp = (byjp) da.f164949b;
        byjp.f166684a = 1 | byjp.f166684a;
        byjp.f166685b = a;
        if (badr.mo55637c() != null) {
            long longValue = l.longValue() + badr.mo55637c().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byjp byjp2 = (byjp) da.f164949b;
            byjp2.f166684a |= 2;
            byjp2.f166686c = longValue;
        }
        if (badr.mo55636b() != null) {
            long longValue2 = l.longValue() + badr.mo55636b().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byjp byjp3 = (byjp) da.f164949b;
            byjp3.f166684a |= 4;
            byjp3.f166687d = longValue2;
        }
        return bqga.m112775a((byjp) da.mo74062i());
    }
}
