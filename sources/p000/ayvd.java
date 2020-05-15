package p000;

import com.google.android.cast.JGCastService;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: ayvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayvd {

    /* renamed from: a */
    private static final int[] f98529a = new int[1024];

    /* renamed from: b */
    private static final int[] f98530b = new int[1024];

    /* renamed from: c */
    private static final int[] f98531c = {1, 0, 0, 3};

    /* renamed from: d */
    private static final int[][] f98532d = {new int[]{0, 1, 3, 2}, new int[]{0, 2, 3, 1}, new int[]{3, 2, 0, 1}, new int[]{3, 1, 0, 2}};

    /* renamed from: e */
    private static final double f98533e;

    /* renamed from: f */
    private static final ayvb[] f98534f = {new ayus(), new ayut(), new ayuu(), new ayuv(), new ayuw(), new ayux()};

    /* renamed from: g */
    private static final ayvc[] f98535g = {new ayuy(), new ayuz(), new ayva(), new ayup(), new ayuq(), new ayur()};

    static {
        double d = 1.0d;
        do {
            d /= 2.0d;
        } while ((d / 2.0d) + 1.0d != 1.0d);
        f98533e = d + 1.0d;
        m84901a(0, 0, 0, 0, 0, 0);
        m84901a(0, 0, 0, 1, 0, 1);
        m84901a(0, 0, 0, 2, 0, 2);
        m84901a(0, 0, 0, 3, 0, 3);
    }

    /* renamed from: a */
    private static final double m84891a(double d, double d2, double d3) {
        return Math.atan2(d3, Math.sqrt((d * d) + (d2 * d2)));
    }

    /* renamed from: a */
    private static final int m84893a(int i) {
        return i & 3;
    }

    /* renamed from: a */
    public static final long m84899a(long j, int i) {
        int i2 = 30 - i;
        long j2 = 1 << (i2 + i2);
        return (j & (-j2)) | j2;
    }

    /* renamed from: a */
    private static final long m84900a(long j, int i, int i2) {
        int i3 = i & 3;
        return j | ((((long) i2) >> 2) << ((i3 + i3) * 4));
    }

    /* renamed from: b */
    private static final double m84907b(int i) {
        int max = Math.max(-1, Math.min((int) JGCastService.FLAG_PRIVATE_DISPLAY, i));
        double d = f98533e;
        double d2 = (double) ((max + max) - 1073741823);
        Double.isNaN(d2);
        return Math.max(-d, Math.min(d, d2 * 9.313225746154785E-10d));
    }

    /* renamed from: c */
    private static final int m84915c(int i) {
        return 1 << (30 - i);
    }

    /* renamed from: c */
    public static final long m84916c(long j) {
        return j & (-j);
    }

    /* renamed from: d */
    private static final ayvb m84917d(int i) {
        return f98534f[Math.min(5, i)];
    }

    /* renamed from: e */
    private static final int m84919e(long j) {
        return (int) (j >>> 61);
    }

    /* renamed from: f */
    private static final boolean m84921f(long j) {
        return (((int) j) & 1) != 0;
    }

    /* renamed from: g */
    private static final long m84922g(long j) {
        long k = m84926k(j);
        int l = m84927l(k);
        int m = m84928m(k);
        int i = 2;
        if (m84921f(j)) {
            i = 1;
        } else if ((((((int) j) >>> 2) ^ l) & 1) == 0) {
            i = 0;
        }
        return (((long) ((l + l) + i)) << 32) | (((long) (m + m + i)) & 4294967295L);
    }

    /* renamed from: h */
    private static final double m84923h(long j) {
        return m84925j((long) ((int) (j >> 32)));
    }

    /* renamed from: i */
    private static final double m84924i(long j) {
        return m84925j((long) ((int) j));
    }

    /* renamed from: j */
    private static final double m84925j(long j) {
        double d = (double) j;
        Double.isNaN(d);
        double d2 = d * 4.6566128730773926E-10d;
        if (d2 >= 0.5d) {
            return (((4.0d * d2) * d2) - 4.0d) * 0.3333333333333333d;
        }
        double d3 = 1.0d - d2;
        return (1.0d - ((4.0d * d3) * d3)) * 0.3333333333333333d;
    }

    /* renamed from: k */
    private static final long m84926k(long j) {
        int i;
        int e = m84919e(j) & 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 7; i4 >= 0; i4--) {
            if (i4 == 7) {
                i = 2;
            } else {
                i = 4;
            }
            int i5 = f98530b[e + ((((int) (j >>> (((i4 + i4) * 4) + 1))) & ((1 << (i + i)) - 1)) << 2)];
            int i6 = i4 * 4;
            i2 += (i5 >> 6) << i6;
            i3 += ((i5 >> 2) & 15) << i6;
            e = i5 & 3;
        }
        if ((m84916c(j) & 1229782938247303440L) != 0) {
            e ^= 1;
        }
        return (((long) i2) << 33) | (((long) i3) << 2) | ((long) e);
    }

    /* renamed from: l */
    private static final int m84927l(long j) {
        return (int) (j >>> 33);
    }

    /* renamed from: m */
    private static final int m84928m(long j) {
        return (int) ((j >>> 2) & 2147483647L);
    }

    /* renamed from: a */
    private static final int m84892a(double d) {
        double d2;
        if (d < 0.0d) {
            d2 = 1.0d - (Math.sqrt(1.0d - (d * 3.0d)) * 0.5d);
        } else {
            d2 = Math.sqrt((d * 3.0d) + 1.0d) * 0.5d;
        }
        return Math.max(0, Math.min(1073741823, (int) Math.round((d2 * 1.073741824E9d) - 8.0d)));
    }

    /* renamed from: d */
    public static String m84918d(long j) {
        if (j == 0) {
            return "X";
        }
        String lowerCase = Long.toHexString(j).toLowerCase(Locale.US);
        if (lowerCase.length() < 16) {
            StringBuilder sb = new StringBuilder(16);
            for (int length = lowerCase.length(); length < 16; length++) {
                sb.append('0');
            }
            sb.append(lowerCase);
            lowerCase = sb.toString();
        }
        return lowerCase.replaceAll("0*$", "");
    }

    /* renamed from: e */
    private static final ayvc m84920e(int i) {
        return f98535g[Math.min(5, i)];
    }

    /* renamed from: b */
    private static int m84908b(double d) {
        return Math.max(0, Math.min(1073741823, (int) Math.round((((d + 1.0d) * 0.5d) * 1.073741824E9d) - 8.0d)));
    }

    /* renamed from: b */
    private static int m84909b(double d, double d2, double d3) {
        double abs = Math.abs(d);
        double abs2 = Math.abs(d2);
        double abs3 = Math.abs(d3);
        return abs <= abs2 ? abs2 <= abs3 ? d3 < 0.0d ? 5 : 2 : d2 < 0.0d ? 4 : 1 : abs <= abs3 ? d3 < 0.0d ? 5 : 2 : d < 0.0d ? 3 : 0;
    }

    /* renamed from: a */
    private static final int m84894a(int i, int i2, int i3, int i4) {
        int i5 = i3 * 4;
        return f98529a[i4 + (((i >> i5) & 15) << 6) + (((i2 >> i5) & 15) << 2)];
    }

    /* renamed from: b */
    public static final int m84910b(long j) {
        if (!m84921f(j)) {
            return 30 - (Long.numberOfTrailingZeros(j) >> 1);
        }
        return 30;
    }

    /* renamed from: a */
    public static final long m84895a(double d, double d2) {
        return m84911b(Math.toRadians(d), Math.toRadians(d2));
    }

    /* renamed from: a */
    public static final long m84896a(int i, int i2) {
        return m84911b(ayuo.m84842a(i), ayuo.m84842a(i2));
    }

    /* renamed from: b */
    public static final long m84911b(double d, double d2) {
        double cos = Math.cos(d);
        double cos2 = Math.cos(d2) * cos;
        double sin = cos * Math.sin(d2);
        double sin2 = Math.sin(d);
        int b = m84909b(cos2, sin, sin2);
        ayvb d3 = m84917d(b);
        return m84897a(b, m84892a(d3.mo54442a(cos2, sin, sin2)), m84892a(d3.mo54443b(cos2, sin, sin2)));
    }

    /* renamed from: a */
    private static final long m84897a(int i, int i2, int i3) {
        int i4 = i & 1;
        long j = ((long) i) << 28;
        for (int i5 = 7; i5 >= 4; i5--) {
            int a = m84894a(i2, i3, i5, i4);
            j = m84900a(j, i5, a);
            i4 = m84893a(a);
        }
        long j2 = 0;
        for (int i6 = 3; i6 >= 0; i6--) {
            int a2 = m84894a(i2, i3, i6, i4);
            j2 = m84900a(j2, i6, a2);
            i4 = m84893a(a2);
        }
        long j3 = (j << 32) + j2;
        return j3 + j3 + 1;
    }

    /* renamed from: a */
    private static final long m84898a(int i, int i2, int i3, boolean z) {
        if (z) {
            return m84897a(i, i2, i3);
        }
        double b = m84907b(i2);
        double b2 = m84907b(i3);
        ayvc e = m84920e(i);
        double a = e.mo54439a(b, b2);
        double b3 = e.mo54440b(b, b2);
        double c = e.mo54441c(b, b2);
        int b4 = m84909b(a, b3, c);
        ayvb d = m84917d(b4);
        return m84897a(b4, m84908b(d.mo54442a(a, b3, c)), m84908b(d.mo54443b(a, b3, c)));
    }

    /* renamed from: b */
    public static final long m84912b(long j, int i) {
        return j + (((long) ((i + i) - 3)) * (m84916c(j) >>> 2));
    }

    /* renamed from: b */
    private static final void m84913b(int i, int i2) {
        if (i2 < i) {
            StringBuilder sb = new StringBuilder(75);
            sb.append("Given array of length ");
            sb.append(i2);
            sb.append(" needs to be of minimum length ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static final void m84914b(long j, double[] dArr) {
        m84913b(2, dArr.length);
        long g = m84922g(j);
        double h = m84923h(g);
        double i = m84924i(g);
        ayvc e = m84920e(m84919e(j));
        double a = e.mo54439a(h, i);
        double b = e.mo54440b(h, i);
        dArr[0] = m84891a(a, b, e.mo54441c(h, i));
        dArr[1] = Math.atan2(b, a);
    }

    /* renamed from: a */
    private static final void m84901a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i == 4) {
            int i7 = ((i2 << 4) + i3) << 2;
            int i8 = i5 << 2;
            f98529a[i7 + i4] = i8 + i6;
            f98530b[i8 + i4] = i7 + i6;
            return;
        }
        int i9 = i + 1;
        int i10 = i2 + i2;
        int i11 = i3 + i3;
        int i12 = i5 << 2;
        for (int i13 = 0; i13 < 4; i13++) {
            int i14 = f98532d[i6][i13];
            m84901a(i9, (i14 >>> 1) + i10, i11 + (i14 & 1), i4, i12 + i13, i6 ^ f98531c[i13]);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(long[], int, int, long):void}
     arg types: [long[], int, int, int]
     candidates:
      ClspMth{java.util.Arrays.fill(java.lang.Object[], int, int, java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int, int, int):void}
      ClspMth{java.util.Arrays.fill(char[], int, int, char):void}
      ClspMth{java.util.Arrays.fill(boolean[], int, int, boolean):void}
      ClspMth{java.util.Arrays.fill(byte[], int, int, byte):void}
      ClspMth{java.util.Arrays.fill(double[], int, int, double):void}
      ClspMth{java.util.Arrays.fill(float[], int, int, float):void}
      ClspMth{java.util.Arrays.fill(short[], int, int, short):void}
      ClspMth{java.util.Arrays.fill(long[], int, int, long):void} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0082, code lost:
        if (r2 < 1073741824) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008b, code lost:
        if (r2 >= 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
        r4 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4 A[LOOP:0: B:8:0x0050->B:33:0x00c4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d3 A[EDGE_INSN: B:53:0x00d3->B:34:0x00d3 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    public static final void m84902a(long j, int i, long[] jArr) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        long[] jArr2 = jArr;
        m84913b((4 << (i10 - m84910b(j))) + 4, jArr2.length);
        int b = m84910b(j);
        int c = m84915c(b);
        int c2 = m84915c(i);
        int e = m84919e(j);
        long k = m84926k(j);
        int i11 = -c;
        int l = m84927l(k) & i11;
        int m = m84928m(k) & i11;
        int i12 = l + c;
        int i13 = l - c;
        int i14 = l - c2;
        int i15 = m + c;
        int i16 = m - c;
        int i17 = m - c2;
        if (i15 < 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (i16 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i18 = -c2;
        int i19 = 0;
        while (true) {
            i2 = b;
            int i20 = m + i18;
            if (i18 < 0) {
                i5 = c;
                i4 = c2;
                i3 = m;
            } else if (i18 < c) {
                i3 = m;
                int i21 = l + i18;
                int i22 = i19 + 1;
                i5 = c;
                i4 = c2;
                jArr2[i19] = m84899a(m84898a(e, i21, i17, z2), i10);
                i19 = i22 + 1;
                jArr2[i22] = m84899a(m84898a(e, i21, i15, z), i10);
                z3 = true;
                int i23 = i19 + 1;
                if (z3) {
                    z4 = false;
                } else {
                    z4 = i13 >= 0;
                }
                int i24 = i15;
                z5 = z2;
                jArr2[i19] = m84899a(m84898a(e, i14, i20, z4), i10);
                i19 = i23 + 1;
                if (z3) {
                    z6 = false;
                } else {
                    z6 = i12 < 1073741824;
                }
                jArr2[i23] = m84899a(m84898a(e, i12, i20, z6), i10);
                i6 = i5;
                if (i18 < i6) {
                    break;
                }
                i18 += i4;
                m = i3;
                c = i6;
                b = i2;
                i15 = i24;
                c2 = i4;
                z2 = z5;
            } else {
                i5 = c;
                i4 = c2;
                i3 = m;
            }
            z3 = true;
            int i232 = i19 + 1;
            if (z3) {
            }
            int i242 = i15;
            z5 = z2;
            jArr2[i19] = m84899a(m84898a(e, i14, i20, z4), i10);
            i19 = i232 + 1;
            if (z3) {
            }
            jArr2[i232] = m84899a(m84898a(e, i12, i20, z6), i10);
            i6 = i5;
            if (i18 < i6) {
            }
        }
        if ((i12 >= 1073741824 || i13 < 0) && (!z || !z5)) {
            Arrays.sort(jArr);
            if (i2 == 0) {
                i8 = 4;
            } else {
                i8 = 1;
            }
            int i25 = i19 - 1;
            int i26 = 0;
            while (i26 < i8) {
                while (true) {
                    i9 = i25 - 1;
                    if (jArr2[i9] == jArr2[i25]) {
                        break;
                    }
                    i25 = i9;
                }
                i19--;
                jArr2[i25] = jArr2[i19];
                i26++;
                i25 = i9;
            }
            i7 = i19;
        } else {
            i7 = i19;
        }
        Arrays.fill(jArr2, i7, jArr2.length, 0L);
    }

    /* renamed from: a */
    public static final void m84903a(long j, double[] dArr) {
        m84914b(j, dArr);
        dArr[0] = Math.toDegrees(dArr[0]);
        dArr[1] = Math.toDegrees(dArr[1]);
    }

    /* renamed from: a */
    public static final void m84904a(long j, int[] iArr) {
        m84913b(2, iArr.length);
        long g = m84922g(j);
        double h = m84923h(g);
        double i = m84924i(g);
        ayvc e = m84920e(m84919e(j));
        double a = e.mo54439a(h, i);
        double b = e.mo54440b(h, i);
        long a2 = ayun.m84836a(m84891a(a, b, e.mo54441c(h, i)), Math.atan2(b, a));
        iArr[0] = ayun.m84835a(a2);
        iArr[1] = (int) a2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(long[], int, int, long):void}
     arg types: [long[], int, int, int]
     candidates:
      ClspMth{java.util.Arrays.fill(java.lang.Object[], int, int, java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int, int, int):void}
      ClspMth{java.util.Arrays.fill(char[], int, int, char):void}
      ClspMth{java.util.Arrays.fill(boolean[], int, int, boolean):void}
      ClspMth{java.util.Arrays.fill(byte[], int, int, byte):void}
      ClspMth{java.util.Arrays.fill(double[], int, int, double):void}
      ClspMth{java.util.Arrays.fill(float[], int, int, float):void}
      ClspMth{java.util.Arrays.fill(short[], int, int, short):void}
      ClspMth{java.util.Arrays.fill(long[], int, int, long):void} */
    /* renamed from: a */
    public static final void m84905a(long j, long[] jArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long[] jArr2 = jArr;
        int length = jArr2.length;
        m84913b(4, length);
        int b = m84910b(j);
        int c = m84915c(b);
        int e = m84919e(j);
        long k = m84926k(j);
        int l = m84927l(k);
        int m = m84928m(k);
        int i = l + c;
        int i2 = l - c;
        int i3 = m + c;
        int i4 = m - c;
        if (i < 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i3 < 1073741824) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i4 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        jArr2[0] = m84899a(m84898a(e, l, i4, z4), b);
        jArr2[1] = m84899a(m84898a(e, i, m, z), b);
        jArr2[2] = m84899a(m84898a(e, l, i3, z3), b);
        jArr2[3] = m84899a(m84898a(e, i2, m, z2), b);
        Arrays.fill(jArr2, 4, length, 0L);
    }

    /* renamed from: a */
    public static final boolean m84906a(long j) {
        return m84919e(j) < 6 && (m84916c(j) & 1537228672809129301L) != 0;
    }
}
