package p000;

import android.content.Context;

/* renamed from: afuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afuj implements cayy {

    /* renamed from: a */
    private final cijl f64820a;

    /* renamed from: b */
    private final cijl f64821b;

    public afuj(cijl cijl, cijl cijl2) {
        this.f64820a = cijl;
        this.f64821b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        ayte b = aytf.m84780b();
        bqgj a = snp.m35702a(10);
        brud p = brue.m114687p();
        p.mo69974a((Context) this.f64820a.mo6445a());
        p.f143399a = b;
        p.mo69976a(afui.f64819a);
        p.mo69977a(a);
        p.mo69978b(a);
        p.mo69979c(a);
        p.f143400b = (brux) this.f64821b.mo6445a();
        brue a2 = p.mo69973a();
        cazf.m127593a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
