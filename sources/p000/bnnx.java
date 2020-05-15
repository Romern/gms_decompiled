package p000;

import java.util.Arrays;

/* renamed from: bnnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnnx {

    /* renamed from: a */
    transient Object[] f131882a;

    /* renamed from: b */
    transient int[] f131883b;

    /* renamed from: c */
    transient int f131884c;

    /* renamed from: d */
    transient int f131885d;

    /* renamed from: e */
    public transient int[] f131886e;

    /* renamed from: f */
    transient long[] f131887f;

    /* renamed from: g */
    private transient float f131888g;

    /* renamed from: h */
    private transient int f131889h;

    public bnnx() {
        mo68157g(3);
    }

    /* renamed from: a */
    private static int m109890a(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: a */
    private static long m109891a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: b */
    private final int m109892b() {
        return this.f131886e.length - 1;
    }

    /* renamed from: i */
    private static int[] m109893i(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: j */
    private final void m109894j(int i) {
        if (this.f131886e.length < 1073741824) {
            int i2 = ((int) (((float) i) * this.f131888g)) + 1;
            int[] i3 = m109893i(i);
            long[] jArr = this.f131887f;
            int length = i3.length - 1;
            for (int i4 = 0; i4 < this.f131884c; i4++) {
                int a = m109890a(jArr[i4]);
                int i5 = a & length;
                int i6 = i3[i5];
                i3[i5] = i4;
                jArr[i4] = (((long) a) << 32) | (((long) i6) & 4294967295L);
            }
            this.f131889h = i2;
            this.f131886e = i3;
            return;
        }
        this.f131889h = Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo68146a() {
        return this.f131884c == 0 ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo68147a(int i) {
        int i2 = i + 1;
        if (i2 >= this.f131884c) {
            return -1;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo68153c(int i) {
        bmxy.m108584a(i, this.f131884c);
        return this.f131883b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo68154d(int i) {
        if (i > this.f131887f.length) {
            mo68155e(i);
        }
        if (i >= this.f131889h) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            m109894j(Math.max(2, highestOneBit + highestOneBit));
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
    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo68155e(int i) {
        this.f131882a = Arrays.copyOf(this.f131882a, i);
        this.f131883b = Arrays.copyOf(this.f131883b, i);
        long[] jArr = this.f131887f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.f131887f = copyOf;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo68156f(int i) {
        long[] jArr;
        long j;
        Object obj = this.f131882a[i];
        int a = m109890a(this.f131887f[i]);
        int b = m109892b() & a;
        int i2 = this.f131886e[b];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (m109890a(this.f131887f[i2]) != a || !bmxi.m108538a(obj, this.f131882a[i2])) {
                int i4 = (int) this.f131887f[i2];
                if (i4 == -1) {
                    return 0;
                }
                i3 = i2;
                i2 = i4;
            } else {
                int i5 = this.f131883b[i2];
                if (i3 == -1) {
                    this.f131886e[b] = (int) this.f131887f[i2];
                } else {
                    long[] jArr2 = this.f131887f;
                    jArr2[i3] = m109891a(jArr2[i3], (int) jArr2[i2]);
                }
                int i6 = this.f131884c - 1;
                if (i2 < i6) {
                    Object[] objArr = this.f131882a;
                    objArr[i2] = objArr[i6];
                    int[] iArr = this.f131883b;
                    iArr[i2] = iArr[i6];
                    objArr[i6] = null;
                    iArr[i6] = 0;
                    long[] jArr3 = this.f131887f;
                    long j2 = jArr3[i6];
                    jArr3[i2] = j2;
                    jArr3[i6] = -1;
                    int a2 = m109890a(j2) & m109892b();
                    int[] iArr2 = this.f131886e;
                    int i7 = iArr2[a2];
                    if (i7 == i6) {
                        iArr2[a2] = i2;
                    } else {
                        while (true) {
                            jArr = this.f131887f;
                            j = jArr[i7];
                            int i8 = (int) j;
                            if (i8 == i6) {
                                break;
                            }
                            i7 = i8;
                        }
                        jArr[i7] = m109891a(j, i2);
                    }
                } else {
                    this.f131882a[i2] = null;
                    this.f131883b[i2] = 0;
                    this.f131887f[i2] = -1;
                }
                this.f131884c--;
                this.f131885d++;
                return i5;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(long[], long):void}
     arg types: [long[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(long[], long):void} */
    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo68157g(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Initial capacity must be non-negative");
        bmxy.m108589a(true, (Object) "Illegal load factor");
        int b = bngg.m109306b(i);
        this.f131886e = m109893i(b);
        this.f131888g = 1.0f;
        this.f131882a = new Object[i];
        this.f131883b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f131887f = jArr;
        this.f131889h = Math.max(1, (int) ((float) b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final bnno mo68158h(int i) {
        bmxy.m108584a(i, this.f131884c);
        return new bnno(this, i);
    }

    /* renamed from: b */
    public final int mo68151b(Object obj) {
        int a = mo68148a(obj);
        if (a != -1) {
            return this.f131883b[a];
        }
        return 0;
    }

    public bnnx(int i) {
        mo68157g(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object mo68152b(int i) {
        bmxy.m108584a(i, this.f131884c);
        return this.f131882a[i];
    }

    public bnnx(bnnx bnnx) {
        mo68157g(bnnx.f131884c);
        int a = bnnx.mo68146a();
        while (a != -1) {
            mo68150a(bnnx.mo68152b(a), bnnx.mo68153c(a));
            a = bnnx.mo68147a(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo68148a(Object obj) {
        int a = bngg.m109305a(obj);
        int i = this.f131886e[m109892b() & a];
        while (i != -1) {
            long j = this.f131887f[i];
            if (m109890a(j) == a && bmxi.m108538a(obj, this.f131882a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo68149a(int i, int i2) {
        bmxy.m108584a(i, this.f131884c);
        this.f131883b[i] = i2;
    }

    /* renamed from: a */
    public final void mo68150a(Object obj, int i) {
        if (i > 0) {
            long[] jArr = this.f131887f;
            Object[] objArr = this.f131882a;
            int[] iArr = this.f131883b;
            int a = bngg.m109305a(obj);
            int b = m109892b() & a;
            int i2 = this.f131884c;
            int[] iArr2 = this.f131886e;
            int i3 = iArr2[b];
            if (i3 == -1) {
                iArr2[b] = i2;
            } else {
                while (true) {
                    long j = jArr[i3];
                    if (m109890a(j) != a || !bmxi.m108538a(obj, objArr[i3])) {
                        int i4 = (int) j;
                        if (i4 == -1) {
                            jArr[i3] = m109891a(j, i2);
                            break;
                        }
                        i3 = i4;
                    } else {
                        int i5 = iArr[i3];
                        iArr[i3] = i;
                        return;
                    }
                }
            }
            int i6 = Integer.MAX_VALUE;
            if (i2 != Integer.MAX_VALUE) {
                int i7 = i2 + 1;
                int length = this.f131887f.length;
                if (i7 > length) {
                    int max = Math.max(1, length >>> 1) + length;
                    if (max >= 0) {
                        i6 = max;
                    }
                    if (i6 != length) {
                        mo68155e(i6);
                    }
                }
                this.f131887f[i2] = (((long) a) << 32) | 4294967295L;
                this.f131882a[i2] = obj;
                this.f131883b[i2] = i;
                this.f131884c = i7;
                if (i2 >= this.f131889h) {
                    int length2 = this.f131886e.length;
                    m109894j(length2 + length2);
                }
                this.f131885d++;
                return;
            }
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("count must be positive but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
