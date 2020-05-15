package p000;

import java.util.Arrays;

/* renamed from: aurx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aurx {

    /* renamed from: a */
    public final byte[] f92391a;

    public aurx(byte[] bArr) {
        this.f92391a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aurx) {
            return Arrays.equals(this.f92391a, ((aurx) obj).f92391a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f92391a});
    }

    public final String toString() {
        return boan.f132472f.mo68794a(this.f92391a);
    }
}
