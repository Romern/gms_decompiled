package p000;

import android.os.SystemClock;

/* renamed from: ssp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssp implements Comparable {

    /* renamed from: a */
    public int f45089a = 0;

    /* renamed from: b */
    public long f45090b;

    /* renamed from: c */
    public int f45091c = 0;

    /* renamed from: d */
    public long[] f45092d;

    /* renamed from: e */
    public long f45093e = Long.MAX_VALUE;

    /* renamed from: f */
    public long f45094f = 0;

    /* renamed from: g */
    private long f45095g = 0;

    /* renamed from: h */
    private final Object f45096h;

    /* renamed from: i */
    private double f45097i = 0.0d;

    public ssp(Object obj) {
        this.f45096h = obj;
        this.f45092d = new long[3];
    }

    /* renamed from: a */
    private static final double m36248a(double d) {
        return Math.max(1000.0d, d);
    }

    /* renamed from: b */
    private static final double m36250b(double d) {
        return 1.0d / m36248a(d);
    }

    /* renamed from: d */
    private final long m36251d() {
        double a = (double) mo26049a();
        double a2 = m36248a((double) mo26050b());
        Double.isNaN(a);
        return (long) (a / a2);
    }

    /* renamed from: c */
    public final void mo26051c() {
        if (this.f45089a > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f45097i = m36249a(elapsedRealtime);
            long j = this.f45090b;
            this.f45090b = elapsedRealtime;
            this.f45095g += elapsedRealtime - j;
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ssp ssp = (ssp) obj;
        if (m36251d() >= ssp.m36251d()) {
            return m36251d() > ssp.m36251d() ? -1 : 0;
        }
        return 1;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("Interval effective/min/max ");
        long j = this.f45093e / 1000;
        long j2 = this.f45094f / 1000;
        double b = (double) mo26050b();
        Double.isNaN(b);
        sb.append(Math.min(Math.max(Math.round(b / 1000.0d), j), j2));
        sb.append('/');
        sb.append(j);
        sb.append('/');
        sb.append(j2);
        sb.append("[s] Duration: ");
        sb.append(mo26049a() / 60000);
        sb.append("[minutes] ");
        sb.append(this.f45096h);
        sb.append(" Num requests: ");
        sb.append(this.f45091c);
        sb.append(" Active: ");
        if (this.f45089a > 0) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        return sb.toString();
    }

    /* renamed from: a */
    private final double m36249a(long j) {
        if (this.f45089a <= 0) {
            return this.f45097i;
        }
        long j2 = j - this.f45090b;
        long j3 = Long.MAX_VALUE;
        for (int i = 0; i < this.f45089a; i++) {
            long j4 = this.f45092d[i];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        if (this.f45095g == 0) {
            return (double) j3;
        }
        double b = m36250b(this.f45097i);
        double d = (double) this.f45095g;
        Double.isNaN(d);
        double d2 = b * d;
        double b2 = m36250b((double) j3);
        double d3 = (double) j2;
        Double.isNaN(d3);
        double d4 = d2 + (b2 * d3);
        double d5 = (double) (this.f45095g + j2);
        Double.isNaN(d5);
        return 1.0d / (d4 / d5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo26050b() {
        return Math.round(m36249a(SystemClock.elapsedRealtime()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo26049a() {
        long j = this.f45095g;
        return this.f45089a > 0 ? j + (SystemClock.elapsedRealtime() - this.f45090b) : j;
    }
}
