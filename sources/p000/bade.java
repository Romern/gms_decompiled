package p000;

import java.util.Arrays;

/* renamed from: bade */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bade extends badp {

    /* renamed from: a */
    private final byte[] f100520a;

    /* renamed from: b */
    private final int f100521b;

    public bade(byte[] bArr, int i) {
        if (bArr != null) {
            this.f100520a = bArr;
            this.f100521b = i;
            return;
        }
        throw new NullPointerException("Null secondaryId");
    }

    /* renamed from: a */
    public final byte[] mo55630a() {
        return this.f100520a;
    }

    /* renamed from: b */
    public final int mo55631b() {
        return this.f100521b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof badp)) {
            return false;
        }
        badp badp = (badp) obj;
        return Arrays.equals(this.f100520a, badp instanceof bade ? ((bade) badp).f100520a : badp.mo55630a()) && this.f100521b == badp.mo55631b();
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f100520a) ^ 1000003) * 1000003) ^ this.f100521b;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f100520a);
        int i = this.f100521b;
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 62);
        sb.append("CoreSecondaryIdMatcher{secondaryId=");
        sb.append(arrays);
        sb.append(", matchingType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
