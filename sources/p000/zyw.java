package p000;

import com.google.android.gms.fonts.FontMatchSpec;
import java.util.ArrayList;

/* renamed from: zyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyw {

    /* renamed from: a */
    private final zyv f56232a;

    public zyw(zyv zyv) {
        sdo.m34966a(zyv, "directory");
        this.f56232a = zyv;
    }

    /* renamed from: a */
    private static float m46722a(float f, zxg zxg) {
        float f2 = zxg.f56092a;
        float f3 = f2 - f;
        float f4 = zxg.f56093b;
        if (f4 > f2) {
            f2 = f4;
        }
        float f5 = f - f2;
        if (f3 >= 0.0f || f5 >= 0.0f) {
            return Math.max(f3, f5);
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final zyu mo31611a(FontMatchSpec fontMatchSpec) {
        FontMatchSpec fontMatchSpec2 = fontMatchSpec;
        zyu a = zyu.m46718a(this.f56232a.f56231a.f56082b);
        zxi a2 = this.f56232a.mo31609a(fontMatchSpec2.f32464b);
        if (a2 == null) {
            return a;
        }
        if (!fontMatchSpec2.f32468f) {
            bxwc bxwc = a2.f56107d;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                zxh zxh = (zxh) bxwc.get(i);
                float f = fontMatchSpec2.f32465c;
                zxg zxg = zxh.f56099c;
                if (zxg == null) {
                    zxg = zxg.f56090c;
                }
                if (m46722a(f, zxg) < 0.5f) {
                    int i2 = fontMatchSpec2.f32466d;
                    zxj zxj = zxh.f56098b;
                    if (zxj == null) {
                        zxj = zxj.f56108c;
                    }
                    int i3 = zxj.f56110a;
                    int i4 = i3 - i2;
                    int max = i2 - Math.max(zxj.f56111b, i3);
                    if ((i4 < 0 && max < 0) || Math.max(i4, max) == 0) {
                        float f2 = fontMatchSpec2.f32467e;
                        zxg zxg2 = zxh.f56100d;
                        if (zxg2 == null) {
                            zxg2 = zxg.f56090c;
                        }
                        if (m46722a(f2, zxg2) < 0.1f) {
                            return new zyu(a2, zxh, this.f56232a.f56231a.f56082b);
                        }
                    }
                }
            }
            return a;
        }
        bxwc bxwc2 = a2.f56107d;
        if (fontMatchSpec2 == null) {
            throw new IllegalArgumentException("spec is null");
        } else if (bxwc2 != null) {
            float f3 = fontMatchSpec2.f32465c;
            ArrayList arrayList = new ArrayList();
            float f4 = -1.0f;
            float f5 = f3 <= 100.0f ? -1.0f : 1.0f;
            int size2 = bxwc2.size();
            float f6 = Float.MAX_VALUE;
            float f7 = Float.MAX_VALUE;
            for (int i5 = 0; i5 < size2; i5++) {
                zxh zxh2 = (zxh) bxwc2.get(i5);
                zxg zxg3 = zxh2.f56099c;
                if (zxg3 == null) {
                    zxg3 = zxg.f56090c;
                }
                float f8 = zxg3.f56092a - f3;
                float abs = Math.abs(f8);
                if (abs > 0.01f && f5 != Math.signum(f8)) {
                    abs += 1000.0f;
                }
                if (abs <= f7) {
                    if (abs < f7) {
                        arrayList.clear();
                        f7 = abs;
                    }
                    arrayList.add(zxh2);
                }
            }
            if (!arrayList.isEmpty()) {
                float f9 = fontMatchSpec2.f32467e;
                ArrayList arrayList2 = new ArrayList();
                int size3 = arrayList.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    zxh zxh3 = (zxh) arrayList.get(i6);
                    zxg zxg4 = zxh3.f56100d;
                    if (zxg4 == null) {
                        zxg4 = zxg.f56090c;
                    }
                    float abs2 = Math.abs(zxg4.f56092a - f9);
                    if (abs2 <= f6) {
                        if (abs2 < f6) {
                            arrayList2.clear();
                            f6 = abs2;
                        }
                        arrayList2.add(zxh3);
                    }
                }
                int i7 = fontMatchSpec2.f32466d;
                if (i7 > 500) {
                    f4 = 1.0f;
                }
                int size4 = arrayList2.size();
                zxh zxh4 = null;
                int i8 = 0;
                int i9 = Integer.MAX_VALUE;
                while (i8 < size4) {
                    zxh zxh5 = (zxh) arrayList2.get(i8);
                    zxj zxj2 = zxh5.f56098b;
                    if (zxj2 == null) {
                        zxj2 = zxj.f56108c;
                    }
                    int i10 = zxj2.f56110a - i7;
                    int abs3 = Math.abs(i10);
                    float signum = Math.signum((float) i10);
                    if (i7 == 400) {
                        zxj zxj3 = zxh5.f56098b;
                        if (zxj3 == null) {
                            zxj3 = zxj.f56108c;
                        }
                        if (zxj3.f56110a > 400) {
                            zxj zxj4 = zxh5.f56098b;
                            if (zxj4 == null) {
                                zxj4 = zxj.f56108c;
                            }
                            if (zxj4.f56110a <= 500) {
                                abs3--;
                                signum = f4;
                            }
                        }
                    }
                    if (abs3 > 0 && f4 != signum) {
                        abs3 += 1000;
                    }
                    int i11 = abs3 >= i9 ? i9 : abs3;
                    if (abs3 < i9) {
                        zxh4 = zxh5;
                    }
                    i8++;
                    i9 = i11;
                }
                return new zyu(a2, zxh4, this.f56232a.f56231a.f56082b);
            }
            throw new IllegalArgumentException("fonts is empty");
        } else {
            throw new IllegalArgumentException("fonts is null");
        }
    }
}
