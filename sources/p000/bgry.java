package p000;

import android.content.Context;

/* renamed from: bgry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgry extends bgtd {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public bgry(Context context, bgsq bgsq) {
        super(context, bgsq);
    }

    /* renamed from: d */
    static boolean m99829d() {
        return cezu.m138488i();
    }

    /* renamed from: f */
    public final boolean mo63124f() {
        if (ssk.m36235a(this.f117478a)) {
            return super.mo63124f();
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo63123e() {
        if (!cezu.m138488i() || C1145kt.m18540a(this.f117478a, "android.permission.ACCESS_FINE_LOCATION") == -1) {
            return true;
        }
        if (cezu.m138502w()) {
            Context context = this.f117478a;
            if (soz.m35801d(context, context.getPackageName()).isEmpty()) {
                return true;
            }
        }
        if (!cezu.f183534a.mo6606a().seismicDisableForSupervised() || !bgtd.m99888d(this.f117478a)) {
            return super.mo63123e();
        }
        return true;
    }
}
