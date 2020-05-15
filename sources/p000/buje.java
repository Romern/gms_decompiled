package p000;

/* renamed from: buje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buje {

    /* renamed from: a */
    public final long f154008a;

    /* renamed from: b */
    public final long f154009b;

    /* renamed from: c */
    public final float f154010c;

    /* renamed from: d */
    public final float f154011d;

    /* renamed from: e */
    public final float f154012e;

    /* renamed from: f */
    public final float f154013f;

    /* renamed from: g */
    public final int f154014g;

    /* renamed from: h */
    public final float f154015h;

    /* renamed from: i */
    public final float f154016i;

    /* renamed from: j */
    public final double f154017j;

    /* renamed from: k */
    public final double f154018k;

    /* renamed from: l */
    public final buka f154019l;

    public buje(long j, long j2, double d, double d2, float f, double d3, int i, float f2, float f3) {
        this(j, j2, d, d2, f, d3, i, f2, f3, null);
    }

    /* renamed from: a */
    public final boolean mo72719a() {
        return this.f154012e != Float.NEGATIVE_INFINITY;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof buje) {
            buje buje = (buje) obj;
            if (this.f154009b == buje.f154009b && this.f154010c == buje.f154010c && this.f154011d == buje.f154011d && this.f154012e == buje.f154012e && bxbl.m122538a(this.f154019l, buje.f154019l)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f154009b;
        int floatToIntBits = ((((((((int) (j ^ (j >>> 32))) * 31) + Float.floatToIntBits(this.f154010c)) * 31) + Float.floatToIntBits(this.f154011d)) * 31) + Float.floatToIntBits(this.f154012e)) * 31;
        buka buka = this.f154019l;
        return floatToIntBits + (buka != null ? buka.hashCode() : 0);
    }

    public final String toString() {
        long j = this.f154008a;
        long j2 = this.f154009b;
        float f = this.f154010c;
        float f2 = this.f154011d;
        float f3 = this.f154013f;
        float f4 = this.f154012e;
        int i = this.f154014g;
        float f5 = this.f154015h;
        float f6 = this.f154016i;
        String valueOf = String.valueOf(this.f154019l);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 308);
        sb.append("macAddress: ");
        sb.append(j);
        sb.append(", s2CellId: ");
        sb.append(j2);
        sb.append(", powerOutputDbm: ");
        sb.append(f);
        sb.append(", pathLossExponent: ");
        sb.append(f2);
        sb.append(", measurementDbm: ");
        sb.append(f3);
        sb.append(", modelUserElevationM: ");
        sb.append(f4);
        sb.append(", rttSuccessCount: ");
        sb.append(i);
        sb.append(", rttDistanceM: ");
        sb.append(f5);
        sb.append(", rttDistanceStdev: ");
        sb.append(f6);
        sb.append(", floor: ");
        sb.append(valueOf);
        return sb.toString();
    }

    public buje(long j, long j2, double d, double d2, float f, double d3, int i, float f2, float f3, buka buka) {
        this.f154009b = j2;
        this.f154010c = (float) d;
        this.f154011d = (float) d2;
        this.f154008a = j;
        this.f154012e = f;
        this.f154013f = (float) d3;
        this.f154014g = i;
        this.f154015h = i == 0 ? Float.NEGATIVE_INFINITY : f2;
        this.f154016i = i == 0 ? Float.NEGATIVE_INFINITY : f3;
        this.f154019l = buka;
        double[] dArr = new double[2];
        ayvd.m84914b(j2, dArr);
        this.f154017j = dArr[0];
        this.f154018k = dArr[1];
    }
}
