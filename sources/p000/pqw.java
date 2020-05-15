package p000;

import java.math.BigInteger;

/* renamed from: pqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pqw {

    /* renamed from: a */
    public final BigInteger f40079a;

    /* renamed from: b */
    public final BigInteger f40080b;

    public pqw(blsr blsr) {
        boolean z;
        this.f40079a = m31039a(blsr.f127617b);
        BigInteger a = m31039a(blsr.f127618c);
        this.f40080b = a;
        if (a.compareTo(this.f40079a) >= 0) {
            z = true;
        } else {
            z = false;
        }
        pra.m31051a(z, "Bad serial number range: firstSerialNumber is larger than lastSerialNumber.");
    }

    /* renamed from: a */
    private static BigInteger m31039a(long j) {
        BigInteger valueOf = BigInteger.valueOf(Long.MAX_VALUE & j);
        return j < 0 ? valueOf.setBit(63) : valueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pqw) {
            pqw pqw = (pqw) obj;
            return this.f40079a.equals(pqw.f40079a) && this.f40080b.equals(pqw.f40080b);
        }
    }

    public final int hashCode() {
        return (this.f40079a.hashCode() * 31) + this.f40080b.hashCode();
    }
}
