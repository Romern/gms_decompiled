package p000;

/* renamed from: bsdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsdg {
    /* renamed from: a */
    public static void m115306a(adyn adyn, adyn adyn2, adyn adyn3) {
        adyn adyn4 = adyn;
        adyn adyn5 = adyn2;
        adyn adyn6 = adyn3;
        int i = adyn4.f62913b;
        if (i == adyn5.f62912a) {
            int i2 = adyn6.f62912a;
            int i3 = adyn4.f62912a;
            if (i2 != i3 || adyn6.f62913b != adyn5.f62913b) {
                throw new IllegalArgumentException(String.format("C has wrong dimensions (should be %d x %d but is %d x %d)", Integer.valueOf(i3), Integer.valueOf(adyn5.f62913b), Integer.valueOf(adyn6.f62912a), Integer.valueOf(adyn6.f62913b)));
            } else if (adyn6 == adyn4 || adyn6 == adyn5) {
                throw new IllegalArgumentException("c must be a different object from a or b");
            } else {
                int i4 = 0;
                int i5 = 0;
                while (i4 < adyn6.f62914c) {
                    int i6 = adyn5.f62912a + i5;
                    int i7 = i4;
                    int i8 = 0;
                    while (i8 < adyn4.f62912a) {
                        double d = 0.0d;
                        int i9 = i8;
                        for (int i10 = i5; i10 < i6; i10++) {
                            d += adyn4.f62915d[i9] * adyn5.f62915d[i10];
                            i9 += adyn4.f62912a;
                        }
                        adyn6.f62915d[i7] = d;
                        i8++;
                        i7++;
                    }
                    i4 += adyn6.f62912a;
                    i5 += adyn5.f62912a;
                }
            }
        } else {
            throw new IllegalArgumentException(String.format("Number of columns in A doesn't match number of rows in B (%d != %d)", Integer.valueOf(i), Integer.valueOf(adyn5.f62912a)));
        }
    }

    /* renamed from: b */
    public static void m115307b(adyn adyn, adyn adyn2, adyn adyn3) {
        adyn adyn4 = adyn;
        adyn adyn5 = adyn2;
        adyn adyn6 = adyn3;
        int i = adyn4.f62913b;
        if (i == adyn5.f62912a) {
            int i2 = adyn6.f62912a;
            int i3 = adyn4.f62912a;
            if (i2 != i3 || adyn6.f62913b != adyn5.f62913b) {
                throw new IllegalArgumentException(String.format("C has wrong dimensions (should be %d x %d but is %d x %d)", Integer.valueOf(i3), Integer.valueOf(adyn5.f62913b), Integer.valueOf(adyn6.f62912a), Integer.valueOf(adyn6.f62913b)));
            } else if (adyn6 == adyn4 || adyn6 == adyn5) {
                throw new IllegalArgumentException("c must be a different object from a or b");
            } else {
                int i4 = 0;
                int i5 = 0;
                while (i4 < adyn6.f62914c) {
                    int i6 = adyn5.f62912a + i5;
                    int i7 = i4;
                    int i8 = 0;
                    while (i8 < adyn4.f62912a) {
                        double d = 0.0d;
                        int i9 = i8;
                        for (int i10 = i5; i10 < i6; i10++) {
                            d += adyn4.f62915d[i9] * adyn5.f62915d[i10];
                            i9 += adyn4.f62912a;
                        }
                        double[] dArr = adyn6.f62915d;
                        dArr[i7] = dArr[i7] + d;
                        i8++;
                        i7++;
                    }
                    i4 += adyn6.f62912a;
                    i5 += adyn5.f62912a;
                }
            }
        } else {
            throw new IllegalArgumentException(String.format("Number of columns in A doesn't match number of rows in B (%d != %d)", Integer.valueOf(i), Integer.valueOf(adyn5.f62912a)));
        }
    }

    /* renamed from: c */
    public static void m115308c(adyn adyn, adyn adyn2, adyn adyn3) {
        adyn adyn4 = adyn;
        adyn adyn5 = adyn2;
        adyn adyn6 = adyn3;
        int i = adyn4.f62912a;
        if (i == adyn5.f62912a) {
            int i2 = adyn6.f62912a;
            int i3 = adyn4.f62913b;
            if (i2 != i3 || adyn6.f62913b != adyn5.f62913b) {
                throw new IllegalArgumentException(String.format("C has wrong dimensions (should be %d x %d but is %d x %d)", Integer.valueOf(i3), Integer.valueOf(adyn5.f62913b), Integer.valueOf(adyn6.f62912a), Integer.valueOf(adyn6.f62913b)));
            } else if (adyn6 == adyn4 || adyn6 == adyn5) {
                throw new IllegalArgumentException("c must be a different object from a or b");
            } else {
                int i4 = 0;
                int i5 = 0;
                while (i4 < adyn6.f62914c) {
                    int i6 = adyn5.f62912a + i5;
                    int i7 = i4;
                    int i8 = 0;
                    while (i8 < adyn4.f62914c) {
                        double d = 0.0d;
                        int i9 = i8;
                        for (int i10 = i5; i10 < i6; i10++) {
                            d += adyn4.f62915d[i9] * adyn5.f62915d[i10];
                            i9++;
                        }
                        adyn6.f62915d[i7] = d;
                        i8 += adyn4.f62912a;
                        i7++;
                    }
                    i4 += adyn6.f62912a;
                    i5 += adyn5.f62912a;
                }
            }
        } else {
            throw new IllegalArgumentException(String.format("Number of columns in A' doesn't match number of rows in B (%d != %d)", Integer.valueOf(i), Integer.valueOf(adyn5.f62912a)));
        }
    }

    /* renamed from: d */
    public static void m115309d(adyn adyn, adyn adyn2, adyn adyn3) {
        adyn adyn4 = adyn;
        adyn adyn5 = adyn2;
        adyn adyn6 = adyn3;
        int i = adyn4.f62913b;
        if (i == adyn5.f62913b) {
            int i2 = adyn6.f62912a;
            int i3 = adyn4.f62912a;
            if (i2 != i3 || adyn6.f62913b != adyn5.f62912a) {
                throw new IllegalArgumentException(String.format("C has wrong dimensions (should be %d x %d but is %d x %d)", Integer.valueOf(i3), Integer.valueOf(adyn5.f62912a), Integer.valueOf(adyn6.f62912a), Integer.valueOf(adyn6.f62913b)));
            } else if (adyn6 == adyn4 || adyn6 == adyn5) {
                throw new IllegalArgumentException("c must be a different object from a or b");
            } else {
                int i4 = 0;
                int i5 = 0;
                while (i4 < adyn6.f62914c) {
                    int i6 = adyn5.f62914c;
                    int i7 = i4;
                    int i8 = 0;
                    while (i8 < adyn4.f62912a) {
                        double d = 0.0d;
                        int i9 = i8;
                        for (int i10 = i5; i10 < i6; i10 += adyn5.f62912a) {
                            d += adyn4.f62915d[i9] * adyn5.f62915d[i10];
                            i9 += adyn4.f62912a;
                        }
                        adyn6.f62915d[i7] = d;
                        i8++;
                        i7++;
                    }
                    i4 += adyn6.f62912a;
                    i5++;
                }
            }
        } else {
            throw new IllegalArgumentException(String.format("Number of columns in A doesn't match number of rows in B' (%d != %d)", Integer.valueOf(i), Integer.valueOf(adyn5.f62913b)));
        }
    }

    /* renamed from: e */
    public static void m115310e(adyn adyn, adyn adyn2, adyn adyn3) {
        m115312g(adyn, adyn2, adyn3);
        for (int i = 0; i < adyn.f62914c; i++) {
            adyn3.f62915d[i] = adyn.f62915d[i] + adyn2.f62915d[i];
        }
    }

    /* renamed from: f */
    public static void m115311f(adyn adyn, adyn adyn2, adyn adyn3) {
        m115312g(adyn, adyn2, adyn3);
        for (int i = 0; i < adyn.f62914c; i++) {
            adyn3.f62915d[i] = adyn.f62915d[i] - adyn2.f62915d[i];
        }
    }

    /* renamed from: g */
    public static void m115312g(adyn adyn, adyn adyn2, adyn adyn3) {
        int i;
        int i2 = adyn.f62913b;
        if (i2 != adyn2.f62913b || (i = adyn.f62912a) != adyn2.f62912a) {
            throw new IllegalArgumentException(String.format("Dimensions of A and B don't match (A is %d x %d and B is %d x %d)", Integer.valueOf(adyn.f62912a), Integer.valueOf(adyn.f62913b), Integer.valueOf(adyn2.f62912a), Integer.valueOf(adyn2.f62913b)));
        } else if (adyn3.f62912a != i || adyn3.f62913b != i2) {
            throw new IllegalArgumentException(String.format("output has wrong dimensions (should be %d x %d but is %d x %d)", Integer.valueOf(i), Integer.valueOf(adyn.f62913b), Integer.valueOf(adyn3.f62912a), Integer.valueOf(adyn3.f62913b)));
        }
    }
}
