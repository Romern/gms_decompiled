package p000;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* renamed from: bnbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnbc extends bnfo implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    final bnbg f131334b;

    /* renamed from: c */
    final bnbg f131335c;

    /* renamed from: d */
    final bmxh f131336d;

    /* renamed from: e */
    final bmxh f131337e;

    /* renamed from: f */
    final long f131338f;

    /* renamed from: g */
    final long f131339g;

    /* renamed from: h */
    final long f131340h;

    /* renamed from: i */
    final bncg f131341i;

    /* renamed from: j */
    final int f131342j;

    /* renamed from: k */
    final bnce f131343k;

    /* renamed from: l */
    final bmzq f131344l;

    /* renamed from: m */
    final bnac f131345m;

    /* renamed from: n */
    transient bmzu f131346n;

    public bnbc(bncb bncb) {
        bnbg bnbg = bncb.f131422h;
        bnbg bnbg2 = bncb.f131423i;
        bmxh bmxh = bncb.f131420f;
        bmxh bmxh2 = bncb.f131421g;
        long j = bncb.f131427m;
        long j2 = bncb.f131426l;
        long j3 = bncb.f131424j;
        bncg bncg = bncb.f131425k;
        int i = bncb.f131419e;
        bnce bnce = bncb.f131429o;
        bmzq bmzq = bncb.f131430p;
        bnac bnac = bncb.f131432r;
        this.f131334b = bnbg;
        this.f131335c = bnbg2;
        this.f131336d = bmxh;
        this.f131337e = bmxh2;
        this.f131338f = j;
        this.f131339g = j2;
        this.f131340h = j3;
        this.f131341i = bncg;
        this.f131342j = i;
        this.f131343k = bnce;
        this.f131344l = (bmzq == bmzq.f131275a || bmzq == bmzz.f131281b) ? null : bmzq;
        this.f131345m = bnac;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f131346n = mo67036a().mo66962d();
    }

    private Object readResolve() {
        return this.f131346n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bmzz mo67036a() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        bmzz a = bmzz.m108708a();
        a.mo66956a(this.f131334b);
        a.mo66960b(this.f131335c);
        bmxh bmxh = this.f131336d;
        bmxh bmxh2 = a.f131292l;
        boolean z6 = true;
        if (bmxh2 == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108605b(z, "key equivalence was already set to %s", bmxh2);
        bmxy.m108581a(bmxh);
        a.f131292l = bmxh;
        bmxh bmxh3 = this.f131337e;
        bmxh bmxh4 = a.f131293m;
        if (bmxh4 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108605b(z2, "value equivalence was already set to %s", bmxh4);
        bmxy.m108581a(bmxh3);
        a.f131293m = bmxh3;
        a.mo66952a(this.f131342j);
        a.mo66957a(this.f131343k);
        a.f131283c = false;
        long j = this.f131338f;
        if (j > 0) {
            a.mo66959b(j, TimeUnit.NANOSECONDS);
        }
        long j2 = this.f131339g;
        if (j2 > 0) {
            a.mo66954a(j2, TimeUnit.NANOSECONDS);
        }
        if (this.f131341i == bmzy.INSTANCE) {
            long j3 = this.f131340h;
            if (j3 != -1) {
                a.mo66953a(j3);
            }
        } else {
            bncg bncg = this.f131341i;
            bmxy.m108600b(a.f131287g == null);
            if (a.f131283c) {
                long j4 = a.f131285e;
                if (j4 == -1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                bmxy.m108604b(z5, "weigher can not be combined with maximum size", j4);
            }
            bmxy.m108581a(bncg);
            a.f131287g = bncg;
            long j5 = this.f131340h;
            if (j5 != -1) {
                long j6 = a.f131286f;
                if (j6 == -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bmxy.m108604b(z3, "maximum weight was already set to %s", j6);
                long j7 = a.f131285e;
                if (j7 == -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                bmxy.m108604b(z4, "maximum size was already set to %s", j7);
                a.f131286f = j5;
                if (j5 < 0) {
                    z6 = false;
                }
                bmxy.m108589a(z6, "maximum weight must not be negative");
            }
        }
        bmzq bmzq = this.f131344l;
        if (bmzq != null) {
            a.mo66955a(bmzq);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo9244c() {
        return this.f131346n;
    }
}
