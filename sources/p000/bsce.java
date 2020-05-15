package p000;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: bsce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsce implements bsct {

    /* renamed from: a */
    static final long f144037a = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: b */
    private final double f144038b;

    /* renamed from: c */
    private long f144039c;

    /* renamed from: d */
    private bsbl f144040d;

    /* renamed from: e */
    private long f144041e;

    /* renamed from: f */
    private bsbl f144042f;

    public bsce(int i, int i2) {
        this.f144038b = Math.sqrt((double) (((float) i2) / ((float) i)));
        mo70215c();
    }

    /* renamed from: e */
    private final boolean m115168e() {
        long j = this.f144039c;
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j2 = this.f144041e;
        return (j2 == Long.MIN_VALUE || this.f144040d == null || this.f144042f == null || Math.abs(j - j2) >= f144037a || this.f144040d.mo70186a(this.f144042f) >= 1000.0d || ((float) this.f144042f.f143968d) == 0.0f || ((float) this.f144040d.f143968d) == 0.0f) ? false : true;
    }

    /* renamed from: a */
    public final int mo70205a(long j, int i) {
        return 38;
    }

    /* renamed from: a */
    public final void mo70207a(long j, float f) {
    }

    /* renamed from: a */
    public final void mo70208a(long j, float f, float f2) {
    }

    /* renamed from: a */
    public final void mo70210a(long j, bscd bscd) {
    }

    /* renamed from: a */
    public final void mo70211a(long j, bscs bscs) {
    }

    /* renamed from: a */
    public final void mo70212a(long j, bsde bsde) {
    }

    /* renamed from: b */
    public final long mo70214b() {
        return Math.max(this.f144039c, this.f144041e);
    }

    /* renamed from: c */
    public final void mo70215c() {
        this.f144039c = Long.MIN_VALUE;
        this.f144040d = null;
        this.f144041e = Long.MIN_VALUE;
        this.f144042f = null;
    }

    /* renamed from: d */
    public final void mo70216d() {
        mo70215c();
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        long j;
        bsbj bsbj;
        if (!m115168e()) {
            return null;
        }
        bsbl bsbl = this.f144042f;
        int i = bsbl.f143968d;
        bsbl bsbl2 = this.f144040d;
        int i2 = bsbl2.f143968d;
        if (((float) i) / ((float) i2) > 2.0f) {
            return bsbl2;
        }
        double d = (double) i2;
        double d2 = this.f144038b;
        Double.isNaN(d);
        double d3 = d2 * d;
        double d4 = (double) i;
        Double.isNaN(d4);
        Double.isNaN(d4);
        double d5 = 1.0d / ((((d4 * d4) / d3) / d3) + 1.0d);
        if (bsbl2 == null || bsbl == null) {
            return null;
        }
        Double.isNaN(d4);
        Double.isNaN(d4);
        Double.isNaN(d);
        Double.isNaN(d);
        int round = (int) Math.round(Math.sqrt((d5 * d4 * d4) + ((1.0d - d5) * d * d)));
        bsbk bsbk = d5 <= 0.5d ? bsbk.GPS : bsbk.WIFI;
        double a = ayuo.m84843a(bsbl2.f143966b, bsbl2.f143967c, bsbl.f143966b, bsbl.f143967c);
        double b = ayuo.m84848b(bsbl2.f143966b, bsbl2.f143967c, bsbl.f143966b, bsbl.f143967c);
        int i3 = bsbl2.f143966b;
        int i4 = bsbl2.f143967c;
        int max = Math.max(-900000000, Math.min(900000000, i3));
        if (i4 < -1800000000) {
            i4 -= 694967296;
        } else if (i4 >= 1800000000) {
            i4 += 694967296;
        }
        long a2 = ayun.m84837a(max, i4);
        double d6 = a * d5;
        double a3 = ayuo.m84842a(ayun.m84835a(a2));
        double a4 = ayuo.m84842a((int) a2);
        double d7 = d6 / 6367000.0d;
        double sin = Math.sin(b);
        double cos = Math.cos(b);
        if (d6 < (1.5707963267948966d - Math.abs(a3)) * 140.0d) {
            double d8 = (cos * d7) + a3;
            j = ayun.m84836a(d8, a4 + ((sin * d7) / Math.cos((a3 + d8) / 2.0d)));
        } else {
            double sin2 = Math.sin(a3);
            double cos2 = Math.cos(a3);
            double sin3 = Math.sin(d7);
            double cos3 = Math.cos(d7);
            double d9 = cos2 * sin3;
            double asin = Math.asin((sin2 * cos3) + (cos * d9));
            j = ayun.m84836a(asin, a4 + Math.atan2(d9 * sin, cos3 - (sin2 * Math.sin(asin))));
        }
        if (bsbk.equals(bsbk.WIFI)) {
            bsbj = bsbl.mo70201n();
            bsbj.mo70176a(ayun.m84838b(j), ayun.m84839c(j), round);
            if (bsbl2.mo70199l()) {
                bsbj.mo70182b(bsbl2.f143976l);
            }
            if (bsbl2.mo70194h()) {
                bsbj.mo70184d(bsbl2.f143969e);
            }
        } else {
            bsbj n = bsbl2.mo70201n();
            n.mo70176a(ayun.m84838b(j), ayun.m84839c(j), round);
            if (bsbl.mo70197j() && bsbl.mo70198k()) {
                n.mo70175a(bsbl.f143971g);
                n.mo70181b(bsbl.f143972h);
            }
            bsbj = n;
        }
        return bsbj.mo70174a();
    }

    /* renamed from: a */
    public final void mo70209a(long j, bsbl bsbl) {
        if ((bsbl.f143978n & 1) == 0) {
            return;
        }
        if (bsbl.mo70190e()) {
            this.f144040d = bsbl;
            this.f144039c = j;
        } else if (bsbl.mo70192f()) {
            this.f144042f = bsbl;
            this.f144041e = j;
        }
    }

    /* renamed from: a */
    public final void mo70213a(long j, PrintWriter printWriter) {
        bsbl bsbl;
        bsbl bsbl2;
        StringBuilder sb = new StringBuilder();
        sb.append("GpsWifiFusion:");
        long j2 = this.f144039c;
        if (!(j2 == Long.MIN_VALUE || (bsbl2 = this.f144040d) == null)) {
            int i = bsbl2.f143968d;
            StringBuilder sb2 = new StringBuilder(68);
            sb2.append(" GpsAccuray{time(ns)=");
            sb2.append(j2);
            sb2.append(", accuracy(mm)=");
            sb2.append(i);
            sb2.append("}");
            sb.append(sb2.toString());
        }
        long j3 = this.f144041e;
        if (!(j3 == Long.MIN_VALUE || (bsbl = this.f144042f) == null)) {
            int i2 = bsbl.f143968d;
            StringBuilder sb3 = new StringBuilder(70);
            sb3.append(" WifiAccuracy{time(ns)=");
            sb3.append(j3);
            sb3.append(", accuracy(mm)=");
            sb3.append(i2);
            sb3.append("}");
            sb.append(sb3.toString());
        }
        boolean e = m115168e();
        StringBuilder sb4 = new StringBuilder(20);
        sb4.append(" Fusion active=");
        sb4.append(e);
        sb.append(sb4.toString());
        printWriter.println(sb);
    }
}
