package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: afvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afvn implements cayy {

    /* renamed from: a */
    private final cijl f64848a;

    /* renamed from: b */
    private final cijl f64849b;

    public afvn(cijl cijl, cijl cijl2) {
        this.f64848a = cijl;
        this.f64849b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Context context = (Context) this.f64848a.mo6445a();
        bels bels = (bels) this.f64849b.mo6445a();
        bmzi bmzi = afve.f64836a;
        beix a = beja.m95159a();
        a.f111615a = context.getApplicationContext();
        a.f111617c = "com.google.android.gms.permission.INTERNAL_BROADCAST";
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a.f111619e = bmzi;
        a.f111620f = timeUnit;
        afql afql = new afql(context.getApplicationContext(), snp.m35702a(10));
        afql.f64554c = bels;
        a.f111616b = new afqm(afql.f64552a, afql.f64553b, afql.f64554c);
        a.f111618d = new snr(new sns(9));
        a.f111621g = snp.m35703a(1, 9);
        a.f111622h = bels;
        beja beja = new beja(a);
        cazf.m127593a(beja, "Cannot return null from a non-@Nullable @Provides method");
        return beja;
    }
}
