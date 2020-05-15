package p000;

import java.util.concurrent.Executor;

/* renamed from: bach */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bach implements cayy {

    /* renamed from: a */
    private final cijl f100472a;

    /* renamed from: b */
    private final cijl f100473b;

    public bach(cijl cijl, cijl cijl2) {
        this.f100472a = cijl;
        this.f100473b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bmzi bmzi;
        cayo b = cayx.m127580b(this.f100472a);
        Executor executor = (Executor) this.f100473b.mo6445a();
        bmzi b2 = back.m86565b();
        bmzi b3 = bacl.m86567b();
        if (!ceny.f183130a.mo6606a().mo79479e()) {
            String str = (String) b2.mo6606a();
            Integer num = (Integer) b3.mo6606a();
            ((achw) b.mo16713a()).logVerbose("[ProdGrpcChannelModule] Binding to %s:%d with OkHttp", str, num);
            bmzi = bmzn.m108681a((bmzi) new bacg(str, num, executor));
        } else {
            bmzi = new babx(b, b2, b3, new bacf(b, executor));
        }
        cazf.m127593a(bmzi, "Cannot return null from a non-@Nullable @Provides method");
        return bmzi;
    }
}
