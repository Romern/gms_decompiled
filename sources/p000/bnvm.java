package p000;

/* renamed from: bnvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnvm extends Number {

    /* renamed from: b */
    private static final double f132226b;
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final double[] f132227a;

    static {
        double d = 1.0d;
        do {
            d *= 0.5d;
        } while (d + 1.0d != 1.0d);
        f132226b = (double) ((1 << ((((int) Math.round((-Math.log(d)) / Math.log(2.0d))) + 1) / 2)) + 1);
    }

    private bnvm(double... dArr) {
        this.f132227a = dArr;
    }

    /* renamed from: a */
    private static double m110511a(double d, double d2, double d3) {
        double d4 = d3 - d;
        return (d - (d3 - d4)) + (d2 - d4);
    }

    /* renamed from: b */
    private static double m110516b(double d) {
        double d2 = f132226b * d;
        return d2 - (d2 - d);
    }

    /* renamed from: b */
    private static boolean m110517b(double d, double d2) {
        return ((d2 > d ? 1 : (d2 == d ? 0 : -1)) > 0) == ((d2 > (-d) ? 1 : (d2 == (-d) ? 0 : -1)) > 0);
    }

    public final double doubleValue() {
        double d = 0.0d;
        for (double d2 : this.f132227a) {
            d += d2;
        }
        return d;
    }

    public final float floatValue() {
        return (float) doubleValue();
    }

    public final int intValue() {
        return (int) longValue();
    }

    public final long longValue() {
        return Math.round(doubleValue());
    }

    public final String toString() {
        return Double.toString(doubleValue());
    }

    /* renamed from: a */
    private static double m110512a(double d, double d2, double d3, double d4) {
        double b = m110516b(d);
        double d5 = d - b;
        return (d5 * d3) - (((d4 - (b * d2)) - (d5 * d2)) - (b * d3));
    }

    /* renamed from: a */
    public static bnvm m110513a(double d, double d2) {
        double d3 = d * d2;
        double b = m110516b(d2);
        return new bnvm(m110512a(d, b, d2 - b, d3), d3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnvm.a(bnvm, bnvm, boolean):bnvm
     arg types: [bnvm, bnvm, int]
     candidates:
      bnvm.a(double, double, double):double
      bnvm.a(bnvm, bnvm, boolean):bnvm */
    /* renamed from: b */
    public final bnvm mo68539b(bnvm bnvm) {
        return m110514a(this, bnvm, true);
    }

    /* renamed from: a */
    private static bnvm m110514a(bnvm bnvm, bnvm bnvm2, boolean z) {
        double d;
        int i;
        double d2;
        int i2;
        double d3;
        double d4;
        double d5;
        int i3;
        int i4;
        bnvm bnvm3 = bnvm;
        bnvm bnvm4 = bnvm2;
        if (!z) {
            d = 1.0d;
        } else {
            d = -1.0d;
        }
        double[] dArr = bnvm3.f132227a;
        int length = dArr.length;
        double[] dArr2 = bnvm4.f132227a;
        int length2 = length + dArr2.length;
        double[] dArr3 = new double[length2];
        int i5 = 0;
        if (m110517b(dArr[0], dArr2[0])) {
            d2 = bnvm3.f132227a[0];
            i2 = 1;
            i = 0;
        } else {
            d2 = bnvm4.f132227a[0] * d;
            i2 = 0;
            i = 1;
        }
        double[] dArr4 = bnvm3.f132227a;
        if (i2 < dArr4.length) {
            double[] dArr5 = bnvm4.f132227a;
            if (i < dArr5.length) {
                if (m110517b(dArr4[i2], dArr5[i])) {
                    d3 = bnvm3.f132227a[i2];
                    i2++;
                } else {
                    d3 = d * bnvm4.f132227a[i];
                    i++;
                }
                double d6 = d3 + d2;
                double d7 = d2 - (d6 - d3);
                if (d7 != 0.0d) {
                    dArr3[0] = d7;
                    d4 = d6;
                    i5 = 1;
                } else {
                    d4 = d6;
                }
                while (true) {
                    double[] dArr6 = bnvm3.f132227a;
                    if (i2 >= dArr6.length) {
                        break;
                    }
                    double[] dArr7 = bnvm4.f132227a;
                    if (i >= dArr7.length) {
                        break;
                    }
                    int i6 = length2;
                    if (m110517b(dArr6[i2], dArr7[i])) {
                        double d8 = bnvm3.f132227a[i2];
                        i2++;
                        i3 = i;
                        d5 = d8;
                    } else {
                        i3 = i + 1;
                        d5 = bnvm4.f132227a[i] * d;
                    }
                    double d9 = d2 + d5;
                    double a = m110511a(d2, d5, d9);
                    if (a != 0.0d) {
                        dArr3[i5] = a;
                        i4 = i3;
                        i5++;
                    } else {
                        i4 = i3;
                    }
                    d4 = d9;
                    length2 = i6;
                }
            }
        }
        int i7 = i;
        while (true) {
            double[] dArr8 = bnvm3.f132227a;
            if (i2 >= dArr8.length) {
                break;
            }
            int i8 = i2 + 1;
            double d10 = dArr8[i2];
            double d11 = d2 + d10;
            double a2 = m110511a(d2, d10, d11);
            if (a2 != 0.0d) {
                dArr3[i5] = a2;
                i5++;
            }
            i2 = i8;
            d2 = d11;
        }
        while (true) {
            double[] dArr9 = bnvm4.f132227a;
            if (i7 >= dArr9.length) {
                break;
            }
            int i9 = i7 + 1;
            double d12 = dArr9[i7] * d;
            double d13 = d2 + d12;
            double a3 = m110511a(d2, d12, d13);
            if (a3 != 0.0d) {
                dArr3[i5] = a3;
                i5++;
            }
            i7 = i9;
            d2 = d13;
        }
        if (d2 != 0.0d || i5 == 0) {
            dArr3[i5] = d2;
            i5++;
        }
        if (length2 > i5) {
            dArr3 = m110515a(dArr3, i5);
        }
        return new bnvm(dArr3);
    }

    /* renamed from: a */
    private static double[] m110515a(double[] dArr, int i) {
        double[] dArr2 = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            dArr2[i2] = dArr[i2];
        }
        return dArr2;
    }

    /* renamed from: a */
    public final bnvm mo68537a(double d) {
        int i;
        int length = this.f132227a.length;
        int i2 = length + length;
        double[] dArr = new double[i2];
        double b = m110516b(d);
        double d2 = d - b;
        int i3 = 0;
        double d3 = this.f132227a[0];
        double d4 = d3 * d;
        double a = m110512a(d3, b, d2, d4);
        if (a != 0.0d) {
            dArr[0] = a;
            i3 = 1;
        }
        double d5 = d4;
        int i4 = i3;
        int i5 = 1;
        while (true) {
            double[] dArr2 = this.f132227a;
            if (i5 >= dArr2.length) {
                break;
            }
            double d6 = dArr2[i5];
            double d7 = d6 * d;
            double a2 = m110512a(d6, b, d2, d7);
            double d8 = d5 + a2;
            double a3 = m110511a(d5, a2, d8);
            if (a3 != 0.0d) {
                dArr[i4] = a3;
                i4++;
            }
            d5 = d7 + d8;
            double d9 = d8 - (d5 - d7);
            if (d9 != 0.0d) {
                dArr[i4] = d9;
                i4++;
            }
            i5++;
        }
        if (d5 == 0.0d && i4 != 0) {
            i = i4;
        } else {
            i = i4 + 1;
            dArr[i4] = d5;
        }
        if (i2 > i) {
            dArr = m110515a(dArr, i);
        }
        return new bnvm(dArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnvm.a(bnvm, bnvm, boolean):bnvm
     arg types: [bnvm, bnvm, int]
     candidates:
      bnvm.a(double, double, double):double
      bnvm.a(bnvm, bnvm, boolean):bnvm */
    /* renamed from: a */
    public final bnvm mo68538a(bnvm bnvm) {
        return m110514a(this, bnvm, false);
    }
}
