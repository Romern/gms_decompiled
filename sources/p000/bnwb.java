package p000;

import java.util.List;

/* renamed from: bnwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnwb {

    /* renamed from: a */
    public final List f132271a;

    /* renamed from: b */
    public int f132272b;

    /* renamed from: c */
    private final bmxj f132273c;

    protected bnwb(List list) {
        this.f132271a = list;
        this.f132273c = new bnvz(list);
    }

    /* renamed from: a */
    public final bnvt mo68607a() {
        return new bnvt(mo68609b().mo68606a());
    }

    /* renamed from: b */
    public final bnwa mo68609b() {
        return (bnwa) this.f132271a.get(this.f132272b);
    }

    /* renamed from: c */
    public final bnwk mo68610c() {
        bnvt a = mo68607a();
        long i = a.mo68594i();
        int a2 = bnvt.m110558a(i);
        int b = bnvt.m110567b(i);
        int i2 = 2;
        if (a.mo68583c()) {
            i2 = 1;
        } else if ((((((int) a.f132250b) >>> 2) ^ a2) & 1) == 0) {
            i2 = 0;
        }
        long j = (((long) ((a2 + a2) + i2)) << 32) | (((long) (b + b + i2)) & 4294967295L);
        return bnwk.m110665b(bnxi.f132328e.mo68688a(a.mo68579a(), (long) ((int) (j >> 32)), (long) ((int) j)));
    }

    /* renamed from: d */
    public final boolean mo68611d() {
        return this.f132272b == this.f132271a.size();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bnwb)) {
            return false;
        }
        bnwb bnwb = (bnwb) obj;
        return this.f132271a == bnwb.f132271a && this.f132272b == bnwb.f132272b;
    }

    public final int hashCode() {
        return (this.f132272b * 31) + this.f132271a.hashCode();
    }

    /* renamed from: a */
    public final boolean mo68608a(bnwk bnwk) {
        bnvt a = bnvt.m110562a(bnwk);
        this.f132272b = ((Integer) this.f132273c.apply(a)).intValue();
        if (!mo68611d() && mo68607a().mo68588e().mo68582b(a)) {
            return true;
        }
        int i = this.f132272b;
        if (i == 0) {
            return false;
        }
        if (i > 0) {
            this.f132272b = i - 1;
        }
        if (mo68607a().mo68590f().mo68584c(a)) {
            return true;
        }
        return false;
    }
}
