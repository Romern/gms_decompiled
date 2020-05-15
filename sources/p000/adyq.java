package p000;

/* renamed from: adyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adyq {

    /* renamed from: a */
    public adyr f62924a;

    /* renamed from: b */
    private final int f62925b;

    /* renamed from: c */
    private final int f62926c;

    /* renamed from: d */
    private final float f62927d;

    /* renamed from: e */
    private final float f62928e;

    /* renamed from: f */
    private final adyt f62929f = new adyt();

    /* renamed from: g */
    private final adyo f62930g;

    /* renamed from: h */
    private final adyo f62931h;

    /* renamed from: i */
    private final adys f62932i = new adys();

    /* renamed from: j */
    private final adys f62933j = new adys();

    /* renamed from: k */
    private final float[] f62934k = new float[3];

    /* renamed from: l */
    private adyp f62935l;

    /* renamed from: m */
    private long f62936m = 0;

    /* renamed from: n */
    private long f62937n = 0;

    /* renamed from: o */
    private float f62938o = 0.0f;

    public adyq(long j, long j2, int i, float f, float f2) {
        long j3 = (long) i;
        int i2 = (int) ((j * j3) / 1000);
        this.f62925b = i2;
        this.f62930g = new adyo(i2);
        this.f62931h = new adyo(this.f62925b);
        this.f62928e = f2;
        this.f62926c = (int) ((j2 * j3) / 1000);
        this.f62927d = f;
    }

    /* renamed from: a */
    private static final float m51439a(adys adys) {
        return adys.mo33940b() / ((float) adys.mo33938a());
    }

    /* renamed from: a */
    private static final float m51440a(adys adys, float f) {
        return (float) Math.sqrt((double) ((adys.mo33940b() / ((float) adys.mo33938a())) - (f * f)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public final void mo33941a(long j, float f, float f2, float f3) {
        long j2 = j;
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        adyt adyt = this.f62929f;
        adyt.f62941a.mo33939a(f4);
        adyt.f62942b.mo33939a(f5);
        adyt.f62943c.mo33939a(f6);
        adyt.f62945e = adyt.f62944d;
        adyt.f62945e[0] = adyt.f62941a.mo33940b() / ((float) adyt.f62941a.f62918c);
        adyt.f62945e[1] = adyt.f62942b.mo33940b() / ((float) adyt.f62942b.f62918c);
        adyt.f62945e[2] = adyt.f62943c.mo33940b() / ((float) adyt.f62943c.f62918c);
        float[] fArr = adyt.f62945e;
        float f7 = 0.0f;
        for (float f8 : fArr) {
            f7 += f8 * f8;
        }
        float sqrt = (float) Math.sqrt((double) f7);
        if (((double) sqrt) > 0.0d) {
            float[] fArr2 = adyt.f62945e;
            fArr2[0] = fArr2[0] / sqrt;
            fArr2[1] = fArr2[1] / sqrt;
            fArr2[2] = fArr2[2] / sqrt;
        }
        float[] fArr3 = this.f62929f.f62945e;
        float[] fArr4 = this.f62934k;
        fArr4[0] = f4;
        fArr4[1] = f5;
        fArr4[2] = f6;
        float abs = Math.abs((fArr3[0] * fArr4[0]) + (fArr3[1] * fArr4[1]) + (fArr3[2] * f6));
        adyo adyo = this.f62930g;
        int i = adyo.f62918c;
        int i2 = this.f62926c;
        float f9 = abs * abs;
        adyo.mo33939a(f9);
        this.f62931h.mo33939a(abs);
        float a = m51439a(this.f62931h);
        float a2 = m51440a(this.f62930g, a);
        if (a2 > 1.0f || i <= i2) {
            this.f62932i.mo33939a(f9);
            this.f62933j.mo33939a(abs);
            if (i <= i2) {
                return;
            }
        }
        float a3 = m51439a(this.f62933j);
        float a4 = m51440a(this.f62932i, a3);
        adyo adyo2 = this.f62931h;
        int i3 = this.f62926c;
        int i4 = adyo2.f62918c;
        if (i3 < i4) {
            int i5 = (adyo2.f62917b - 1) - i3;
            if (i5 < 0) {
                i5 += adyo2.f62916a.length;
            }
            float f10 = adyo2.f62916a[i5];
            float min = Math.min(f10, 15.0f);
            adyp adyp = this.f62935l;
            if (adyp == null) {
                this.f62935l = new adyp(j2, min);
            } else {
                adyp.f62921a += ((adyp.f62923c + min) / 2.0f) * ((float) Math.abs(j2 - adyp.f62922b));
                adyp.f62923c = min;
                adyp.f62922b = j2;
            }
            if (f10 >= a && f10 - a > a2 && f10 - a3 > this.f62928e * a4 && a2 > this.f62927d) {
                if (this.f62936m <= 0) {
                    this.f62936m = j2;
                    adyr adyr = this.f62924a;
                    if (adyr != null) {
                        adyr.mo31163m(j2);
                    }
                } else if (((double) (((Math.max(min, this.f62938o) * ((float) Math.abs(j2 - this.f62937n))) - this.f62935l.f62921a) / 1.0E9f)) > 1.5d || Math.abs(j2 - this.f62936m) > 400000000) {
                    this.f62936m = 0;
                }
                this.f62935l.f62921a = 0.0f;
                this.f62937n = j2;
                this.f62938o = min;
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Index ");
        sb.append(i3);
        sb.append(" >= size ");
        sb.append(i4);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
