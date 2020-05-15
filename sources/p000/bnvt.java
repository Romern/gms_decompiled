package p000;

import java.io.Serializable;

/* renamed from: bnvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvt implements Comparable, Serializable {

    /* renamed from: a */
    public static final bnvt[] f132247a = new bnvt[6];

    /* renamed from: c */
    private static final int[] f132248c = new int[1024];

    /* renamed from: d */
    private static final int[] f132249d = new int[1024];

    /* renamed from: b */
    public final long f132250b;

    static {
        new bnvt();
        new bnvt(-1);
        m110563a(0, 0, 0, 0, 0, 0);
        m110563a(0, 0, 0, 1, 0, 1);
        m110563a(0, 0, 0, 2, 0, 2);
        m110563a(0, 0, 0, 3, 0, 3);
        for (int i = 0; i < 6; i++) {
            f132247a[i] = m110560a(i);
        }
        bmwx.m108501b('0');
    }

    public bnvt() {
        this.f132250b = 0;
    }

    /* renamed from: a */
    private static final int m110557a(int i, int i2, int i3, int i4) {
        int i5 = i3 * 4;
        return f132248c[i4 + (((i >> i5) & 15) << 6) + (((i2 >> i5) & 15) << 2)];
    }

    /* renamed from: a */
    static int m110558a(long j) {
        return (int) (j >>> 33);
    }

    /* renamed from: a */
    private static final long m110559a(long j, int i, int i2) {
        int i3 = i & 3;
        return j | ((((long) i2) >> 2) << ((i3 + i3) * 4));
    }

    /* renamed from: a */
    public static boolean m110565a(long j, long j2) {
        return j + Long.MIN_VALUE <= j2 + Long.MIN_VALUE;
    }

    /* renamed from: b */
    public static int m110566b(int i) {
        return 1 << (30 - i);
    }

    /* renamed from: b */
    static int m110567b(long j) {
        return (int) ((j >>> 2) & 2147483647L);
    }

    /* renamed from: b */
    public static boolean m110569b(long j, long j2) {
        return j + Long.MIN_VALUE >= j2 + Long.MIN_VALUE;
    }

    /* renamed from: c */
    static int m110570c(long j) {
        return (int) (j & 3);
    }

    /* renamed from: c */
    public static long m110571c(int i) {
        int i2 = 30 - i;
        return 1 << (i2 + i2);
    }

    /* renamed from: d */
    public static long m110572d(int i) {
        return (((long) i) << 61) + m110571c(0);
    }

    /* renamed from: e */
    private static final int m110574e(int i) {
        return i & 3;
    }

    /* renamed from: a */
    public final int mo68579a() {
        return (int) (this.f132250b >>> 61);
    }

    /* renamed from: c */
    public final boolean mo68583c() {
        return (((int) this.f132250b) & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bnvt) || this.f132250b != ((bnvt) obj).f132250b) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final bnvt mo68590f() {
        return new bnvt(m110575e(this.f132250b));
    }

    /* renamed from: g */
    public final bnvt mo68591g() {
        long j = this.f132250b;
        long lowestOneBit = Long.lowestOneBit(j) << 2;
        return new bnvt((j & (-lowestOneBit)) | lowestOneBit);
    }

    /* renamed from: h */
    public final bnvt mo68592h() {
        long j = this.f132250b;
        long j2 = mo68595j();
        return new bnvt(j + j2 + j2);
    }

    public final int hashCode() {
        long j = this.f132250b;
        return (int) ((j >>> 32) + j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final long mo68594i() {
        int i;
        int a = mo68579a() & 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 7; i4 >= 0; i4--) {
            if (i4 == 7) {
                i = 2;
            } else {
                i = 4;
            }
            int i5 = f132249d[a + ((((int) (this.f132250b >>> (((i4 + i4) * 4) + 1))) & ((1 << (i + i)) - 1)) << 2)];
            int i6 = i4 * 4;
            i2 += (i5 >> 6) << i6;
            i3 += ((i5 >> 2) & 15) << i6;
            a = m110574e(i5);
        }
        if ((mo68595j() & 1229782938247303440L) != 0) {
            a ^= 1;
        }
        return (((long) i2) << 33) | (((long) i3) << 2) | ((long) a);
    }

    /* renamed from: j */
    public final long mo68595j() {
        return Long.lowestOneBit(this.f132250b);
    }

    public final String toString() {
        int a = mo68579a();
        String hexString = Long.toHexString(this.f132250b & 2305843009213693951L);
        int b = mo68581b();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 43);
        sb.append("(face=");
        sb.append(a);
        sb.append(", pos=");
        sb.append(hexString);
        sb.append(", level=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }

    public bnvt(long j) {
        this.f132250b = j;
    }

    /* renamed from: b */
    static bnvk m110568b(int i, int i2, int i3) {
        bnvk bnvk = new bnvk();
        int b = m110566b(i3);
        m110564a(i, b, bnvk.f132222a);
        m110564a(i2, b, bnvk.f132223b);
        return bnvk;
    }

    /* renamed from: d */
    private static long m110573d(long j) {
        return j - (Long.lowestOneBit(j) - 1);
    }

    /* renamed from: e */
    private static long m110575e(long j) {
        return j + (Long.lowestOneBit(j) - 1);
    }

    /* renamed from: a */
    public static bnvt m110560a(int i) {
        return new bnvt(m110572d(i));
    }

    /* renamed from: c */
    public final boolean mo68584c(bnvt bnvt) {
        return m110569b(this.f132250b, bnvt.f132250b);
    }

    /* renamed from: d */
    public final int compareTo(bnvt bnvt) {
        long j = this.f132250b - Long.MIN_VALUE;
        long j2 = bnvt.f132250b - Long.MIN_VALUE;
        if (j >= j2) {
            return j <= j2 ? 0 : 1;
        }
        return -1;
    }

    /* renamed from: e */
    public final bnvt mo68588e() {
        return new bnvt(m110573d(this.f132250b));
    }

    /* renamed from: a */
    public static bnvt m110561a(int i, int i2, int i3) {
        long j = ((long) i) << 28;
        int i4 = i & 1;
        for (int i5 = 7; i5 >= 4; i5--) {
            int a = m110557a(i2, i3, i5, i4);
            j = m110559a(j, i5, a);
            i4 = m110574e(a);
        }
        long j2 = 0;
        for (int i6 = 3; i6 >= 0; i6--) {
            int a2 = m110557a(i2, i3, i6, i4);
            j2 = m110559a(j2, i6, a2);
            i4 = m110574e(a2);
        }
        long j3 = (j << 32) + j2;
        return new bnvt(j3 + j3 + 1);
    }

    /* renamed from: b */
    public final int mo68581b() {
        if (!mo68583c()) {
            return 30 - (Long.numberOfTrailingZeros(this.f132250b) >> 1);
        }
        return 30;
    }

    /* renamed from: d */
    public final boolean mo68587d() {
        return (this.f132250b & (m110571c(0) + -1)) == 0;
    }

    /* renamed from: b */
    public final boolean mo68582b(bnvt bnvt) {
        return m110565a(this.f132250b, bnvt.f132250b);
    }

    /* renamed from: a */
    public static bnvt m110562a(bnwk bnwk) {
        int a = bnxi.m110724a(bnwk);
        bnxg a2 = bnxi.m110727a(a);
        return m110561a(a, bnxi.m110729b(bnxi.f132328e.mo68689c(a2.mo68684a(bnwk.f132306h, bnwk.f132307i, bnwk.f132308j))), bnxi.m110729b(bnxi.f132328e.mo68689c(a2.mo68685b(bnwk.f132306h, bnwk.f132307i, bnwk.f132308j))));
    }

    /* renamed from: a */
    private static void m110563a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i == 4) {
            int i7 = ((i2 << 4) + i3) << 2;
            int i8 = i5 << 2;
            f132248c[i7 + i4] = i8 + i6;
            f132249d[i8 + i4] = i7 + i6;
            return;
        }
        int i9 = i + 1;
        int i10 = i2 + i2;
        int i11 = i3 + i3;
        int i12 = i5 << 2;
        for (int i13 = 0; i13 < 4; i13++) {
            int a = bnvr.m110549a(i6, i13);
            m110563a(i9, (a >>> 1) + i10, i11 + (a & 1), i4, i12 + i13, i6 ^ bnvr.m110548a(i13));
        }
    }

    /* renamed from: a */
    private static void m110564a(int i, int i2, bnvj bnvj) {
        bnvj.mo68523c(bnxi.f132328e.mo68687a(i, i2), bnxi.f132328e.mo68687a(i + i2, i2));
    }

    /* renamed from: a */
    public final boolean mo68580a(bnvt bnvt) {
        return m110569b(bnvt.f132250b, m110573d(this.f132250b)) && m110565a(bnvt.f132250b, m110575e(this.f132250b));
    }
}
