package p000;

import java.util.Arrays;

/* renamed from: bary */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bary extends C1660base {

    /* renamed from: a */
    private final byte[] f101648a;

    /* renamed from: b */
    private final int f101649b;

    public bary(byte[] bArr, int i) {
        if (bArr != null) {
            this.f101648a = bArr;
            this.f101649b = i;
            return;
        }
        throw new NullPointerException("Null secondaryId");
    }

    /* renamed from: a */
    public final byte[] mo55918a() {
        return this.f101648a;
    }

    /* renamed from: b */
    public final int mo55919b() {
        return this.f101649b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1660base)) {
            return false;
        }
        C1660base base = (C1660base) obj;
        return Arrays.equals(this.f101648a, base instanceof bary ? ((bary) base).f101648a : base.mo55918a()) && this.f101649b == base.mo55919b();
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f101648a) ^ 1000003) * 1000003) ^ this.f101649b;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f101648a);
        int i = this.f101649b;
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 58);
        sb.append("SecondaryIdMatcher{secondaryId=");
        sb.append(arrays);
        sb.append(", matchingType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
