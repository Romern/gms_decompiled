package p000;

/* renamed from: bfmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfmx {

    /* renamed from: a */
    public final long f114435a;

    /* renamed from: b */
    public final long f114436b;

    /* renamed from: c */
    public final long f114437c;

    /* renamed from: d */
    public final long f114438d;

    /* renamed from: e */
    public final bgmj f114439e;

    /* renamed from: f */
    public long f114440f;

    /* renamed from: g */
    public long f114441g;

    /* renamed from: h */
    public final boolean f114442h;

    public bfmx(long j, long j2, long j3) {
        this(j, j2, j3, j, false, null);
    }

    /* renamed from: a */
    public final long mo61960a(long j) {
        long j2 = this.f114435a;
        if (j2 != Long.MAX_VALUE) {
            return j + j2;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: b */
    public final long mo61962b(long j) {
        long j2 = this.f114437c;
        if (j2 != Long.MAX_VALUE) {
            return j + j2;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: b */
    public final boolean mo61963b() {
        return this.f114435a < Long.MAX_VALUE;
    }

    /* renamed from: c */
    public final boolean mo61964c() {
        return this.f114437c < Long.MAX_VALUE;
    }

    /* renamed from: d */
    public final boolean mo61965d() {
        return mo61966e() > 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: e */
    public final int mo61966e() {
        long j = this.f114438d;
        long j2 = 0;
        if (j == 0 || j == Long.MAX_VALUE) {
            return 0;
        }
        long j3 = j / this.f114435a;
        if (j3 != 1) {
            j2 = Math.min(j3, 10L);
        }
        return (int) j2;
    }

    public final String toString() {
        long j = this.f114435a;
        long j2 = this.f114437c;
        long j3 = this.f114438d;
        long j4 = this.f114436b;
        StringBuilder sb = new StringBuilder(165);
        sb.append("periodMillis: ");
        sb.append(j);
        sb.append(", lowPowerPeriodMillis: ");
        sb.append(j2);
        sb.append(", batchIntervalMillis: ");
        sb.append(j3);
        sb.append(", originalPeriodMillis: ");
        sb.append(j4);
        return sb.toString();
    }

    public bfmx(long j, long j2, long j3, long j4, boolean z, bgmj bgmj) {
        this.f114435a = j;
        this.f114437c = j2;
        this.f114438d = j3;
        this.f114436b = j4;
        this.f114442h = z;
        this.f114439e = bgmj;
        this.f114441g = Long.MAX_VALUE;
        this.f114440f = Long.MAX_VALUE;
    }

    /* renamed from: a */
    public final boolean mo61961a() {
        return mo61963b() || mo61964c();
    }
}
