package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aqdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqdj {

    /* renamed from: a */
    public static final /* synthetic */ int f85760a = 0;

    /* renamed from: b */
    private final byte[] f85761b;

    /* renamed from: c */
    private int f85762c = 0;

    /* renamed from: d */
    private long f85763d;

    /* renamed from: e */
    private int f85764e = 0;

    /* renamed from: f */
    private final int f85765f;

    static {
        aqdj.class.getSimpleName();
    }

    public aqdj(int i, byte[] bArr) {
        this.f85765f = i;
        this.f85761b = bArr;
        if (bArr.length != 0) {
            this.f85763d = m71383a(bArr, 0);
        }
    }

    /* renamed from: a */
    private final long m71382a(int i) {
        long j = this.f85763d;
        this.f85763d = j >>> i;
        this.f85764e += i;
        return j & (4294967295 >>> (32 - i));
    }

    /* renamed from: b */
    static List m71387b(long j, int i, int i2, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (!m71386a(j, i, i2, bArr, arrayList, new aqdg())) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    private static long m71383a(byte[] bArr, int i) {
        int length = bArr.length;
        if (i >= length) {
            return 0;
        }
        long j = ((long) bArr[i]) & 255;
        int i2 = i + 1;
        if (i2 >= length) {
            return j;
        }
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i3 = i + 2;
        if (i3 >= length) {
            return j2;
        }
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i4 = i + 3;
        if (i4 >= length) {
            return j3;
        }
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    /* renamed from: a */
    static List m71384a(long j, int i, int i2, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (!m71386a(j, i, i2, bArr, arrayList, new aqdf())) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m71385a() {
        this.f85764e = 0;
        int i = this.f85762c + 4;
        this.f85762c = i;
        byte[] bArr = this.f85761b;
        if (i < bArr.length) {
            this.f85763d = m71383a(bArr, i);
        }
    }

    /* renamed from: a */
    static boolean m71386a(long j, int i, int i2, byte[] bArr, List list, aqdi aqdi) {
        long j2;
        int i3 = i;
        int i4 = i2;
        byte[] bArr2 = bArr;
        List list2 = list;
        aqdi aqdi2 = aqdi;
        long j3 = j;
        list2.add(aqdi2.mo47757a(j3));
        boolean z = true;
        if (i4 == 0) {
            return true;
        }
        boolean z2 = false;
        if (bArr2 == null || bArr2.length == 0 || i3 < 2 || i3 > 28) {
            return false;
        }
        try {
            aqdj aqdj = new aqdj(i3, bArr2);
            int i5 = 0;
            while (i5 < i4) {
                long j4 = 0;
                while (aqdj.f85762c < aqdj.f85761b.length) {
                    long j5 = aqdj.f85763d;
                    long j6 = j5 & 1;
                    int i6 = aqdj.f85764e + (z ? 1 : 0);
                    aqdj.f85764e = i6;
                    aqdj.f85763d = j5 >>> (z ? 1 : 0);
                    if (i6 == 32) {
                        aqdj.m71385a();
                    }
                    if (j6 != 0) {
                        j4++;
                    }
                    if (j6 == 0) {
                        int i7 = aqdj.f85765f;
                        if (aqdj.f85762c < aqdj.f85761b.length) {
                            int i8 = 32 - aqdj.f85764e;
                            if (i8 < i7) {
                                long j7 = aqdj.f85763d;
                                int i9 = i7 - i8;
                                aqdj.m71385a();
                                j2 = j7 | (aqdj.m71382a(i9) << (i7 - i9));
                            } else {
                                j2 = aqdj.m71382a(i7);
                            }
                            if (aqdj.f85764e == 32) {
                                aqdj.m71385a();
                            }
                            j3 += (j4 << aqdj.f85765f) + j2;
                            list2.add(aqdi2.mo47757a(j3));
                            i5++;
                            z = true;
                            z2 = false;
                        } else {
                            throw new aqdh();
                        }
                    } else {
                        z = true;
                    }
                }
                throw new aqdh();
            }
            return list.size() != i4 + (z ? 1 : 0) ? z2 : z;
        } catch (aqdh e) {
            return false;
        }
    }
}
