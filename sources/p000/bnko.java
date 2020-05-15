package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bnko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnko {

    /* renamed from: a */
    boolean f131769a;

    /* renamed from: b */
    int f131770b = -1;

    /* renamed from: c */
    int f131771c = -1;

    /* renamed from: d */
    bnle f131772d;

    /* renamed from: e */
    bnle f131773e;

    /* renamed from: f */
    bmxh f131774f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo67937a() {
        int i = this.f131770b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo67939b() {
        int i = this.f131771c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final bnle mo67941c() {
        return (bnle) bmxu.m108565a(this.f131772d, bnle.STRONG);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final bnle mo67942d() {
        return (bnle) bmxu.m108565a(this.f131773e, bnle.STRONG);
    }

    /* renamed from: e */
    public final ConcurrentMap mo67943e() {
        if (!this.f131769a) {
            return new ConcurrentHashMap(mo67937a(), 0.75f, mo67939b());
        }
        if (mo67941c() == bnle.STRONG && mo67942d() == bnle.STRONG) {
            return new bnlw(this, bnlf.f131805a);
        }
        if (mo67941c() == bnle.STRONG && mo67942d() == bnle.WEAK) {
            return new bnlw(this, bnlh.f131807a);
        }
        if (mo67941c() == bnle.WEAK && mo67942d() == bnle.STRONG) {
            return new bnlw(this, bnlm.f131811a);
        }
        if (mo67941c() == bnle.WEAK && mo67942d() == bnle.WEAK) {
            return new bnlw(this, bnlp.f131814a);
        }
        throw new AssertionError();
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        int i = this.f131770b;
        if (i != -1) {
            a.mo66883a("initialCapacity", i);
        }
        int i2 = this.f131771c;
        if (i2 != -1) {
            a.mo66883a("concurrencyLevel", i2);
        }
        bnle bnle = this.f131772d;
        if (bnle != null) {
            a.mo66885a("keyStrength", bmwb.m108442a(bnle.toString()));
        }
        bnle bnle2 = this.f131773e;
        if (bnle2 != null) {
            a.mo66885a("valueStrength", bmwb.m108442a(bnle2.toString()));
        }
        if (this.f131774f != null) {
            a.mo66881a("keyEquivalence");
        }
        return a.toString();
    }

    /* renamed from: a */
    public final void mo67938a(bnle bnle) {
        bnle bnle2 = this.f131772d;
        bmxy.m108605b(bnle2 == null, "Key strength was already set to %s", bnle2);
        bmxy.m108581a(bnle);
        this.f131772d = bnle;
        if (bnle != bnle.STRONG) {
            this.f131769a = true;
        }
    }

    /* renamed from: b */
    public final void mo67940b(bnle bnle) {
        bnle bnle2 = this.f131773e;
        bmxy.m108605b(bnle2 == null, "Value strength was already set to %s", bnle2);
        bmxy.m108581a(bnle);
        this.f131773e = bnle;
        if (bnle != bnle.STRONG) {
            this.f131769a = true;
        }
    }
}
