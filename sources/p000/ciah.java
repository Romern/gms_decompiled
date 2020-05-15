package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: ciah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciah {

    /* renamed from: b */
    static final ciah f189659b = new ciah(Collections.emptySet());

    /* renamed from: a */
    final Set f189660a;

    public ciah(Set set) {
        this.f189660a = bnic.m109495a((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && bmxi.m108538a(this.f189660a, ((ciah) obj).f189660a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{1, 0L, this.f189660a});
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
        a.mo66883a("maxAttempts", 1);
        a.mo66884a("hedgingDelayNanos", 0L);
        a.mo66885a("nonFatalStatusCodes", this.f189660a);
        return a.toString();
    }
}
