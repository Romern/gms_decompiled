package p000;

import java.util.Arrays;

/* renamed from: bevn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bevn {

    /* renamed from: a */
    public final long f112697a;

    /* renamed from: b */
    public final long f112698b;

    public bevn(long j, long j2) {
        this.f112697a = j;
        this.f112698b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bevn) {
            bevn bevn = (bevn) obj;
            return this.f112697a == bevn.f112697a && this.f112698b == bevn.f112698b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f112697a), Long.valueOf(this.f112698b), 0});
    }

    public final String toString() {
        long j = this.f112697a;
        long j2 = this.f112698b;
        StringBuilder sb = new StringBuilder(84);
        sb.append("startMillis=");
        sb.append(j);
        sb.append(", endMillis=");
        sb.append(j2);
        sb.append(", status=0");
        return sb.toString();
    }
}
