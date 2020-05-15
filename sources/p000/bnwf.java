package p000;

import java.io.Serializable;

/* renamed from: bnwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnwf implements Serializable {

    /* renamed from: a */
    public final bnvj f132276a;

    /* renamed from: b */
    public final bnvp f132277b;

    bnwf() {
        this.f132276a = bnvj.m110496a();
        this.f132277b = bnvp.m110535c();
    }

    /* renamed from: a */
    public abstract bnvj mo68622a();

    /* renamed from: a */
    public final bnwc mo68631a(int i) {
        if (i == 0) {
            return bnwc.m110612a(this.f132276a.f132220a, this.f132277b.f132234a);
        }
        if (i == 1) {
            return bnwc.m110612a(this.f132276a.f132220a, this.f132277b.f132235b);
        }
        if (i != 2) {
            return bnwc.m110612a(this.f132276a.f132221b, this.f132277b.f132234a);
        }
        return bnwc.m110612a(this.f132276a.f132221b, this.f132277b.f132235b);
    }

    /* renamed from: b */
    public abstract bnvp mo68625b();

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            bnwf bnwf = (bnwf) obj;
            if (!mo68622a().equals(bnwf.mo68622a()) || !mo68625b().equals(bnwf.mo68625b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final bnwc mo68634g() {
        return new bnwc(bnvn.m110521a(this.f132276a.f132220a), bnvn.m110521a(this.f132277b.f132234a));
    }

    /* renamed from: h */
    public final bnwc mo68635h() {
        return new bnwc(bnvn.m110521a(this.f132276a.f132221b), bnvn.m110521a(this.f132277b.f132235b));
    }

    public final int hashCode() {
        return ((this.f132276a.hashCode() + 629) * 37) + this.f132277b.hashCode();
    }

    /* renamed from: i */
    public final boolean mo68637i() {
        return this.f132276a.mo68521b();
    }

    /* renamed from: j */
    public final bnwc mo68638j() {
        bnvj bnvj = this.f132276a;
        double d = (bnvj.f132220a + bnvj.f132221b) * 0.5d;
        bnvp bnvp = this.f132277b;
        double d2 = (bnvp.f132234a + bnvp.f132235b) * 0.5d;
        if (bnvp.mo68569g()) {
            if (d2 > 0.0d) {
                d2 -= 1.4292036732051034d;
            } else {
                d2 += 3.141592653589793d;
            }
        }
        return bnwc.m110612a(d, d2);
    }

    public final String toString() {
        String valueOf = String.valueOf(mo68634g());
        String valueOf2 = String.valueOf(mo68635h());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10 + String.valueOf(valueOf2).length());
        sb.append("[Lo=");
        sb.append(valueOf);
        sb.append(", Hi=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    public bnwf(bnvj bnvj, bnvp bnvp) {
        this.f132276a = bnvj;
        this.f132277b = bnvp;
    }

    public bnwf(bnwc bnwc, bnwc bnwc2) {
        this.f132276a = new bnvj(bnwc.mo68614a().f132229b, bnwc2.mo68614a().f132229b);
        this.f132277b = new bnvp(bnwc.mo68616c().f132229b, bnwc2.mo68616c().f132229b);
    }

    /* renamed from: a */
    public final boolean mo68632a(bnwk bnwk) {
        bnwc bnwc = new bnwc(bnwk);
        if (!this.f132276a.mo68518a(bnwc.f132274a)) {
            return false;
        }
        bnvp bnvp = this.f132277b;
        double d = bnwc.f132275b;
        if (d == -3.141592653589793d) {
            d = 3.141592653589793d;
        }
        return bnvp.mo68562a(d);
    }
}
