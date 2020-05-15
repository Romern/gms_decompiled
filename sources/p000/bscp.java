package p000;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: bscp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bscp extends bsbq {

    /* renamed from: b */
    static final long f144087b = TimeUnit.SECONDS.toNanos(60);

    /* renamed from: c */
    static final long f144088c = TimeUnit.SECONDS.toNanos(60);

    /* renamed from: d */
    static final long f144089d = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: e */
    private static final Long f144090e = Long.MIN_VALUE;

    /* renamed from: f */
    private static final List f144091f = Arrays.asList(bscs.STILL, bscs.ON_FOOT, bscs.UNKNOWN);

    /* renamed from: g */
    private static final long f144092g = f144090e.longValue();

    /* renamed from: h */
    private static final long f144093h = f144090e.longValue();

    /* renamed from: i */
    private static final long f144094i = f144090e.longValue();

    /* renamed from: j */
    private final bsct f144095j;

    /* renamed from: k */
    private final bsct f144096k;

    /* renamed from: l */
    private final boolean f144097l;

    /* renamed from: m */
    private boolean f144098m;

    /* renamed from: n */
    private long f144099n;

    /* renamed from: o */
    private int f144100o;

    /* renamed from: p */
    private long f144101p;

    /* renamed from: q */
    private long f144102q;

    /* renamed from: r */
    private float f144103r;

    /* renamed from: s */
    private final int f144104s;

    /* renamed from: t */
    private bscd f144105t;

    public bscp(bsct bsct, bsct bsct2, boolean z, int i) {
        this.f144095j = bsct;
        this.f144096k = bsct2;
        this.f144097l = z;
        this.f144104s = i;
        this.f144002a = new bsct[]{bsct, bsct2};
        mo70215c();
    }

    /* renamed from: a */
    private final boolean m115233a(long j) {
        long j2 = this.f144101p;
        return j2 != f144093h && j <= j2 + f144089d;
    }

    /* renamed from: e */
    private final bsct m115234e() {
        return (!m115235f() || this.f144095j.mo70206a() == null) ? this.f144096k : this.f144095j;
    }

    /* renamed from: f */
    private final boolean m115235f() {
        boolean z;
        boolean z2;
        if (this.f144096k.mo70206a() == null) {
            return false;
        }
        long b = this.f144096k.mo70214b();
        if (!m115233a(b) && this.f144098m) {
            long j = this.f144099n;
            if (j != f144092g && b - j < f144087b) {
                long j2 = this.f144101p;
                if (j2 == f144093h || b > j2 + f144089d) {
                    z = true;
                    if (this.f144097l || (this.f144103r == Float.MIN_VALUE && this.f144102q == f144094i)) {
                        return z;
                    }
                    float f = this.f144103r;
                    if (f != Float.MIN_VALUE) {
                        long j3 = this.f144102q;
                        if (j3 != f144094i && f <= ((float) this.f144104s) && b - j3 < f144088c) {
                            z2 = true;
                            if (z || !z2) {
                                return false;
                            }
                            return true;
                        }
                    }
                    z2 = false;
                    if (z) {
                    }
                    return false;
                }
            }
        }
        z = false;
        if (this.f144097l) {
        }
        return z;
    }

    /* renamed from: a */
    public final void mo70208a(long j, float f, float f2) {
    }

    /* renamed from: b */
    public final long mo70214b() {
        return m115234e().mo70214b();
    }

    /* renamed from: c */
    public final void mo70215c() {
        this.f144098m = false;
        this.f144100o = 0;
        this.f144099n = f144092g;
        this.f144101p = f144093h;
        this.f144102q = f144094i;
        this.f144103r = Float.MIN_VALUE;
        this.f144105t = null;
        this.f144095j.mo70215c();
        this.f144096k.mo70215c();
        super.mo70215c();
    }

    /* renamed from: a */
    public int mo70205a(long j, int i) {
        int i2;
        if (m115235f()) {
            i2 = m115234e().mo70205a(j, i) | this.f144095j.mo70205a(j, i);
        } else {
            i2 = this.f144096k.mo70205a(j, i);
        }
        return !m115233a(j) ? i2 | 16 : i2;
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        return m115234e().mo70206a();
    }

    /* renamed from: a */
    public final void mo70209a(long j, bsbl bsbl) {
        if (bsbl.mo70190e() && bsbl.mo70194h() && bsbl.f143969e > 5.0f) {
            this.f144101p = j;
        }
        super.mo70209a(j, bsbl);
    }

    /* renamed from: a */
    public final void mo70210a(long j, bscd bscd) {
        if (this.f144097l) {
            int i = bscd.f144034a;
            if (i == 0 || bscd.f144036c.length == 0) {
                int i2 = this.f144100o + 1;
                this.f144100o = i2;
                if (i2 <= 3) {
                    return;
                }
            } else {
                this.f144100o = 0;
            }
            this.f144102q = j;
            this.f144105t = bscd;
            float f = 0.0f;
            if (i >= 5) {
                float[] fArr = bscd.f144036c;
                if (fArr.length >= 5) {
                    f = fArr[4];
                }
            }
            float f2 = this.f144103r;
            if (f2 != Float.MIN_VALUE) {
                f = (f * 0.050000012f) + (f2 * 0.95f);
            }
            this.f144103r = f;
            super.mo70210a(j, bscd);
        }
    }

    /* renamed from: a */
    public final void mo70211a(long j, bscs bscs) {
        super.mo70211a(j, bscs);
        this.f144098m = f144091f.contains(bscs);
        this.f144099n = j;
    }

    /* renamed from: a */
    public final void mo70213a(long j, PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("PedestrianSwitchingFusion:");
        long j2 = this.f144099n;
        if (j2 != f144092g) {
            boolean z = this.f144098m;
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append(" activity{time(ns)=");
            sb2.append(j2);
            sb2.append(", activity=");
            sb2.append(z);
            sb2.append("}");
            sb.append(sb2.toString());
        }
        long j3 = this.f144101p;
        if (j3 != f144093h) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append(" lastHighSpeedTime(ns)=");
            sb3.append(j3);
            sb.append(sb3.toString());
        }
        if (this.f144102q != f144094i) {
            bscd bscd = this.f144105t;
            String bscd2 = bscd != null ? bscd.toString() : "null";
            long j4 = this.f144102q;
            String format = String.format(Locale.US, "%.1f", Float.valueOf(this.f144103r));
            StringBuilder sb4 = new StringBuilder(String.valueOf(format).length() + 66 + String.valueOf(bscd2).length());
            sb4.append(" snr{time(ns)=");
            sb4.append(j4);
            sb4.append(", filteredSnr=");
            sb4.append(format);
            sb4.append(", lastGpsStatus=");
            sb4.append(bscd2);
            sb4.append("} ");
            sb.append(sb4.toString());
        }
        boolean f = m115235f();
        StringBuilder sb5 = new StringBuilder(23);
        sb5.append(" pedestrianFusion:");
        sb5.append(f);
        sb.append(sb5.toString());
        printWriter.println(sb);
        m115234e().mo70213a(j, printWriter);
    }
}
