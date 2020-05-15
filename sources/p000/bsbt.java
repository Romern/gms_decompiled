package p000;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: bsbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bsbt extends bsbq {

    /* renamed from: b */
    private static final long f144007b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c */
    private static final long f144008c = TimeUnit.MINUTES.toNanos(4);

    /* renamed from: d */
    private static final long f144009d = TimeUnit.SECONDS.toNanos(8);

    /* renamed from: e */
    private static final long f144010e = TimeUnit.MINUTES.toNanos(30);

    /* renamed from: f */
    private final bsct f144011f;

    /* renamed from: g */
    private final bsct f144012g;

    /* renamed from: h */
    private bsbl f144013h = null;

    /* renamed from: i */
    private long f144014i = 0;

    /* renamed from: j */
    private bscs f144015j = bscs.UNKNOWN;

    /* renamed from: k */
    private double f144016k = Double.MAX_VALUE;

    public bsbt(bsct bsct, bsct bsct2) {
        this.f144011f = bsct;
        this.f144012g = bsct2;
        this.f144002a = new bsct[]{bsct, bsct2};
    }

    /* renamed from: a */
    private final double m115131a(long j) {
        double d = 13.0d;
        if (this.f144015j != null && j < this.f144014i + f144008c) {
            bscs bscs = bscs.UNKNOWN;
            int ordinal = this.f144015j.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                d = 1.5d;
            } else if (ordinal == 3) {
                d = 6.0d;
            } else if (ordinal != 4) {
                d = 44.7d;
            }
        }
        long b = this.f144011f.mo70214b();
        if (b < j) {
            return m115132a(j - b, d);
        }
        return 0.0d;
    }

    /* renamed from: a */
    private static double m115132a(long j, double d) {
        double d2 = (double) j;
        double d3 = (double) f144007b;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        if (j > f144010e) {
            d = 300.0d;
        }
        return d * d4;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bsbt.a(long, double):double
     arg types: [long, int]
     candidates:
      bsbt.a(long, int):int
      bsbt.a(long, bscs):void
      bsbt.a(long, java.io.PrintWriter):void
      bsbq.a(long, int):int
      bsbq.a(long, float):void
      bsbq.a(long, bsbl):void
      bsbq.a(long, bscd):void
      bsbq.a(long, bscs):void
      bsbq.a(long, bsde):void
      bsbq.a(long, java.io.PrintWriter):void
      bsct.a(long, int):int
      bsct.a(long, float):void
      bsct.a(long, bsbl):void
      bsct.a(long, bscd):void
      bsct.a(long, bscs):void
      bsct.a(long, bsde):void
      bsct.a(long, java.io.PrintWriter):void
      bsbt.a(long, double):double */
    /* renamed from: e */
    private final boolean m115133e() {
        long b = this.f144012g.mo70214b();
        double a = m115131a(b);
        bsbl a2 = this.f144011f.mo70206a();
        if (a2 == null) {
            return false;
        }
        bsbl a3 = this.f144012g.mo70206a();
        if (a3 != null) {
            long b2 = this.f144011f.mo70214b();
            double a4 = a2.mo70186a(a3);
            if (b2 >= b) {
                this.f144016k = Double.MAX_VALUE;
            }
            double d = this.f144016k;
            if (a4 < d) {
                this.f144016k = a4;
                d = a4;
            }
            if (d <= a) {
                long j = b - b2;
                if (j < Math.max(f144009d, 0L) || m115132a(j, 44.7d) <= a4) {
                    return true;
                }
                return false;
            } else if (d <= 20000.0d || b < b2 || !a2.mo70192f()) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final long mo70214b() {
        return Math.max(this.f144011f.mo70214b(), this.f144012g.mo70214b());
    }

    /* renamed from: c */
    public final void mo70215c() {
        super.mo70215c();
        this.f144013h = null;
        this.f144014i = 0;
        this.f144015j = bscs.UNKNOWN;
        this.f144016k = Double.MAX_VALUE;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public int mo70205a(long j, int i) {
        int a = this.f144011f.mo70205a(j, i);
        if (j - this.f144011f.mo70214b() >= Math.max(f144009d, 0L) || (a & i & 7) == 0 || this.f144011f.mo70206a() == null) {
            return this.f144012g.mo70205a(j, i) | a;
        }
        return a;
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        if (!m115133e()) {
            return this.f144012g.mo70206a();
        }
        bsbl a = this.f144011f.mo70206a();
        if (a == null) {
            return null;
        }
        long b = this.f144012g.mo70214b();
        if (b <= this.f144011f.mo70214b()) {
            return a;
        }
        int a2 = a.f143968d + ((int) (m115131a(b) * 1000.0d));
        bsbl bsbl = this.f144013h;
        if (!(bsbl != null && bsbl.f143966b == a.f143966b && bsbl.f143967c == a.f143967c && bsbl.f143968d == a2)) {
            bsbj n = a.mo70201n();
            n.mo70178a(a.f143966b, a.f143967c, a2);
            n.f143948g = -1.0f;
            int i = n.f143955n & -9;
            n.f143955n = i;
            n.f143946e = 0.0f;
            n.f143955n = i & -5;
            this.f144013h = n.mo70174a();
        }
        return this.f144013h;
    }

    /* renamed from: a */
    public final void mo70211a(long j, bscs bscs) {
        super.mo70211a(j, bscs);
        this.f144014i = j;
        this.f144015j = bscs;
    }

    /* renamed from: a */
    public final void mo70213a(long j, PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("FailOverFusion:");
        long j2 = this.f144014i;
        if (j2 != 0) {
            String valueOf = String.valueOf(this.f144015j);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 50);
            sb2.append("activity{time(ns)=");
            sb2.append(j2);
            sb2.append(", activity=");
            sb2.append(valueOf);
            sb2.append("}");
            sb.append(sb2.toString());
        }
        long b = this.f144011f.mo70214b();
        long b2 = this.f144012g.mo70214b();
        StringBuilder sb3 = new StringBuilder(71);
        sb3.append(" time(ns): {primary=");
        sb3.append(b);
        sb3.append(",failover=");
        sb3.append(b2);
        sb3.append("}");
        sb.append(sb3.toString());
        double d = this.f144016k;
        if (d != Double.MAX_VALUE) {
            StringBuilder sb4 = new StringBuilder(42);
            sb4.append(" failOverDistance:");
            sb4.append(d);
            sb.append(sb4.toString());
        }
        printWriter.println(sb);
        if (m115133e()) {
            this.f144011f.mo70213a(j, printWriter);
        } else {
            this.f144012g.mo70213a(j, printWriter);
        }
    }
}
