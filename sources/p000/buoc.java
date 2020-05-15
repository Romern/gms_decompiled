package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: buoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buoc {

    /* renamed from: a */
    public final bfkf f154473a;

    /* renamed from: b */
    public final long f154474b;

    /* renamed from: c */
    public final long f154475c;

    /* renamed from: d */
    public final long f154476d;

    /* renamed from: e */
    public final int f154477e;

    /* renamed from: f */
    public final double f154478f;

    /* renamed from: g */
    public long f154479g = -1;

    /* renamed from: h */
    public long f154480h;

    /* renamed from: i */
    public long f154481i;

    public buoc(long j, long j2, long j3, long j4, int i, int i2, int i3, double d) {
        this.f154474b = j;
        this.f154475c = j2;
        this.f154476d = j4;
        this.f154480h = -j4;
        this.f154477e = i;
        this.f154478f = d;
        this.f154473a = new bfkf(3, (int) (((long) Math.max(50, i)) * TimeUnit.NANOSECONDS.toSeconds(Math.max(j3, j))), i2, i3);
    }

    /* renamed from: a */
    public final int mo72963a(int i, int i2, int i3, double d) {
        float a = this.f154473a.mo61826a(i, i3);
        double d2 = (double) a;
        double a2 = (double) (this.f154473a.mo61826a(i2, i3) - a);
        Double.isNaN(a2);
        Double.isNaN(d2);
        return (int) ((d2 + (a2 * d)) / this.f154478f);
    }
}
