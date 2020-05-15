package p000;

import java.util.Arrays;

/* renamed from: allq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class allq implements rjh {

    /* renamed from: a */
    public final int f73627a;

    /* renamed from: b */
    private final String f73628b = null;

    public allq(allp allp) {
        this.f73627a = allp.f73626a;
    }

    /* renamed from: a */
    public static allp m61232a() {
        return new allp();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof allq) {
            allq allq = (allq) obj;
            if (this.f73627a == allq.f73627a) {
                String str = allq.f73628b;
                if (sdg.m34949a(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f73627a), null});
    }
}
