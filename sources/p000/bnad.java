package p000;

import java.util.Arrays;

/* renamed from: bnad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnad {

    /* renamed from: a */
    private final long f131298a = 0;

    /* renamed from: b */
    private final long f131299b = 0;

    /* renamed from: c */
    private final long f131300c = 0;

    /* renamed from: d */
    private final long f131301d = 0;

    /* renamed from: e */
    private final long f131302e = 0;

    /* renamed from: f */
    private final long f131303f = 0;

    public bnad() {
        bmxy.m108588a(true);
        bmxy.m108588a(true);
        bmxy.m108588a(true);
        bmxy.m108588a(true);
        bmxy.m108588a(true);
        bmxy.m108588a(true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bnad)) {
            return false;
        }
        bnad bnad = (bnad) obj;
        long j = bnad.f131298a;
        long j2 = bnad.f131299b;
        long j3 = bnad.f131300c;
        long j4 = bnad.f131301d;
        long j5 = bnad.f131302e;
        long j6 = bnad.f131303f;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, 0L, 0L, 0L, 0L, 0L});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxt.a(java.lang.String, long):void
     arg types: [java.lang.String, int]
     candidates:
      bmxt.a(java.lang.String, double):void
      bmxt.a(java.lang.String, int):void
      bmxt.a(java.lang.String, java.lang.Object):void
      bmxt.a(java.lang.String, boolean):void
      bmxt.a(java.lang.String, long):void */
    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66884a("hitCount", 0L);
        a.mo66884a("missCount", 0L);
        a.mo66884a("loadSuccessCount", 0L);
        a.mo66884a("loadExceptionCount", 0L);
        a.mo66884a("totalLoadTime", 0L);
        a.mo66884a("evictionCount", 0L);
        return a.toString();
    }
}
