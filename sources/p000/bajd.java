package p000;

import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: bajd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bajd extends cazu {

    /* renamed from: b */
    private final cazn f101046b;

    /* renamed from: c */
    private final cazn f101047c;

    /* renamed from: d */
    private final cazn f101048d;

    public bajd(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(bajd.class), cijl);
        this.f101046b = cbac.m127643a(cazn);
        this.f101047c = cbac.m127643a(cazn2);
        this.f101048d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(cbac.m127642a(this.f101046b.mo75201b()), cbac.m127642a(this.f101047c.mo75201b()), this.f101048d.mo75201b());
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
