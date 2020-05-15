package p000;

import java.util.Locale;

/* renamed from: ynu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ynu {

    /* renamed from: a */
    public final long f54238a;

    /* renamed from: b */
    public long f54239b;

    /* renamed from: c */
    public float f54240c;

    /* renamed from: d */
    public final yfr f54241d;

    public ynu(long j, long j2, float f, yfr yfr) {
        this.f54238a = j;
        this.f54239b = j2;
        this.f54240c = f;
        this.f54241d = yfr;
    }

    public final String toString() {
        return String.format(Locale.US, "RawDistance{[%f] %d - %d}", Float.valueOf(this.f54240c), Long.valueOf(this.f54238a), Long.valueOf(this.f54239b));
    }
}
