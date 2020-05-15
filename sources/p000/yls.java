package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yls implements bmxz {

    /* renamed from: a */
    private final ypv f54049a;

    public yls(ypv ypv) {
        this.f54049a = ypv;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6527a(Object obj) {
        yhu yhu = (yhu) obj;
        long a = yhf.m44092a(yhu);
        float j = (float) yhu.mo30517j();
        return this.f54049a.mo30654a(8, j, a, TimeUnit.NANOSECONDS) || this.f54049a.mo30654a(7, j, a, TimeUnit.NANOSECONDS);
    }
}
