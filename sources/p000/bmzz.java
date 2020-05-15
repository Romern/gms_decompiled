package p000;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bmzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmzz {

    /* renamed from: a */
    static final bmzi f131280a = bmzn.m108683a(new bmzv());

    /* renamed from: b */
    static final bmzq f131281b = new bmzw();

    /* renamed from: q */
    private static final Logger f131282q = Logger.getLogger(bmzz.class.getName());

    /* renamed from: c */
    boolean f131283c = true;

    /* renamed from: d */
    int f131284d = -1;

    /* renamed from: e */
    long f131285e = -1;

    /* renamed from: f */
    long f131286f = -1;

    /* renamed from: g */
    bncg f131287g;

    /* renamed from: h */
    bnbg f131288h;

    /* renamed from: i */
    bnbg f131289i;

    /* renamed from: j */
    long f131290j = -1;

    /* renamed from: k */
    long f131291k = -1;

    /* renamed from: l */
    bmxh f131292l;

    /* renamed from: m */
    bmxh f131293m;

    /* renamed from: n */
    bnce f131294n;

    /* renamed from: o */
    bmzq f131295o;

    /* renamed from: p */
    final bmzi f131296p = f131280a;

    static {
        new bnad();
    }

    private bmzz() {
    }

    /* renamed from: a */
    public static bmzz m108708a() {
        return new bmzz();
    }

    /* renamed from: f */
    private final void m108709f() {
        boolean z = true;
        if (this.f131287g == null) {
            if (this.f131286f != -1) {
                z = false;
            }
            bmxy.m108601b(z, "maximumWeight requires weigher");
        } else if (this.f131283c) {
            if (this.f131286f == -1) {
                z = false;
            }
            bmxy.m108601b(z, "weigher requires maximumWeight");
        } else if (this.f131286f == -1) {
            f131282q.logp(Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bnbg mo66958b() {
        return (bnbg) bmxu.m108565a(this.f131288h, bnbg.STRONG);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final bnbg mo66961c() {
        return (bnbg) bmxu.m108565a(this.f131289i, bnbg.STRONG);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.b(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.b(int, int):void
      bmxy.b(boolean, java.lang.Object):void */
    /* renamed from: d */
    public final bmzu mo66962d() {
        m108709f();
        bmxy.m108601b(true, (Object) "refreshAfterWrite requires a LoadingCache");
        return new bnbb(new bncb(this, null));
    }

    /* renamed from: e */
    public final void mo66963e() {
        mo66956a(bnbg.WEAK);
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        int i = this.f131284d;
        if (i != -1) {
            a.mo66883a("concurrencyLevel", i);
        }
        long j = this.f131285e;
        if (j != -1) {
            a.mo66884a("maximumSize", j);
        }
        long j2 = this.f131286f;
        if (j2 != -1) {
            a.mo66884a("maximumWeight", j2);
        }
        long j3 = this.f131290j;
        if (j3 != -1) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(j3);
            sb.append("ns");
            a.mo66885a("expireAfterWrite", sb.toString());
        }
        long j4 = this.f131291k;
        if (j4 != -1) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append(j4);
            sb2.append("ns");
            a.mo66885a("expireAfterAccess", sb2.toString());
        }
        bnbg bnbg = this.f131288h;
        if (bnbg != null) {
            a.mo66885a("keyStrength", bmwb.m108442a(bnbg.toString()));
        }
        bnbg bnbg2 = this.f131289i;
        if (bnbg2 != null) {
            a.mo66885a("valueStrength", bmwb.m108442a(bnbg2.toString()));
        }
        if (this.f131292l != null) {
            a.mo66881a("keyEquivalence");
        }
        if (this.f131293m != null) {
            a.mo66881a("valueEquivalence");
        }
        if (this.f131294n != null) {
            a.mo66881a("removalListener");
        }
        return a.toString();
    }

    /* renamed from: a */
    public final bnae mo66951a(bnac bnac) {
        m108709f();
        return new bnba(this, bnac);
    }

    /* renamed from: b */
    public final void mo66959b(long j, TimeUnit timeUnit) {
        boolean z;
        long j2 = this.f131290j;
        boolean z2 = true;
        if (j2 == -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108604b(z, "expireAfterWrite was already set to %s ns", j2);
        if (j < 0) {
            z2 = false;
        }
        bmxy.m108595a(z2, "duration cannot be negative: %s %s", j, timeUnit);
        this.f131290j = timeUnit.toNanos(j);
    }

    /* renamed from: a */
    public final void mo66952a(int i) {
        boolean z;
        int i2 = this.f131284d;
        boolean z2 = true;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108602b(z, "concurrency level was already set to %s", i2);
        if (i <= 0) {
            z2 = false;
        }
        bmxy.m108588a(z2);
        this.f131284d = i;
    }

    /* renamed from: b */
    public final void mo66960b(bnbg bnbg) {
        bnbg bnbg2 = this.f131289i;
        bmxy.m108605b(bnbg2 == null, "Value strength was already set to %s", bnbg2);
        bmxy.m108581a(bnbg);
        this.f131289i = bnbg;
    }

    /* renamed from: a */
    public final void mo66953a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2 = this.f131285e;
        boolean z4 = true;
        if (j2 == -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108604b(z, "maximum size was already set to %s", j2);
        long j3 = this.f131286f;
        if (j3 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108604b(z2, "maximum weight was already set to %s", j3);
        if (this.f131287g == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        bmxy.m108601b(z3, "maximum size can not be combined with weigher");
        if (j < 0) {
            z4 = false;
        }
        bmxy.m108589a(z4, "maximum size must not be negative");
        this.f131285e = j;
    }

    /* renamed from: a */
    public final void mo66954a(long j, TimeUnit timeUnit) {
        boolean z;
        long j2 = this.f131291k;
        boolean z2 = true;
        if (j2 == -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108604b(z, "expireAfterAccess was already set to %s ns", j2);
        if (j < 0) {
            z2 = false;
        }
        bmxy.m108595a(z2, "duration cannot be negative: %s %s", j, timeUnit);
        this.f131291k = timeUnit.toNanos(j);
    }

    /* renamed from: a */
    public final void mo66955a(bmzq bmzq) {
        bmxy.m108600b(this.f131295o == null);
        bmxy.m108581a(bmzq);
        this.f131295o = bmzq;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66956a(bnbg bnbg) {
        bnbg bnbg2 = this.f131288h;
        bmxy.m108605b(bnbg2 == null, "Key strength was already set to %s", bnbg2);
        bmxy.m108581a(bnbg);
        this.f131288h = bnbg;
    }

    /* renamed from: a */
    public final void mo66957a(bnce bnce) {
        boolean z;
        if (this.f131294n == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        bmxy.m108581a(bnce);
        this.f131294n = bnce;
    }
}
