package p000;

/* renamed from: bsdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsdf {

    /* renamed from: a */
    private adyn f144154a = null;

    /* renamed from: a */
    public final void mo70258a(adyn adyn) {
        adyn adyn2 = adyn;
        int i = adyn2.f62912a;
        if (i == adyn2.f62913b) {
            adyn adyn3 = this.f144154a;
            if (adyn3 == null || adyn3.f62912a < i) {
                adyn3 = new adyn(i, i);
            }
            adyn3.mo33934b(i, i);
            this.f144154a = adyn3;
            int i2 = adyn2.f62912a;
            int i3 = 0;
            while (i3 < adyn2.f62914c) {
                double d = 0.0d;
                for (int i4 = i3; i4 < i2; i4++) {
                    double d2 = adyn2.f62915d[i4];
                    int i5 = adyn2.f62912a;
                    int i6 = i4 - i5;
                    int i7 = i3 - i5;
                    while (i7 >= 0) {
                        double[] dArr = this.f144154a.f62915d;
                        d2 -= dArr[i6] * dArr[i7];
                        int i8 = adyn2.f62912a;
                        i6 -= i8;
                        i7 -= i8;
                    }
                    if (i4 != i3) {
                        this.f144154a.f62915d[i4] = d2 / d;
                    } else {
                        if (d2 >= 0.0d) {
                            d = Math.sqrt(d2);
                        } else if (d2 >= -0.001d) {
                            d = 0.0d;
                        } else {
                            throw new IllegalArgumentException(String.format("Input matrix must be positive definite\nMatrix: %s\nInternal Sum: %f", adyn2, Double.valueOf(d2)));
                        }
                        this.f144154a.f62915d[i4] = d;
                    }
                }
                int i9 = adyn2.f62912a;
                i2 += i9;
                i3 += i9 + 1;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("Input matrix must be square (is size %d x %d)", Integer.valueOf(i), Integer.valueOf(adyn2.f62913b)));
    }

    /* renamed from: b */
    public final void mo70260b(adyn adyn) {
        adyn adyn2;
        int i;
        int i2;
        adyn adyn3 = adyn;
        adyn adyn4 = this.f144154a;
        if (adyn4 != null) {
            int i3 = adyn3.f62912a;
            int i4 = adyn4.f62912a;
            int i5 = 1;
            if (i3 == i4 && adyn3.f62913b == adyn4.f62913b) {
                int i6 = adyn4.f62914c;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i7 < i6) {
                    int i10 = i8;
                    int i11 = i9;
                    while (true) {
                        i2 = this.f144154a.f62912a;
                        if (i11 >= i2) {
                            break;
                        }
                        double d = i9 == i11 ? 1.0d : 0.0d;
                        int i12 = i10 - i2;
                        for (int i13 = i11 - 1; i13 >= i9; i13--) {
                            adyn adyn5 = this.f144154a;
                            d -= adyn5.f62915d[i12] * adyn3.f62915d[i7 + i13];
                            i12 -= adyn5.f62912a;
                        }
                        double[] dArr = adyn3.f62915d;
                        adyn adyn6 = this.f144154a;
                        dArr[i7 + i11] = d / adyn6.f62915d[i10];
                        i10 += adyn6.f62912a + 1;
                        i11++;
                    }
                    i7 += i2;
                    i9++;
                    i8 += i2 + 1;
                }
                int i14 = this.f144154a.f62912a;
                int i15 = i6 - i14;
                for (int i16 = i14 - 1; i16 >= 0; i16--) {
                    int i17 = i6 - 1;
                    for (int i18 = this.f144154a.f62912a - 1; i18 >= i16; i18--) {
                        int i19 = i15 + i18;
                        double d2 = adyn3.f62915d[i19];
                        int i20 = i17 + 1;
                        int i21 = i18 + 1;
                        while (true) {
                            adyn2 = this.f144154a;
                            i = adyn2.f62912a;
                            if (i21 >= i) {
                                break;
                            }
                            d2 -= adyn2.f62915d[i20] * adyn3.f62915d[i15 + i21];
                            i20++;
                            i21++;
                        }
                        adyn3.f62915d[i19] = d2 / adyn2.f62915d[i17];
                        i17 -= i + 1;
                    }
                    i15 -= this.f144154a.f62912a;
                }
                for (int i22 = this.f144154a.f62912a; i22 < i6; i22 += this.f144154a.f62912a) {
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < i5) {
                        double[] dArr2 = adyn3.f62915d;
                        dArr2[i22 + i23] = dArr2[i24 + i5];
                        i23++;
                        i24 += this.f144154a.f62912a;
                    }
                    i5++;
                }
                return;
            }
            throw new IllegalArgumentException(String.format("output has the wrong size, should be %d x %d but is %d x %d", Integer.valueOf(i4), Integer.valueOf(this.f144154a.f62913b), Integer.valueOf(adyn3.f62912a), Integer.valueOf(adyn3.f62913b)));
        }
        throw new IllegalStateException("Must call decompose before calling invert");
    }

    /* renamed from: a */
    public final void mo70259a(adyn adyn, adyn adyn2) {
        int i;
        adyn adyn3;
        int i2;
        adyn adyn4;
        int i3;
        adyn adyn5 = this.f144154a;
        if (adyn5 != null) {
            int i4 = 0;
            if (adyn.f62913b != 1 || adyn.f62912a != (i = adyn5.f62913b)) {
                throw new IllegalArgumentException(String.format("b has the wrong size, should be %d x 1 but is %d x %d", Integer.valueOf(adyn5.f62913b), Integer.valueOf(adyn.f62912a), Integer.valueOf(adyn.f62913b)));
            } else if (adyn2.f62913b == 1 && adyn2.f62912a == i) {
                int i5 = 0;
                while (true) {
                    adyn3 = this.f144154a;
                    i2 = adyn3.f62914c;
                    if (i4 >= i2) {
                        break;
                    }
                    double d = adyn.f62915d[i5];
                    int i6 = i4 - adyn3.f62912a;
                    int i7 = i5 - 1;
                    while (i6 >= 0) {
                        adyn adyn6 = this.f144154a;
                        d -= adyn6.f62915d[i6] * adyn2.f62915d[i7];
                        i6 -= adyn6.f62912a;
                        i7--;
                    }
                    double[] dArr = adyn2.f62915d;
                    adyn adyn7 = this.f144154a;
                    dArr[i5] = d / adyn7.f62915d[i4];
                    i4 += adyn7.f62912a + 1;
                    i5++;
                }
                int i8 = i2 - 1;
                int i9 = adyn3.f62912a - 1;
                while (i8 >= 0) {
                    double d2 = adyn2.f62915d[i9];
                    int i10 = i8 + 1;
                    int i11 = i9 + 1;
                    while (true) {
                        adyn4 = this.f144154a;
                        i3 = adyn4.f62912a;
                        if (i11 >= i3) {
                            break;
                        }
                        d2 -= adyn4.f62915d[i10] * adyn2.f62915d[i11];
                        i10++;
                        i11++;
                    }
                    adyn2.f62915d[i9] = d2 / adyn4.f62915d[i8];
                    i8 -= i3 + 1;
                    i9--;
                }
            } else {
                throw new IllegalArgumentException(String.format("x has the wrong size, should be %d x 1 but is %d x %d", Integer.valueOf(i), Integer.valueOf(adyn2.f62912a), Integer.valueOf(adyn2.f62913b)));
            }
        } else {
            throw new IllegalStateException("Must call decompose before calling solve");
        }
    }
}
