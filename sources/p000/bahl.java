package p000;

import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: bahl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bahl extends cazu {

    /* renamed from: b */
    private final cazn f100890b;

    /* renamed from: c */
    private final cazn f100891c;

    /* renamed from: d */
    private final cazn f100892d;

    public bahl(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(bahl.class), cijl);
        this.f100890b = cbac.m127643a(cazn);
        this.f100891c = cbac.m127643a(cazn2);
        this.f100892d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(cbac.m127642a(this.f100890b.mo75201b()), cbac.m127642a(this.f100891c.mo75201b()), this.f100892d.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        cazm cazm = (cazm) list.get(0);
        cazm cazm2 = (cazm) list.get(1);
        baqq baqq = (baqq) list.get(2);
        try {
            bxvd da = bpyi.f139852o.mo74144da();
            bpyh bpyh = (bpyh) cazm.mo75194a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyi bpyi = (bpyi) da.f164949b;
            bpyh.getClass();
            bpyi.f139862i = bpyh;
            bpyi.f139854a |= 128;
            bpyg bpyg = (bpyg) cazm2.mo75194a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyi bpyi2 = (bpyi) da.f164949b;
            bpyg.getClass();
            bpyi2.f139861h = bpyg;
            bpyi2.f139854a |= 64;
            bpyi bpyi3 = (bpyi) da.mo74062i();
            baqq.close();
            return bqga.m112775a(bpyi3);
        } catch (ExecutionException e) {
            throw baqq.mo55887a(e.getCause(), Exception.class);
        } catch (Throwable th) {
            baqq.close();
            throw th;
        }
    }
}
