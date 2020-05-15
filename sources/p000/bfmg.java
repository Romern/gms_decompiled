package p000;

import java.util.Locale;

/* renamed from: bfmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfmg {

    /* renamed from: a */
    public final long f114394a;

    /* renamed from: b */
    public final long f114395b;

    public bfmg(long j, long j2) {
        this.f114394a = j;
        this.f114395b = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bfmg)) {
            return false;
        }
        bfmg bfmg = (bfmg) obj;
        if (this == bfmg) {
            return true;
        }
        return this.f114394a == bfmg.f114394a && this.f114395b == bfmg.f114395b;
    }

    public final int hashCode() {
        long j = this.f114395b;
        long j2 = this.f114394a;
        return ((((int) (j ^ (j >>> 32))) + 31) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return String.format(Locale.US, "AlarmWindow[begin=%d, length=%d, end=%d]", Long.valueOf(this.f114394a), Long.valueOf(this.f114395b), Long.valueOf(this.f114394a + this.f114395b));
    }
}
