package p000;

import java.util.Arrays;

/* renamed from: bedm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bedm {

    /* renamed from: a */
    public final byte[] f106977a;

    public bedm(byte[] bArr) {
        int length = bArr.length;
        if (length == 16) {
            this.f106977a = bArr;
            return;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Incorrect key size: ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bedm) {
            return Arrays.equals(((bedm) obj).f106977a, this.f106977a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f106977a))});
    }

    public final String toString() {
        return boan.f132472f.mo68794a(this.f106977a);
    }
}
