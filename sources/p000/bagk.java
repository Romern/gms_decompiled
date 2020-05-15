package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: bagk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bagk extends cazu {

    /* renamed from: b */
    private final cijl f100810b;

    /* renamed from: c */
    private final cazn f100811c;

    /* renamed from: d */
    private final cazn f100812d;

    public bagk(cijl cijl, cijl cijl2, cijl cijl3, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(bagk.class), cijl);
        this.f100810b = cijl3;
        this.f100811c = cbac.m127643a(cazn);
        this.f100812d = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return cbac.m127642a(this.f100811c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        cazm cazm = (cazm) obj;
        cayo b = cayx.m127580b(this.f100810b);
        cazn cazn = this.f100812d;
        try {
            return bqga.m112775a((Void) cazm.mo75194a());
        } catch (ExecutionException e) {
            if (e.getCause() instanceof baow) {
                ((acdc) b.mo16713a()).mo32707a("Storing changes with delta failed!", e);
                return cazn.mo75201b();
            }
            throw e;
        }
    }
}
