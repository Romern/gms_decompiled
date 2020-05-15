package p000;

import java.util.Locale;

/* renamed from: beso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beso {

    /* renamed from: a */
    public final float f112305a;

    /* renamed from: b */
    public final float f112306b;

    /* renamed from: c */
    public final besr f112307c;

    /* renamed from: d */
    public final int f112308d;

    /* renamed from: e */
    public final besr f112309e;

    /* renamed from: f */
    public final Float f112310f;

    /* renamed from: g */
    public final float f112311g;

    /* renamed from: h */
    public final long f112312h;

    /* renamed from: i */
    public final long f112313i;

    /* renamed from: j */
    public final int f112314j;

    /* renamed from: k */
    public final int f112315k;

    public beso(float f, float f2, besr besr, int i, besr besr2, Float f3, float f4, long j, long j2, int i2, int i3) {
        this.f112305a = f;
        this.f112306b = f2;
        this.f112307c = besr;
        this.f112308d = i;
        this.f112309e = besr2;
        this.f112310f = f3;
        this.f112311g = f4;
        this.f112312h = j;
        this.f112313i = j2;
        this.f112314j = i2;
        this.f112315k = i3;
    }

    public final String toString() {
        String str;
        String format = String.format(Locale.US, "(%f,%f,%f) from %d samples", Float.valueOf(this.f112307c.f112320b), Float.valueOf(this.f112307c.f112321c), Float.valueOf(this.f112307c.f112322d), Integer.valueOf(this.f112308d));
        if (this.f112309e != null) {
            str = String.format(Locale.US, "(%f,%f,%f)", Float.valueOf(this.f112309e.f112320b), Float.valueOf(this.f112309e.f112321c), Float.valueOf(this.f112309e.f112322d));
        } else {
            str = "null";
        }
        return String.format(Locale.US, "AccelWindowResult [angleThreshold=%.3f, energyThreshold=%.1f, gravityVectorCurrent=%s, gravityVectorPrevious=%s, angle=%f, energy=%.3f, time window=(%d, %d), lastReportedState=%s, state=%s]", Float.valueOf(this.f112305a), Float.valueOf(this.f112306b), format, str, this.f112310f, Float.valueOf(this.f112311g), Long.valueOf(this.f112312h), Long.valueOf(this.f112313i), besq.m95723a(this.f112314j), besq.m95723a(this.f112315k));
    }
}
