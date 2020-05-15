package p000;

import java.util.ArrayList;

/* renamed from: ypp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ypp implements ypj {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Iterable mo30649a(Iterable iterable) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (!bnjd.m109598e(iterable)) {
            bngx a = bngx.m109355a(iterable);
            arrayList.add((yhu) a.get(0));
            double d = 50.0d;
            double d2 = 50.0d;
            int i = 0;
            while (i < a.size() - 1) {
                int i2 = i + 1;
                double max = Math.max(d, ypk.m44527b((yhu) a.get(i), (yhu) a.get(i2)));
                if (max / d2 <= 4.0d) {
                    i = i2;
                    d2 = max;
                } else {
                    bmxy.m108589a(i2 > 0 && i2 < a.size(), "jumpIdx must be larger than zero and in bounds");
                    int i3 = i2 - 1;
                    int min = Math.min(10, (a.size() - i2) - 4);
                    int i4 = 3;
                    if (i2 > 3 && min > 0) {
                        double max2 = Math.max(d, ypk.m44527b((yhu) a.get(i3 - 1), (yhu) a.get(i3)));
                        int i5 = 1;
                        while (true) {
                            if (i5 > min) {
                                break;
                            }
                            int i6 = i2 + i5;
                            long abs = Math.abs(yhf.m44096c((yhu) a.get(i6)) - yhf.m44096c((yhu) a.get(i3)));
                            long abs2 = Math.abs(yhf.m44096c((yhu) a.get(i6 - 1)) - yhf.m44096c((yhu) a.get(i2)));
                            if (abs > 3600000 || abs2 > 600000) {
                                break;
                            }
                            if (ypk.m44527b((yhu) a.get(i3), (yhu) a.get(i6)) / max2 <= 2.0d) {
                                int i7 = 1;
                                while (true) {
                                    if (i7 < i4) {
                                        if (ypk.m44527b((yhu) a.get((i2 - i7) - 1), (yhu) a.get(i6)) / max2 > 2.0d) {
                                            z = false;
                                            break;
                                        }
                                        i7++;
                                    } else {
                                        z = true;
                                        break;
                                    }
                                }
                                int i8 = 1;
                                while (z) {
                                    if (i8 < i4) {
                                        if (ypk.m44527b((yhu) a.get(i3), (yhu) a.get(i6 + i8)) / max2 > 2.0d) {
                                            break;
                                        }
                                        i8++;
                                        i4 = 3;
                                    } else {
                                        i2 = i6;
                                        break;
                                    }
                                }
                                continue;
                            }
                            i5++;
                            i4 = 3;
                        }
                    }
                    i = i2;
                }
                arrayList.add((yhu) a.get(i));
                d = 50.0d;
            }
            for (int i9 = i + 1; i9 < a.size(); i9++) {
                arrayList.add((yhu) a.get(i9));
            }
        }
        return arrayList;
    }
}
