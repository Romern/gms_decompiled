package p000;

/* renamed from: bqbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqbs {
    /* renamed from: a */
    public static long m112525a(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j ^ j2) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        bqbt.m112531a(z2 | z, "checkedAdd", j, j2);
        return j3;
    }

    /* renamed from: b */
    public static long m112526b(long j, long j2) {
        long j3 = j - j2;
        boolean z = true;
        boolean z2 = (j ^ j2) >= 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        bqbt.m112531a(z2 | z, "checkedSubtract", j, j2);
        return j3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bqbt.a(boolean, java.lang.String, long, long):void
     arg types: [int, java.lang.String, long, long]
     candidates:
      bqbt.a(boolean, java.lang.String, int, int):void
      bqbt.a(boolean, java.lang.String, long, long):void */
    /* renamed from: c */
    public static long m112527c(long j, long j2) {
        boolean z;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(j ^ -1) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(-1 ^ j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            z = true;
        } else {
            z = false;
        }
        bqbt.m112531a(z, "checkedMultiply", j, j2);
        bqbt.m112531a(true, "checkedMultiply", j, j2);
        long j3 = j * j2;
        bqbt.m112531a(j == 0 || j3 / j == j2, "checkedMultiply", j, j2);
        return j3;
    }

    /* renamed from: d */
    public static long m112528d(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j2 ^ j) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        return !(z2 | z) ? ((j3 >>> 63) ^ 1) + Long.MAX_VALUE : j3;
    }
}
