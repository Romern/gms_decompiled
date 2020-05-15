package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: ciek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciek {

    /* renamed from: f */
    static final ciek f189959f = new ciek(Collections.emptySet());

    /* renamed from: a */
    final int f189960a = 1;

    /* renamed from: b */
    final long f189961b = 0;

    /* renamed from: c */
    final long f189962c = 0;

    /* renamed from: d */
    final double f189963d = 1.0d;

    /* renamed from: e */
    final Set f189964e;

    public ciek(Set set) {
        this.f189964e = bnic.m109495a((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ciek) {
            ciek ciek = (ciek) obj;
            int i = ciek.f189960a;
            long j = ciek.f189961b;
            long j2 = ciek.f189962c;
            double d = ciek.f189963d;
            if (Double.compare(1.0d, 1.0d) != 0 || !bmxi.m108538a(this.f189964e, ciek.f189964e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{1, 0L, 0L, Double.valueOf(1.0d), this.f189964e});
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxt.a(java.lang.String, double):void
     arg types: [java.lang.String, int]
     candidates:
      bmxt.a(java.lang.String, int):void
      bmxt.a(java.lang.String, long):void
      bmxt.a(java.lang.String, java.lang.Object):void
      bmxt.a(java.lang.String, boolean):void
      bmxt.a(java.lang.String, double):void */
    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66883a("maxAttempts", 1);
        a.mo66884a("initialBackoffNanos", 0L);
        a.mo66884a("maxBackoffNanos", 0L);
        a.mo66882a("backoffMultiplier", 1.0d);
        a.mo66885a("retryableStatusCodes", this.f189964e);
        return a.toString();
    }
}
