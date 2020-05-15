package p000;

import java.util.Arrays;

/* renamed from: nev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nev {

    /* renamed from: a */
    public String f35425a;

    /* renamed from: b */
    public long f35426b;

    /* renamed from: c */
    public long f35427c;

    /* renamed from: d */
    public long f35428d;

    /* renamed from: e */
    public long f35429e;

    /* renamed from: f */
    public long f35430f;

    /* renamed from: g */
    public long f35431g;

    /* renamed from: h */
    public boolean f35432h;

    public nev() {
        this.f35425a = null;
        this.f35426b = 0;
        this.f35427c = 0;
        this.f35428d = 0;
        this.f35429e = 0;
        this.f35430f = 0;
        this.f35431g = 0;
        this.f35432h = false;
    }

    /* renamed from: a */
    public final void mo20543a(long j) {
        this.f35430f++;
        this.f35427c = j;
        long j2 = j - this.f35426b;
        this.f35428d = j2;
        if (!this.f35432h) {
            if (j2 > 10000) {
                this.f35431g++;
            }
            if (j2 > this.f35429e) {
                this.f35429e = j2;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nev) {
            nev nev = (nev) obj;
            return sdg.m34949a(this.f35425a, nev.f35425a) && this.f35426b == nev.f35426b && this.f35427c == nev.f35427c && this.f35430f == nev.f35430f && this.f35431g == nev.f35431g && this.f35429e == nev.f35429e && this.f35428d == nev.f35428d && this.f35432h == nev.f35432h;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35425a, Long.valueOf(this.f35426b), Long.valueOf(this.f35427c), Long.valueOf(this.f35430f), Long.valueOf(this.f35431g), Long.valueOf(this.f35429e), Boolean.valueOf(this.f35432h), Long.valueOf(this.f35428d)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("\n\tBleSettings", this.f35425a);
        a.mo25396a("\n\tlastScanStartTime", Long.valueOf(this.f35426b));
        a.mo25396a("\n\tlastScanDuration", Long.valueOf(this.f35428d));
        a.mo25396a("\n\tlastScanEndTime", Long.valueOf(this.f35427c));
        a.mo25396a("\n\tlongestNonOpportunisticScan", Long.valueOf(this.f35429e));
        a.mo25396a("\n\ttotalScans", Long.valueOf(this.f35430f));
        a.mo25396a("\n\ttotalLongScans", Long.valueOf(this.f35431g));
        return a.toString();
    }

    public nev(String str, long j, long j2, long j3, long j4, long j5) {
        this.f35425a = str;
        this.f35426b = j;
        this.f35427c = j2;
        this.f35430f = j3;
        this.f35431g = j4;
        this.f35429e = j5;
        this.f35432h = false;
        this.f35428d = 0;
    }
}
