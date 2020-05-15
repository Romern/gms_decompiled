package p000;

import java.util.Arrays;

/* renamed from: nbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbw implements Comparable {

    /* renamed from: a */
    public final byte[] f35217a;

    public nbw(byte[] bArr) {
        bmxy.m108589a(bArr.length == 32, "Hash must bit 256 bits");
        this.f35217a = bArr;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return bqcv.f140491b.compare(this.f35217a, ((nbw) obj).f35217a);
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f35217a, ((nbw) obj).f35217a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f35217a);
    }

    public final String toString() {
        return boan.f132470d.mo68794a(this.f35217a);
    }
}
