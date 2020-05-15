package p000;

import java.util.Arrays;

/* renamed from: ayng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayng extends aypj {

    /* renamed from: a */
    public final byte[] f98005a;

    /* renamed from: b */
    public final String f98006b;

    public ayng(byte[] bArr, String str) {
        if (bArr != null) {
            this.f98005a = bArr;
            if (str != null) {
                this.f98006b = str;
                return;
            }
            throw new NullPointerException("Null address");
        }
        throw new NullPointerException("Null key");
    }

    /* renamed from: a */
    public final byte[] mo54083a() {
        return this.f98005a;
    }

    /* renamed from: b */
    public final String mo54084b() {
        return this.f98006b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aypj)) {
            return false;
        }
        aypj aypj = (aypj) obj;
        return Arrays.equals(this.f98005a, aypj instanceof ayng ? ((ayng) aypj).f98005a : aypj.mo54083a()) && this.f98006b.equals(aypj.mo54084b());
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f98005a) ^ 1000003) * 1000003) ^ this.f98006b.hashCode();
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f98005a);
        String str = this.f98006b;
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 28 + str.length());
        sb.append("SharedSecret{key=");
        sb.append(arrays);
        sb.append(", address=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
