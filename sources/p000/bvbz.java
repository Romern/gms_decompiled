package p000;

import java.util.Arrays;

/* renamed from: bvbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvbz {

    /* renamed from: a */
    public final long f155573a;

    /* renamed from: b */
    public final long f155574b;

    public bvbz(long j, long j2) {
        boolean z = true;
        sdo.m34974b(j >= 0);
        sdo.m34974b(j2 >= 0);
        sdo.m34974b(j2 > j ? false : z);
        this.f155573a = j;
        this.f155574b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bvbz) {
            bvbz bvbz = (bvbz) obj;
            return bvbz.f155573a == this.f155573a && bvbz.f155574b == this.f155574b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f155573a), Long.valueOf(this.f155574b)});
    }
}
