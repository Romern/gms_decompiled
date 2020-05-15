package p000;

import java.util.List;
import java.util.Map;

/* renamed from: accm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class accm extends cazu {

    /* renamed from: b */
    private final cazn f59568b;

    /* renamed from: c */
    private final cazn f59569c;

    /* renamed from: d */
    private final cazn f59570d;

    /* renamed from: e */
    private final cazn f59571e;

    /* renamed from: f */
    private final cazn f59572f;

    /* renamed from: g */
    private final cijl f59573g;

    public accm(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5, cijl cijl3) {
        super(cijl2, cbag.m127657a(accm.class), cijl);
        this.f59568b = cbac.m127643a(cazn);
        this.f59569c = cbac.m127643a(cazn2);
        this.f59570d = cbac.m127643a(cazn3);
        this.f59571e = cbac.m127643a(cazn4);
        this.f59572f = cbac.m127643a(cazn5);
        this.f59573g = cijl3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f59568b.mo75201b(), this.f59569c.mo75201b(), this.f59570d.mo75201b(), this.f59571e.mo75201b(), this.f59572f.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        bygz bygz = (bygz) list.get(0);
        String str = (String) list.get(1);
        accl accl = (accl) list.get(2);
        int i = 3;
        acco acco = (acco) list.get(3);
        cayo b = cayx.m127580b(this.f59573g);
        bxvd da = bpxx.f139799f.mo74144da();
        String a = ((babq) ((Map) list.get(4)).get(bygy.m124802a(bygz.f166412a))).mo55563a(bygz);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxx bpxx = (bpxx) da.f164949b;
        a.getClass();
        int i2 = bpxx.f139801a | 16;
        bpxx.f139801a = i2;
        bpxx.f139805e = a;
        str.getClass();
        bpxx.f139801a = i2 | 2;
        bpxx.f139802b = str;
        accl accl2 = accl.READ;
        bygp bygp = bygp.UNKNOWN;
        int ordinal = accl.ordinal();
        if (ordinal == 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxx bpxx2 = (bpxx) da.f164949b;
            bpxx2.f139803c = bqai.m112466a(3);
            bpxx2.f139801a |= 4;
        } else if (ordinal == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxx bpxx3 = (bpxx) da.f164949b;
            bpxx3.f139803c = bqai.m112466a(4);
            bpxx3.f139801a |= 4;
        }
        if (acco != acco.PASS) {
            i = 4;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxx bpxx4 = (bpxx) da.f164949b;
        bpxx4.f139804d = i - 2;
        bpxx4.f139801a |= 8;
        ((bads) b.mo16713a()).mo32746a((bpxx) da.mo74062i());
        return bqga.m112775a(acco);
    }
}
