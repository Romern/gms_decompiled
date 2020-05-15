package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: baem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baem extends cazu {

    /* renamed from: b */
    private final cazn f100556b;

    /* renamed from: c */
    private final cazn f100557c;

    public baem(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(baem.class), cijl);
        this.f100556b = cbac.m127643a(cazn);
        this.f100557c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return cbac.m127642a(this.f100556b.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        cazm cazm = (cazm) obj;
        cazn cazn = this.f100557c;
        try {
            return bqga.m112775a((bpyi) cazm.mo75194a());
        } catch (ExecutionException e) {
            if (chuv.m149608a(e).f189233s == chuv.f189223j.f189233s) {
                return cazn.mo75201b();
            }
            throw e;
        }
    }
}
