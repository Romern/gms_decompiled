package p000;

import java.util.Arrays;

/* renamed from: eiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eiv {

    /* renamed from: a */
    public final eid f15102a;

    /* renamed from: b */
    public final byte[] f15103b;

    public eiv(eid eid, byte[] bArr) {
        if (bArr != null) {
            this.f15102a = eid;
            this.f15103b = bArr;
            return;
        }
        throw new NullPointerException("bytes is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eiv) {
            eiv eiv = (eiv) obj;
            if (this.f15102a.equals(eiv.f15102a)) {
                return Arrays.equals(this.f15103b, eiv.f15103b);
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15102a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15103b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15102a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("EncodedPayload{encoding=");
        sb.append(valueOf);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}
