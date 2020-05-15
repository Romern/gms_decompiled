package p000;

import android.location.GnssClock;
import android.location.GnssMeasurement;
import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.CellLocation;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: bffj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bffj implements bfgn {

    /* renamed from: A */
    private int f113642A = -1;

    /* renamed from: B */
    private float f113643B = Float.MAX_VALUE;

    /* renamed from: C */
    private float f113644C = Float.MAX_VALUE;

    /* renamed from: D */
    private float f113645D = Float.MAX_VALUE;

    /* renamed from: E */
    private long f113646E = Long.MAX_VALUE;

    /* renamed from: F */
    private long f113647F = Long.MAX_VALUE;

    /* renamed from: G */
    private long f113648G = Long.MAX_VALUE;

    /* renamed from: H */
    private long f113649H = 0;

    /* renamed from: I */
    private final bffk f113650I;

    /* renamed from: J */
    private final bffi f113651J;

    /* renamed from: K */
    private final bsax f113652K;

    /* renamed from: a */
    public final bgmk f113653a;

    /* renamed from: b */
    public bsax f113654b;

    /* renamed from: c */
    public bsax f113655c;

    /* renamed from: d */
    public bsax f113656d;

    /* renamed from: e */
    private final String f113657e;

    /* renamed from: f */
    private final String f113658f;

    /* renamed from: g */
    private final String f113659g;

    /* renamed from: h */
    private final Integer f113660h;

    /* renamed from: i */
    private boolean f113661i = false;

    /* renamed from: j */
    private long f113662j = 0;

    /* renamed from: k */
    private int f113663k = 1;

    /* renamed from: l */
    private boolean f113664l = false;

    /* renamed from: m */
    private final long f113665m;

    /* renamed from: n */
    private final bfgq f113666n;

    /* renamed from: o */
    private bsax f113667o;

    /* renamed from: p */
    private bsax f113668p = null;

    /* renamed from: q */
    private final bffl f113669q;

    /* renamed from: r */
    private final bffl f113670r;

    /* renamed from: s */
    private final bffl f113671s;

    /* renamed from: t */
    private final bffl f113672t;

    /* renamed from: u */
    private final bffl f113673u;

    /* renamed from: v */
    private final bffl f113674v;

    /* renamed from: w */
    private final bffl f113675w;

    /* renamed from: x */
    private final bffl f113676x;

    /* renamed from: y */
    private final bffl f113677y;

    /* renamed from: z */
    private int f113678z = -1;

    public bffj(bfgq bfgq, String str, String str2, Integer num, bsax bsax, bgmk bgmk) {
        bsax bsax2 = bsax;
        this.f113666n = bfgq;
        int i = bfib.f113998b;
        this.f113657e = str;
        this.f113658f = bfib.m96842b(str);
        this.f113659g = str2;
        this.f113660h = num;
        this.f113653a = bgmk;
        this.f113650I = new bffk();
        this.f113651J = new bffi(this);
        if (bsax2 != null) {
            bsaz bsaz = bgox.f117035ab;
            if (!bmxi.m108538a(bsax2.f143914b, bsaz)) {
                String valueOf = String.valueOf(bsaz);
                String valueOf2 = String.valueOf(bsax2.f143914b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
                sb.append("Wrong protocol buffer type. Expected ");
                sb.append(valueOf);
                sb.append(" but was ");
                sb.append(valueOf2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f113652K = bsax2;
        this.f113669q = new bffl(this.f113650I, bgox.f117061bA, 8, 2, 4, 7, 8, 9, 10);
        this.f113670r = new bffl(this.f113650I, bgox.f117062bB, 8, 3, 4, 7, 8, 9, 10);
        this.f113671s = new bffl(this.f113650I, bgox.f117063bC, 8, 4, 4, 7, 8, 9, 10);
        this.f113672t = new bffl(this.f113650I, bgox.f117066bF, 4, 11, 2, 3, 4, 5, 6);
        this.f113673u = new bffl(this.f113650I, bgox.f117067bG, 4, 13, 2, 3, 4, 5, 6);
        this.f113674v = new bffl(this.f113650I, bgox.f117068bH, 4, 14, 2, 3, 4, 5, 6);
        this.f113675w = new bffl(this.f113650I, bgox.f117069bI, 4, 16, 2, 3, 4, 5, 6);
        this.f113676x = new bffl(this.f113650I, bgox.f117070bJ, 4, 23, 5, 6, 7, 8, 9);
        this.f113677y = new bffl(this.f113650I, bgox.f117071bK, 4, 17, 2, 3, 4, 5, 6);
        m96565e();
        m96566f();
        this.f113665m = System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    private static final int m96561a(long j, long j2) {
        return (int) ((j2 - j) / 1000);
    }

    /* renamed from: b */
    private static final int m96563b(long j, long j2) {
        return (int) ((j2 - j) % 1000);
    }

    /* renamed from: d */
    private final synchronized void m96564d() {
        bfew bfew;
        boolean a = this.f113651J.mo61577a();
        boolean z = false;
        if (cfaj.m138529c() && bmyx.m108643a(",").mo66925c((CharSequence) cfaj.f183544a.mo6606a().sensorCollectionSizeLimitedPackages()).contains(this.f113657e) && this.f113649H + this.f113651J.f113637a > cfaj.f183544a.mo6606a().maxSensorTraceSizeBytes()) {
            bfgq bfgq = this.f113666n;
            if (bfgq == null || (bfew = bfgq.f113796h) == null) {
                a = true;
                z = true;
            } else {
                bfew.mo61504j();
                a = true;
                z = true;
            }
        }
        if (a) {
            this.f113649H += this.f113651J.f113637a;
            mo61600b();
            m96566f();
            m96562a(z);
            m96565e();
        }
    }

    /* renamed from: e */
    private final synchronized void m96565e() {
        this.f113651J.mo61578b();
        this.f113654b = new bsax(bgox.f117045al);
        bsax bsax = new bsax(bgox.f117038ae);
        this.f113667o = bsax;
        bsax.mo70118b(2, bfgd.f113742a);
        this.f113667o.mo70118b(5, Locale.getDefault().toString());
        this.f113667o.mo70118b(1, "1.0");
        this.f113667o.mo70118b(11, TimeZone.getDefault().getID());
        bsax bsax2 = this.f113652K;
        if (bsax2 != null) {
            this.f113667o.mo70118b(10, bsax2);
        }
        this.f113654b.mo70118b(1, this.f113667o);
        bsax bsax3 = new bsax(bgox.f117039af);
        bsax3.mo70118b(1, this.f113658f);
        if (!bfib.m96840a(this.f113659g)) {
            bsax bsax4 = new bsax(bgox.f117040ag);
            bsax4.mo70118b(1, this.f113659g);
            this.f113654b.mo70118b(3, bsax4);
        }
        this.f113654b.mo70107a(2, bsax3);
    }

    /* renamed from: f */
    private final synchronized void m96566f() {
        this.f113655c = new bsax(bgox.f117041ah);
        this.f113656d = new bsax(bgox.f117112bz);
        this.f113670r.mo61617a();
        this.f113669q.mo61617a();
        this.f113671s.mo61617a();
        this.f113672t.mo61617a();
        this.f113673u.mo61617a();
        this.f113674v.mo61617a();
        this.f113675w.mo61617a();
        this.f113676x.mo61617a();
        this.f113677y.mo61617a();
        this.f113646E = Long.MAX_VALUE;
        this.f113647F = Long.MAX_VALUE;
        if (this.f113660h != null && !this.f113661i) {
            this.f113661i = true;
            bsax bsax = new bsax(bgox.f117001U);
            bsax.mo70134g(1, this.f113660h.intValue());
            this.f113655c.mo70118b(99, bsax);
        }
    }

    /* renamed from: g */
    private final synchronized long m96567g() {
        long b = this.f113665m + this.f113650I.mo61612b();
        if (b > this.f113662j) {
            return b;
        }
        Locale locale = Locale.US;
        Object[] objArr = {Long.valueOf(b), Long.valueOf(b + 1)};
        return this.f113662j + 1;
    }

    /* renamed from: c */
    public final synchronized long mo61603c() {
        return this.f113650I.mo61609a();
    }

    /* renamed from: a */
    private final synchronized void m96562a(boolean z) {
        this.f113662j = m96567g();
        bsax bsax = new bsax(bgox.f117044ak);
        bsax.mo70117b(1, this.f113662j);
        bsax.mo70117b(4, this.f113650I.mo61614c() + this.f113665m);
        if (z) {
            bsax.mo70134g(3, 0);
            this.f113649H = 0;
        } else {
            bsax.mo70134g(3, this.f113663k);
            this.f113663k++;
        }
        bfgq bfgq = this.f113666n;
        if (bfgq != null) {
            bfgq.mo61668b(this.f113654b, bsax);
            if (z) {
                this.f113666n.mo61669c();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo61600b() {
        if (this.f113656d.mo70138j(2) > 0 || this.f113656d.mo70138j(3) > 0 || this.f113656d.mo70138j(4) > 0 || this.f113656d.mo70138j(5) > 0 || this.f113656d.mo70138j(6) > 0 || this.f113656d.mo70138j(7) > 0 || this.f113656d.mo70138j(8) > 0 || this.f113656d.mo70138j(10) > 0 || this.f113656d.mo70138j(16) > 0 || this.f113656d.mo70138j(23) > 0 || this.f113656d.mo70138j(11) > 0 || this.f113656d.mo70138j(13) > 0 || this.f113656d.mo70138j(14) > 0 || this.f113656d.mo70138j(15) > 0 || this.f113656d.mo70138j(17) > 0 || this.f113656d.mo70138j(12) > 0 || this.f113656d.mo70138j(18) > 0 || this.f113656d.mo70138j(20) > 0 || this.f113656d.mo70138j(19) > 0 || this.f113656d.mo70138j(24) > 0) {
            this.f113655c.mo70118b(9, this.f113656d);
        }
        if (this.f113655c.mo70122c() != 0) {
            this.f113654b.mo70107a(4, this.f113655c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if (r1.f113678z != r0) goto L_0x00a4;
     */
    /* renamed from: c */
    public final synchronized void mo61604c(float f, float f2, float f3, int i, long j, long j2) {
        int i2;
        int i3;
        int i4 = i;
        long j3 = j;
        long j4 = j2;
        synchronized (this) {
            if (!this.f113664l) {
                this.f113650I.mo61610a(j4);
                this.f113650I.mo61611a(j3, j4);
                bsax bsax = new bsax(bgox.f117064bD, 9);
                if (this.f113648G == Long.MAX_VALUE) {
                    this.f113648G = this.f113650I.mo61615c(j3, j4);
                }
                if (!this.f113656d.mo70137i(1)) {
                    this.f113656d.mo70117b(1, this.f113650I.mo61613b(j3, this.f113648G));
                }
                if (!this.f113656d.mo70137i(5)) {
                    bsax.mo70117b(10, j3);
                    bsax.mo70117b(11, j4 * 1000000);
                }
                long j5 = this.f113646E;
                if (j5 == Long.MAX_VALUE) {
                    long c = this.f113656d.mo70124c(1);
                    long b = this.f113650I.mo61613b(j3, this.f113648G);
                    i2 = m96561a(c, b);
                    i3 = m96563b(c, b);
                } else {
                    i2 = m96561a(j5, j3);
                    i3 = m96563b(this.f113646E, j3);
                }
                if (i2 != 0) {
                    bsax.mo70134g(8, i2);
                }
                if (i3 != 0) {
                    bsax.mo70134g(9, i3);
                }
                this.f113646E = j3;
                if (this.f113656d.mo70138j(5) == 0) {
                }
                bsax.mo70134g(4, i4);
                this.f113678z = i4;
                bsax.mo70116b(1, f);
                bsax.mo70116b(2, f2);
                bsax.mo70116b(3, f3);
                this.f113656d.mo70107a(5, bsax);
                m96564d();
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo61601b(float f, float f2, float f3, int i, long j, long j2) {
        synchronized (this) {
            if (!this.f113664l) {
                bsax a = this.f113670r.mo61616a(this.f113656d, i, j, j2);
                a.mo70116b(1, f);
                a.mo70116b(2, f2);
                a.mo70116b(3, f3);
                this.f113656d.mo70107a(3, a);
                m96564d();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo61579a() {
        if (!this.f113664l) {
            this.f113664l = true;
            mo61600b();
            m96562a(true);
            this.f113654b = null;
            this.f113655c = null;
            this.f113656d = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo61580a(float f, float f2, float f3, float f4) {
        bsax bsax = new bsax(bgox.f117064bD);
        bsax.mo70116b(1, f);
        bsax.mo70116b(2, f2);
        bsax.mo70116b(3, f3);
        bsax.mo70116b(7, f4);
        this.f113656d.mo70118b(9, bsax);
        m96564d();
    }

    /* renamed from: b */
    public final synchronized void mo61602b(float f, int i, long j, long j2) {
        if (!this.f113664l) {
            bsax a = this.f113673u.mo61616a(this.f113656d, i, j, j2);
            a.mo70116b(1, f);
            this.f113656d.mo70107a(13, a);
            m96564d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b1, code lost:
        if (r1.f113642A != r4) goto L_0x00b3;
     */
    /* renamed from: a */
    public final synchronized void mo61581a(float f, float f2, float f3, float f4, float f5, float f6, int i, long j, long j2) {
        int i2;
        int i3;
        float f7 = f4;
        float f8 = f5;
        float f9 = f6;
        int i4 = i;
        long j3 = j;
        long j4 = j2;
        synchronized (this) {
            if (!this.f113664l) {
                this.f113650I.mo61610a(j4);
                this.f113650I.mo61611a(j3, j4);
                bsax bsax = new bsax(bgox.f117064bD, 9);
                if (this.f113648G == Long.MAX_VALUE) {
                    this.f113648G = this.f113650I.mo61615c(j3, j4);
                }
                if (!this.f113656d.mo70137i(1)) {
                    this.f113656d.mo70117b(1, this.f113650I.mo61613b(j3, this.f113648G));
                }
                if (!this.f113656d.mo70137i(5)) {
                    bsax.mo70117b(10, j3);
                    bsax.mo70117b(11, j4 * 1000000);
                }
                long j5 = this.f113647F;
                if (j5 == Long.MAX_VALUE) {
                    long c = this.f113656d.mo70124c(1);
                    long b = this.f113650I.mo61613b(j3, this.f113648G);
                    i2 = m96561a(c, b);
                    i3 = m96563b(c, b);
                } else {
                    i2 = m96561a(j5, j3);
                    i3 = m96563b(this.f113647F, j3);
                }
                if (i2 != 0) {
                    bsax.mo70134g(8, i2);
                }
                if (i3 != 0) {
                    bsax.mo70134g(9, i3);
                }
                this.f113647F = j3;
                if (this.f113656d.mo70138j(12) == 0) {
                }
                bsax.mo70134g(4, i4);
                this.f113642A = i4;
                bsax.mo70116b(1, f);
                bsax.mo70116b(2, f2);
                bsax.mo70116b(3, f3);
                bsax bsax2 = new bsax(bgox.f117065bE, 4);
                bsax2.mo70118b(1, bsax);
                if (this.f113656d.mo70138j(12) == 0 || Math.abs(f7 - this.f113643B) > 1.0E-6f || Math.abs(f8 - this.f113644C) > 1.0E-6f || Math.abs(f9 - this.f113645D) > 1.0E-6f) {
                    bsax2.mo70116b(2, f7);
                    bsax2.mo70116b(3, f8);
                    bsax2.mo70116b(4, f9);
                    this.f113643B = f7;
                    this.f113644C = f8;
                    this.f113645D = f9;
                }
                this.f113656d.mo70107a(12, bsax2);
                m96564d();
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo61606d(float f, float f2, float f3, int i, long j, long j2) {
        synchronized (this) {
            if (!this.f113664l) {
                bsax a = this.f113671s.mo61616a(this.f113656d, i, j, j2);
                a.mo70116b(1, f);
                a.mo70116b(2, f2);
                a.mo70116b(3, f3);
                this.f113656d.mo70107a(4, a);
                m96564d();
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo61607d(float f, int i, long j, long j2) {
        if (!this.f113664l) {
            bsax a = this.f113675w.mo61616a(this.f113656d, i, j, j2);
            a.mo70116b(1, f);
            this.f113656d.mo70107a(16, a);
            m96564d();
        }
    }

    /* renamed from: e */
    public final synchronized void mo61608e(float f, int i, long j, long j2) {
        if (!this.f113664l) {
            bsax a = this.f113677y.mo61616a(this.f113656d, i, j, j2);
            a.mo70116b(1, f);
            this.f113656d.mo70107a(17, a);
            m96564d();
        }
    }

    /* renamed from: c */
    public final synchronized void mo61605c(float f, int i, long j, long j2) {
        if (!this.f113664l) {
            bsax a = this.f113674v.mo61616a(this.f113656d, i, j, j2);
            a.mo70116b(1, f);
            this.f113656d.mo70107a(14, a);
            m96564d();
        }
    }

    /* renamed from: a */
    public final synchronized void mo61582a(float f, float f2, float f3, float f4, int i, long j, long j2) {
        synchronized (this) {
            if (!this.f113664l) {
                bsax a = this.f113676x.mo61616a(this.f113656d, i, j, j2);
                a.mo70116b(1, f);
                a.mo70116b(2, f2);
                a.mo70116b(3, f3);
                a.mo70116b(4, f4);
                this.f113656d.mo70107a(23, a);
                m96564d();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo61583a(float f, float f2, float f3, int i, long j, long j2) {
        synchronized (this) {
            if (!this.f113664l) {
                bsax a = this.f113669q.mo61616a(this.f113656d, i, j, j2);
                a.mo70116b(1, f);
                a.mo70116b(3, f2);
                a.mo70116b(2, f3);
                this.f113656d.mo70107a(2, a);
                m96564d();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo61584a(float f, int i, long j, long j2) {
        if (!this.f113664l) {
            bsax a = this.f113672t.mo61616a(this.f113656d, i, j, j2);
            a.mo70116b(1, f);
            this.f113656d.mo70107a(11, a);
            m96564d();
        }
    }

    /* renamed from: a */
    public final void mo61585a(int i, int i2) {
        if (this.f113667o.mo70135h(12)) {
            this.f113668p = this.f113667o.mo70129e(12);
        } else {
            bsax bsax = new bsax(bgox.f117036ac);
            this.f113668p = bsax;
            this.f113667o.mo70118b(12, bsax);
        }
        this.f113668p.mo70134g(3, i);
        this.f113668p.mo70134g(4, i2);
    }

    /* renamed from: a */
    public final void mo61586a(int i, int i2, int i3) {
        boolean z;
        if (i < 0 || i > 9) {
            z = false;
        } else {
            z = true;
        }
        bmxy.m108589a(z, String.format(Locale.US, "Audio source: %d is not valid.", Integer.valueOf(i)));
        if (this.f113667o.mo70135h(12)) {
            this.f113668p = this.f113667o.mo70129e(12);
        } else {
            bsax bsax = new bsax(bgox.f117036ac);
            this.f113668p = bsax;
            this.f113667o.mo70118b(12, bsax);
        }
        this.f113668p.mo70134g(1, i);
        this.f113668p.mo70134g(2, i2);
        this.f113668p.mo70134g(5, i3);
    }

    /* renamed from: a */
    public final void mo61587a(int i, int i2, long j) {
        if (!this.f113664l) {
            this.f113650I.mo61610a(j);
            bsax bsax = new bsax(bgox.f117077bQ);
            bsax.mo70134g(3, (int) (j - mo61603c()));
            bsax.mo70134g(1, i);
            bsax.mo70134g(2, i2);
            this.f113656d.mo70107a(21, bsax);
            m96564d();
        }
    }

    /* renamed from: a */
    public final void mo61588a(int i, long j) {
        if (!this.f113664l) {
            this.f113650I.mo61610a(j);
            bsax bsax = new bsax(bgox.f117075bO, 2);
            bsax.mo70134g(1, i);
            bsax.mo70134g(2, (int) (j - mo61603c()));
            this.f113656d.mo70107a(18, bsax);
            m96564d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* renamed from: a */
    public final synchronized void mo61589a(int i, String str, CellLocation cellLocation, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!this.f113664l) {
            this.f113650I.mo61610a(j);
            int i7 = 3;
            if (str == null) {
                i3 = -1;
                i4 = -1;
            } else if (str.length() > 3) {
                i4 = Integer.parseInt(str.substring(0, 3));
                i3 = Integer.parseInt(str.substring(3));
            } else {
                i3 = -1;
                i4 = -1;
            }
            if (cellLocation == null) {
                i5 = -1;
                i6 = -1;
            } else if (cellLocation instanceof GsmCellLocation) {
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                i6 = gsmCellLocation.getLac();
                i5 = gsmCellLocation.getCid();
            } else if (cellLocation instanceof CdmaCellLocation) {
                CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                i3 = cdmaCellLocation.getSystemId();
                i6 = cdmaCellLocation.getNetworkId();
                i5 = cdmaCellLocation.getBaseStationId();
            } else {
                i5 = -1;
                i6 = -1;
            }
            bsax bsax = new bsax(bgox.f116997Q);
            bsax bsax2 = new bsax(bgox.f116996P);
            bsax2.mo70134g(1, i6);
            bsax2.mo70134g(2, i5);
            bsax2.mo70134g(3, i3);
            bsax2.mo70134g(4, i4);
            bsax2.mo70134g(5, i2);
            if (i != 12) {
                if (i != 15) {
                    switch (i) {
                        case 1:
                        case 2:
                            break;
                        case 3:
                        case 8:
                        case 9:
                        case 10:
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            break;
                        default:
                            i7 = -1;
                            break;
                    }
                    if (i7 >= 0) {
                        bsax2.mo70134g(10, i7);
                    }
                    bsax.mo70118b(1, bsax2);
                    bsax.mo70117b(2, j - mo61603c());
                    this.f113656d.mo70107a(6, bsax);
                    m96564d();
                }
                i7 = 5;
                if (i7 >= 0) {
                }
                bsax.mo70118b(1, bsax2);
                bsax.mo70117b(2, j - mo61603c());
                this.f113656d.mo70107a(6, bsax);
                m96564d();
            }
            i7 = 4;
            if (i7 >= 0) {
            }
            bsax.mo70118b(1, bsax2);
            bsax.mo70117b(2, j - mo61603c());
            this.f113656d.mo70107a(6, bsax);
            m96564d();
        }
    }

    /* renamed from: a */
    public final void mo61590a(int i, long[] jArr, float[][] fArr) {
        throw new UnsupportedOperationException("addAllSensorSnapshot() cannot be called from GLocRequestComposer.");
    }

    /* renamed from: a */
    public final synchronized void mo61591a(GnssMeasurementsEvent gnssMeasurementsEvent, long j) {
        Iterator<GnssMeasurement> it;
        long j2 = j;
        synchronized (this) {
            if (!this.f113664l && gnssMeasurementsEvent != null) {
                this.f113650I.mo61610a(j2);
                int i = Build.VERSION.SDK_INT;
                bsax bsax = new bsax(bgox.f117109bw);
                GnssClock clock = gnssMeasurementsEvent.getClock();
                bsax bsax2 = new bsax(bgox.f117107bu);
                int i2 = 1;
                if (clock.hasLeapSecond()) {
                    bsax2.mo70134g(1, clock.getLeapSecond());
                }
                int i3 = 2;
                bsax2.mo70117b(2, clock.getTimeNanos());
                if (clock.hasTimeUncertaintyNanos()) {
                    bsax2.mo70115b(10, clock.getTimeUncertaintyNanos());
                }
                int i4 = 4;
                if (clock.hasFullBiasNanos()) {
                    bsax2.mo70117b(4, clock.getFullBiasNanos());
                }
                if (clock.hasBiasNanos()) {
                    bsax2.mo70115b(5, clock.getBiasNanos());
                }
                if (clock.hasBiasUncertaintyNanos()) {
                    bsax2.mo70115b(6, clock.getBiasUncertaintyNanos());
                }
                if (clock.hasDriftNanosPerSecond()) {
                    bsax2.mo70115b(7, clock.getDriftNanosPerSecond());
                }
                if (clock.hasDriftUncertaintyNanosPerSecond()) {
                    bsax2.mo70115b(8, clock.getDriftUncertaintyNanosPerSecond());
                }
                double hardwareClockDiscontinuityCount = (double) clock.getHardwareClockDiscontinuityCount();
                int i5 = 9;
                bsax2.mo70115b(9, hardwareClockDiscontinuityCount);
                bsax.mo70118b(2, bsax2);
                Iterator<GnssMeasurement> it2 = gnssMeasurementsEvent.getMeasurements().iterator();
                while (it2.hasNext()) {
                    GnssMeasurement next = it2.next();
                    bsax bsax3 = new bsax(bgox.f117108bv);
                    bsax3.mo70134g(i2, next.getSvid());
                    bsax3.mo70134g(i3, next.getConstellationType());
                    bsax3.mo70115b(3, next.getTimeOffsetNanos());
                    bsax3.mo70134g(i4, next.getState());
                    bsax3.mo70117b(5, next.getReceivedSvTimeNanos());
                    bsax3.mo70117b(6, next.getReceivedSvTimeUncertaintyNanos());
                    bsax3.mo70115b(7, next.getCn0DbHz());
                    bsax3.mo70115b(8, next.getPseudorangeRateMetersPerSecond());
                    bsax3.mo70115b(i5, next.getPseudorangeRateUncertaintyMetersPerSecond());
                    if (next.getAccumulatedDeltaRangeState() != 0) {
                        bsax3.mo70134g(10, next.getAccumulatedDeltaRangeState());
                        it = it2;
                        bsax3.mo70115b(11, next.getAccumulatedDeltaRangeMeters());
                        bsax3.mo70115b(12, next.getAccumulatedDeltaRangeUncertaintyMeters());
                    } else {
                        it = it2;
                    }
                    if (next.hasCarrierFrequencyHz()) {
                        bsax3.mo70116b(13, next.getCarrierFrequencyHz());
                    }
                    if (next.hasCarrierCycles()) {
                        bsax3.mo70117b(14, next.getCarrierCycles());
                    }
                    if (next.hasCarrierPhase()) {
                        bsax3.mo70115b(15, next.getCarrierPhase());
                    }
                    if (next.hasCarrierPhaseUncertainty()) {
                        bsax3.mo70115b(16, next.getCarrierPhaseUncertainty());
                    }
                    bsax3.mo70134g(17, next.getMultipathIndicator());
                    if (next.hasSnrInDb()) {
                        bsax3.mo70115b(18, next.getSnrInDb());
                    }
                    bsax.mo70107a(1, bsax3);
                    it2 = it;
                    i5 = 9;
                    i3 = 2;
                    i2 = 1;
                    i4 = 4;
                }
                bsax bsax4 = new bsax(bgox.f117110bx);
                bsax4.mo70134g(1, (int) (j2 - mo61603c()));
                bsax4.mo70118b(3, bsax);
                this.f113656d.mo70107a(19, bsax4);
                m96564d();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo61592a(GnssNavigationMessage gnssNavigationMessage, long j) {
        if (!this.f113664l && gnssNavigationMessage != null) {
            this.f113650I.mo61610a(j);
        }
    }

    /* renamed from: a */
    public final synchronized void mo61593a(GpsStatus gpsStatus, long j) {
        if (!this.f113664l) {
            this.f113650I.mo61610a(j);
            Iterable<GpsSatellite> satellites = gpsStatus.getSatellites();
            bsax bsax = new bsax(bgox.f117106bt);
            bsax.mo70134g(1, (int) (j - mo61603c()));
            for (GpsSatellite gpsSatellite : satellites) {
                bsax bsax2 = new bsax(bgox.f117105bs);
                bsax2.mo70116b(4, gpsSatellite.getAzimuth());
                bsax2.mo70116b(3, gpsSatellite.getElevation());
                bsax2.mo70134g(1, gpsSatellite.getPrn());
                bsax2.mo70116b(2, gpsSatellite.getSnr());
                bsax.mo70107a(2, bsax2);
            }
            this.f113656d.mo70107a(10, bsax);
            m96564d();
        }
    }

    /* renamed from: a */
    public final synchronized void mo61594a(Location location, long j) {
        if (location != null) {
            bsax bsax = new bsax(bgox.f117004X);
            bsax bsax2 = new bsax(bgox.f116995O);
            bsax2.mo70134g(1, ayuo.m84849b(location.getLatitude()));
            bsax2.mo70134g(2, ayuo.m84849b(location.getLongitude()));
            bsax.mo70118b(1, bsax2);
            if (location.hasAccuracy()) {
                bsax.mo70134g(3, (int) location.getAccuracy());
            }
            if (location.hasAltitude()) {
                bsax.mo70134g(10, (int) location.getAltitude());
            }
            if (location.hasBearing()) {
                bsax.mo70134g(13, (int) location.getBearing());
            }
            if (location.hasSpeed()) {
                bsax.mo70116b(16, location.getSpeed());
            }
            bsax.mo70134g(8, 0);
            mo61596a(bsax, j);
        }
    }

    /* renamed from: a */
    public final void mo61595a(bgma bgma, int i, long j) {
        if (!this.f113664l) {
            this.f113650I.mo61610a(j);
            int c = (int) (j - mo61603c());
            bsax bsax = new bsax(bgox.f117076bP);
            bsax.mo70118b(1, bgma.mo61923a());
            bsax.mo70118b(10, bgma.mo61924b());
            bsax.mo70134g(2, 0);
            bsax.mo70134g(5, bgma.mo61926d());
            bsax.mo70134g(8, i);
            bsax.mo70118b(6, bgma.mo61925c());
            bsax.mo70134g(3, bgma.mo61927e());
            bsax.mo70134g(4, bgma.mo61929f());
            String[] g = bgma.mo61930g();
            if (g != null) {
                for (String str : g) {
                    bsax.mo70107a(7, str);
                }
            }
            bsax.mo70134g(9, c);
            this.f113656d.mo70107a(20, bsax);
            m96564d();
        }
    }

    /* renamed from: a */
    public final synchronized void mo61596a(bsax bsax, long j) {
        if (!this.f113664l) {
            this.f113650I.mo61610a(j);
            bsax.mo70117b(6, j - mo61603c());
            this.f113656d.mo70107a(8, bsax);
            m96564d();
        }
    }

    /* renamed from: a */
    public final synchronized void mo61597a(List list, List list2, long j) {
        bfnz bfnz;
        long j2 = j;
        synchronized (this) {
            if (!this.f113664l && !list.isEmpty()) {
                this.f113650I.mo61610a(j2);
                bsax bsax = new bsax(bgox.f116994N);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ScanResult scanResult = (ScanResult) it.next();
                    long a = bupz.m120219a(scanResult.BSSID);
                    if (a != -1) {
                        bsax a2 = bfny.m97385a(Long.valueOf(a));
                        a2.mo70134g(9, scanResult.level);
                        bfny.m97386a(a2, scanResult.frequency);
                        String str = scanResult.BSSID;
                        bsax bsax2 = null;
                        if (list2 != null) {
                            long a3 = bupz.m120219a(str);
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                bfnz = (bfnz) it2.next();
                                if (a3 == bfnz.f114529a) {
                                    break;
                                }
                            }
                        }
                        bfnz = null;
                        if (bfnz != null) {
                            bsax bsax3 = new bsax(bgox.f116992L);
                            if (bfnz.f114530b == 0 && bfnz.f114529a != -1) {
                                bsax3.mo70134g(1, bfnz.f114535g);
                                bsax3.mo70117b(2, bfnz.f114529a);
                                bsax3.mo70117b(3, (System.currentTimeMillis() * 1000) + bfnz.f114531c);
                                bsax3.mo70134g(7, bfnz.f114533e);
                                bsax3.mo70134g(8, bfnz.f114534f);
                                bsax3.mo70134g(10, bfnz.f114532d);
                                bsax3.mo70134g(13, bfnz.f114536h);
                                bsax3.mo70134g(14, bfnz.f114537i);
                                bsax2 = bsax3;
                            }
                            a2.mo70107a(19, bsax2);
                        }
                        bsax.mo70107a(2, a2);
                    }
                }
                bsax.mo70117b(1, j2 - mo61603c());
                this.f113656d.mo70107a(7, bsax);
                m96564d();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo61598a(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, long j) {
        if (!this.f113664l) {
            this.f113650I.mo61610a(j);
            bsax bsax = new bsax(bgox.f117072bL, 6);
            for (double d : dArr) {
                bsax.mo70103a(1, d);
            }
            for (double d2 : dArr2) {
                bsax.mo70103a(2, d2);
            }
            for (double d3 : dArr3) {
                bsax.mo70103a(3, d3);
            }
            for (double d4 : dArr4) {
                bsax.mo70103a(4, d4);
            }
            for (double d5 : dArr5) {
                bsax.mo70103a(5, d5);
            }
            bsax.mo70134g(6, (int) (j - mo61603c()));
            this.f113656d.mo70107a(15, bsax);
            m96564d();
        }
    }

    /* renamed from: a */
    public final void mo61599a(float[] fArr, long j, int i) {
        boolean z;
        bmxy.m108581a(this.f113668p);
        bmxy.m108588a(this.f113668p.mo70135h(5));
        bmxy.m108588a(this.f113668p.mo70135h(4));
        int length = fArr.length;
        if (length % i == 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        if (!this.f113664l) {
            if (!this.f113667o.mo70135h(12)) {
                this.f113667o.mo70118b(12, this.f113668p);
            }
            this.f113650I.mo61610a(j);
            bsax bsax = new bsax(bgox.f117073bM);
            int i2 = length / i;
            for (int i3 = 0; i3 < i; i3++) {
                bsax bsax2 = new bsax(bgox.f117074bN);
                for (int i4 = 0; i4 < i2; i4++) {
                    bsax2.mo70104a(1, fArr[(i * i4) + i3]);
                }
                bsax.mo70107a(1, bsax2);
            }
            bsax.mo70105a(2, (int) (j - mo61603c()));
            this.f113656d.mo70107a(24, bsax);
            m96564d();
        }
    }
}
