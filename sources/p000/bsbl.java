package p000;

import java.util.Arrays;

/* renamed from: bsbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsbl {

    /* renamed from: o */
    private static final ThreadLocal f143964o = new bsbi();

    /* renamed from: a */
    public final bsbk f143965a;

    /* renamed from: b */
    public final int f143966b;

    /* renamed from: c */
    public final int f143967c;

    /* renamed from: d */
    public final int f143968d;

    /* renamed from: e */
    public final float f143969e;

    /* renamed from: f */
    public final float f143970f;

    /* renamed from: g */
    public final double f143971g;

    /* renamed from: h */
    public final double f143972h;

    /* renamed from: i */
    public final String f143973i;

    /* renamed from: j */
    public final int f143974j;

    /* renamed from: k */
    public final String f143975k;

    /* renamed from: l */
    public final float f143976l;

    /* renamed from: m */
    public final float f143977m;

    /* renamed from: n */
    public final int f143978n;

    public bsbl(bsbj bsbj) {
        this.f143978n = bsbj.f143955n;
        this.f143966b = bsbj.f143943b;
        this.f143967c = bsbj.f143944c;
        this.f143968d = bsbj.f143945d;
        this.f143969e = bsbj.f143946e;
        this.f143970f = bsbj.f143947f;
        this.f143971g = bsbj.f143950i;
        this.f143972h = bsbj.f143951j;
        this.f143976l = bsbj.f143948g;
        this.f143977m = bsbj.f143949h;
        this.f143965a = bsbj.f143942a;
        this.f143973i = bsbj.f143952k;
        this.f143974j = bsbj.f143953l;
        this.f143975k = bsbj.f143954m;
    }

    /* renamed from: o */
    public static bsbj m115064o() {
        bsbj p = m115065p();
        p.f143942a = bsbk.UNKNOWN;
        p.f143943b = 0;
        p.f143944c = 0;
        p.f143945d = -1;
        p.f143951j = 0.0d;
        p.f143946e = 0.0f;
        p.f143947f = -1.0f;
        p.f143950i = 0.0d;
        p.f143948g = -1.0f;
        p.f143949h = -1.0f;
        p.f143952k = null;
        p.f143953l = Integer.MIN_VALUE;
        p.f143954m = null;
        p.f143955n = 0;
        p.f143956o = true;
        return p;
    }

    /* renamed from: p */
    private static bsbj m115065p() {
        bsbj bsbj = (bsbj) f143964o.get();
        if (!bsbj.f143956o) {
            return bsbj;
        }
        throw new IllegalStateException("There is already a Position builder in progress.");
    }

    /* renamed from: a */
    public final double mo70185a() {
        return ayuo.m84842a(this.f143966b);
    }

    /* renamed from: b */
    public final double mo70187b() {
        return ayuo.m84842a(this.f143967c);
    }

    /* renamed from: c */
    public final double mo70188c() {
        return ayuo.m84847b(this.f143966b);
    }

    /* renamed from: d */
    public final double mo70189d() {
        return ayuo.m84847b(this.f143967c);
    }

    /* renamed from: e */
    public final boolean mo70190e() {
        return this.f143965a == bsbk.GPS || this.f143965a == bsbk.GPS_INJECTED;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bsbl) {
            bsbl bsbl = (bsbl) obj;
            if (this.f143966b == bsbl.f143966b && this.f143967c == bsbl.f143967c && this.f143968d == bsbl.f143968d && bmxi.m108538a(this.f143973i, bsbl.f143973i) && this.f143974j == bsbl.f143974j && bmxi.m108538a(this.f143975k, bsbl.f143975k) && this.f143976l == bsbl.f143976l && this.f143977m == bsbl.f143977m && this.f143969e == bsbl.f143969e && this.f143970f == bsbl.f143970f && this.f143971g == bsbl.f143971g && this.f143972h == bsbl.f143972h && this.f143965a == bsbl.f143965a && this.f143978n == bsbl.f143978n) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo70192f() {
        return this.f143965a == bsbk.WIFI;
    }

    /* renamed from: g */
    public final boolean mo70193g() {
        return this.f143965a == bsbk.CELL || this.f143965a == bsbk.CELL_WITH_NEIGHBORS;
    }

    /* renamed from: h */
    public final boolean mo70194h() {
        return (this.f143978n & 4) != 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f143966b), Integer.valueOf(this.f143967c), Integer.valueOf(this.f143968d), this.f143973i, Integer.valueOf(this.f143974j), this.f143975k, Float.valueOf(this.f143976l), Float.valueOf(this.f143977m), Float.valueOf(this.f143969e), Float.valueOf(this.f143970f), Double.valueOf(this.f143971g), Double.valueOf(this.f143972h), this.f143965a, Integer.valueOf(this.f143978n)});
    }

    /* renamed from: i */
    public final boolean mo70196i() {
        return (this.f143978n & 64) != 0;
    }

    /* renamed from: j */
    public final boolean mo70197j() {
        return (this.f143978n & 2) != 0;
    }

    /* renamed from: k */
    public final boolean mo70198k() {
        return (this.f143978n & 16) != 0;
    }

    /* renamed from: l */
    public final boolean mo70199l() {
        return (this.f143978n & 8) != 0;
    }

    /* renamed from: m */
    public final boolean mo70200m() {
        return (this.f143978n & 128) != 0;
    }

    /* renamed from: n */
    public final bsbj mo70201n() {
        bsbj p = m115065p();
        p.f143956o = true;
        p.f143942a = this.f143965a;
        p.f143943b = this.f143966b;
        p.f143944c = this.f143967c;
        p.f143945d = this.f143968d;
        p.f143946e = this.f143969e;
        p.f143948g = this.f143976l;
        p.f143950i = this.f143971g;
        p.f143951j = this.f143972h;
        p.f143952k = this.f143973i;
        p.f143953l = this.f143974j;
        p.f143954m = this.f143975k;
        p.f143955n = this.f143978n;
        return p;
    }

    public final String toString() {
        int i = this.f143966b;
        int i2 = this.f143967c;
        int i3 = this.f143968d;
        String str = this.f143973i;
        int i4 = this.f143974j;
        String str2 = this.f143975k;
        float f = this.f143976l;
        float f2 = this.f143977m;
        float f3 = this.f143969e;
        float f4 = this.f143970f;
        double d = this.f143971g;
        double d2 = this.f143972h;
        String valueOf = String.valueOf(this.f143965a);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 354 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Position [latE7=");
        sb.append(i);
        sb.append(", lngE7=");
        sb.append(i2);
        sb.append(", accuracyMm=");
        sb.append(i3);
        sb.append(", levelId=");
        sb.append(str);
        sb.append(", levelNumberE3=");
        sb.append(i4);
        sb.append(", floorLabel=");
        sb.append(str2);
        sb.append(", bearingDegrees=");
        sb.append(f);
        sb.append(", bearingAccuracyDegrees=");
        sb.append(f2);
        sb.append(", speedMps=");
        sb.append(f3);
        sb.append(", speedAccuracyMps=");
        sb.append(f4);
        sb.append(", altitudeMeters=");
        sb.append(d);
        sb.append(", verticalAccuracyMeters=");
        sb.append(d2);
        sb.append(", provider=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final double mo70186a(bsbl bsbl) {
        return ayuo.m84843a(this.f143966b, this.f143967c, bsbl.f143966b, bsbl.f143967c);
    }
}
