package p000;

import java.util.Arrays;

/* renamed from: ejf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ejf extends ejk {

    /* renamed from: a */
    public final Iterable f15133a;

    /* renamed from: b */
    public final byte[] f15134b;

    public ejf(Iterable iterable, byte[] bArr) {
        this.f15133a = iterable;
        this.f15134b = bArr;
    }

    /* renamed from: a */
    public final Iterable mo10193a() {
        return this.f15133a;
    }

    /* renamed from: b */
    public final byte[] mo10194b() {
        return this.f15134b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejk) {
            ejk ejk = (ejk) obj;
            if (this.f15133a.equals(ejk.mo10193a())) {
                if (Arrays.equals(this.f15134b, ejk instanceof ejf ? ((ejf) ejk).f15134b : ejk.mo10194b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15133a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15134b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15133a);
        String arrays = Arrays.toString(this.f15134b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(arrays).length());
        sb.append("BackendRequest{events=");
        sb.append(valueOf);
        sb.append(", extras=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
