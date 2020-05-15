package p000;

import java.util.List;

/* renamed from: bahr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bahr extends cazu {

    /* renamed from: b */
    private final cazn f100901b;

    /* renamed from: c */
    private final cazn f100902c;

    /* renamed from: d */
    private final cazn f100903d;

    public bahr(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(bahr.class), cijl);
        this.f100901b = cbac.m127643a(cazn);
        this.f100902c = cbac.m127643a(cazn2);
        this.f100903d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100901b.mo75201b(), this.f100902c.mo75201b(), this.f100903d.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        bykc bykc = (bykc) list.get(0);
        bamm bamm = (bamm) list.get(1);
        bafv bafv = (bafv) list.get(2);
        bany b = bafv.mo55696c().mo55799b();
        try {
            bamm.mo55760a(b);
            byjj byjj = bykc.f166735b;
            if (byjj == null) {
                byjj = byjj.f166658c;
            }
            bafv.mo55691a(b, byjj);
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
