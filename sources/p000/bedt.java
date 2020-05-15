package p000;

import java.util.Arrays;

/* renamed from: bedt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bedt {

    /* renamed from: a */
    public final long f106987a;

    /* renamed from: b */
    public final beds f106988b;

    public bedt(long j, beds beds) {
        this.f106987a = j;
        bmxy.m108581a(beds);
        this.f106988b = beds;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bedt) {
            bedt bedt = (bedt) obj;
            return bedt.f106987a == this.f106987a && bedt.f106988b.equals(this.f106988b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f106987a), this.f106988b});
    }

    public final String toString() {
        return String.format("EID: %s captured at %d", this.f106988b, Long.valueOf(this.f106987a));
    }
}
