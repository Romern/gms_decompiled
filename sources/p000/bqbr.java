package p000;

import java.math.RoundingMode;

/* renamed from: bqbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqbr {
    /* renamed from: a */
    public static int m112521a(int i, int i2) {
        return bqcn.m112585b(((long) i) + ((long) i2));
    }

    /* renamed from: a */
    public static boolean m112524a(int i) {
        boolean z = true;
        boolean z2 = i > 0;
        if ((i & (i - 1)) != 0) {
            z = false;
        }
        return z2 & z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (((r0 & true) & r2) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r1 <= 0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r5 > 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r5 < 0) goto L_0x0048;
     */
    /* renamed from: a */
    public static int m112522a(int i, int i2, RoundingMode roundingMode) {
        bmxy.m108581a(roundingMode);
        if (i2 != 0) {
            int i3 = i / i2;
            int i4 = i - (i2 * i3);
            if (i4 == 0) {
                return i3;
            }
            boolean z = true;
            int i5 = ((i ^ i2) >> 31) | 1;
            switch (bqbq.f140430a[roundingMode.ordinal()]) {
                case 1:
                    if (i4 != 0) {
                        z = false;
                    }
                    bqbt.m112529a(z);
                    return i3;
                case 2:
                    return i3;
                case 3:
                    break;
                case 4:
                    return i3 + i5;
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i4);
                    int abs2 = abs - (Math.abs(i2) - abs);
                    if (abs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            if (roundingMode != RoundingMode.HALF_EVEN) {
                                z = false;
                            }
                            break;
                        }
                        return i3 + i5;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } else {
            throw new ArithmeticException("/ by zero");
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m112523a(int i, RoundingMode roundingMode) {
        if (i > 0) {
            switch (bqbq.f140430a[roundingMode.ordinal()]) {
                case 1:
                    bqbt.m112529a(m112524a(i));
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                    return (31 - numberOfLeadingZeros) + (((-1257966797 >>> numberOfLeadingZeros) - i) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i);
        }
        StringBuilder sb = new StringBuilder(27);
        sb.append("x (");
        sb.append(i);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }
}
