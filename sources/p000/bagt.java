package p000;

import java.util.List;

/* renamed from: bagt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bagt extends cazu {

    /* renamed from: b */
    private final cazn f100833b;

    /* renamed from: c */
    private final cazn f100834c;

    /* renamed from: d */
    private final cazn f100835d;

    public bagt(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(bagt.class), cijl);
        this.f100833b = cbac.m127643a(cazn);
        this.f100834c = cbac.m127643a(cazn2);
        this.f100835d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100833b.mo75201b(), this.f100834c.mo75201b(), this.f100835d.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        bykc bykc = (bykc) list.get(0);
        bamm bamm = (bamm) list.get(1);
        bafl bafl = (bafl) list.get(2);
        bany b = bafl.mo55677c().mo55799b();
        try {
            bamm.mo55760a(b);
            byjj byjj = bykc.f166735b;
            if (byjj == null) {
                byjj = byjj.f166658c;
            }
            bafl.mo55671a(b, byjj);
            b.mo55796b();
            b.close();
            byjj byjj2 = bykc.f166735b;
            if (byjj2 == null) {
                byjj2 = byjj.f166658c;
            }
            return bqga.m112775a(byjj2);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
