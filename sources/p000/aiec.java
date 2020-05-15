package p000;

import java.util.Arrays;

/* renamed from: aiec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiec {

    /* renamed from: a */
    public final String f68821a;

    /* renamed from: b */
    private final long f68822b;

    public aiec(String str, long j) {
        this.f68821a = str;
        this.f68822b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aiec) {
            aiec aiec = (aiec) obj;
            return sdg.m34949a(this.f68821a, aiec.f68821a) && sdg.m34949a(Long.valueOf(this.f68822b), Long.valueOf(aiec.f68822b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68821a, Long.valueOf(this.f68822b)});
    }
}
