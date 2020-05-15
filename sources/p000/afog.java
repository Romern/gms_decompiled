package p000;

import android.content.Context;

/* renamed from: afog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afog implements cayy {

    /* renamed from: a */
    private final cijl f64422a;

    /* renamed from: b */
    private final cijl f64423b;

    public afog(cijl cijl, cijl cijl2) {
        this.f64422a = cijl;
        this.f64423b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bngx bngx;
        bbfn bbfn = (bbfn) this.f64423b.mo6445a();
        bngx a = bngx.m109356a(beff.m94940a((Context) this.f64422a.mo6445a()).mo60653a());
        bngx a2 = bngx.m109356a(new beie());
        if (!ceni.f183073a.mo6606a().mo79442s()) {
            bngx = bngx.m109376e();
        } else {
            bngx = bngx.m109356a(bbfn);
        }
        befa befa = new befa(a, a2, bngx);
        cazf.m127593a(befa, "Cannot return null from a non-@Nullable @Provides method");
        return befa;
    }
}
