package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bfhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfhz {

    /* renamed from: a */
    public final int f113983a;

    /* renamed from: b */
    public final int f113984b;

    /* renamed from: c */
    public final int f113985c;

    /* renamed from: d */
    public final int f113986d;

    /* renamed from: e */
    public final int f113987e;

    /* renamed from: f */
    public final bfio f113988f;

    /* renamed from: g */
    public int f113989g;

    /* renamed from: h */
    public long f113990h;

    public bfhz(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        boolean z4 = true;
        if (i5 == 0 && i6 == 0) {
            i5 = 1000;
            i6 = 1000;
        } else {
            if (i5 <= 0) {
                z3 = false;
            } else {
                z3 = i6 > 0;
            }
            bmxy.m108588a(z3);
            bmxy.m108588a(i5 < i6);
        }
        long j = (long) i6;
        if (j < TimeUnit.HOURS.toMillis(1)) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        long j2 = ((long) i5) * 48000;
        if (j2 % 1000 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108588a(z2);
        long j3 = j * 48000;
        bmxy.m108588a(j3 % 1000 != 0 ? false : z4);
        this.f113987e = i7;
        int i9 = (int) (j2 / 1000);
        this.f113984b = i9;
        this.f113988f = new bfio(i9 * i8, i7 * i8, Float.class);
        this.f113986d = i8;
        this.f113983a = i6;
        this.f113985c = (int) (j3 / 1000);
        this.f113989g = 0;
    }
}
