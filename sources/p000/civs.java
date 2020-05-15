package p000;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: civs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class civs implements Comparable {

    /* renamed from: a */
    public final byte[] f191539a;

    public civs(byte[] bArr) {
        this.f191539a = bArr;
    }

    /* renamed from: a */
    public final byte[] mo86595a() {
        return cixd.m151108a(new byte[]{5}, this.f191539a);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return new BigInteger(this.f191539a).compareTo(new BigInteger(((civs) obj).f191539a));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof civs)) {
            return false;
        }
        return Arrays.equals(this.f191539a, ((civs) obj).f191539a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f191539a);
    }
}
