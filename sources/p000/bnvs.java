package p000;

import java.io.Serializable;

/* renamed from: bnvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvs implements Serializable {

    /* renamed from: a */
    private final bnwk f132245a;

    /* renamed from: b */
    private final bnvo f132246b;

    private bnvs(bnwk bnwk, bnvo bnvo) {
        this.f132245a = bnwk;
        this.f132246b = bnvo;
    }

    /* renamed from: a */
    public static bnvs m110553a(bnwk bnwk, bnvo bnvo) {
        return new bnvs(bnwk, bnvo);
    }

    /* renamed from: b */
    public final boolean mo68574b() {
        return bnvo.f132230a.equals(this.f132246b);
    }

    /* renamed from: c */
    public final bnwe mo68575c() {
        boolean z;
        if (mo68573a()) {
            return bnwe.m110626c();
        }
        if (mo68574b()) {
            return bnwe.m110627d();
        }
        bnwc bnwc = new bnwc(this.f132245a);
        double d = this.f132246b.mo68554c().f132229b;
        double[] dArr = new double[2];
        double[] dArr2 = {-3.141592653589793d, 3.141592653589793d};
        double d2 = bnwc.mo68614a().f132229b - d;
        dArr[0] = d2;
        if (d2 <= -1.5707963267948966d) {
            dArr[0] = -1.5707963267948966d;
            z = true;
        } else {
            z = false;
        }
        double d3 = bnwc.mo68614a().f132229b + d;
        dArr[1] = d3;
        if (d3 >= 1.5707963267948966d) {
            dArr[1] = 1.5707963267948966d;
        } else if (!z) {
            double a = bnvo.m110529a(this.f132246b);
            double cos = Math.cos(bnwc.mo68614a().f132229b);
            if (a <= cos) {
                double asin = Math.asin(a / cos);
                dArr2[0] = bnvh.m110493b(bnwc.mo68616c().f132229b - asin);
                dArr2[1] = bnvh.m110493b(bnwc.mo68616c().f132229b + asin);
            }
        }
        return new bnwe(new bnvj(dArr[0], dArr[1]), new bnvp(dArr2[0], dArr2[1]));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bnvs)) {
            return false;
        }
        bnvs bnvs = (bnvs) obj;
        return (this.f132245a.mo68662c(bnvs.f132245a) && this.f132246b.equals(bnvs.f132246b)) || (mo68573a() && bnvs.mo68573a()) || (mo68574b() && bnvs.mo68574b());
    }

    public final int hashCode() {
        if (mo68574b()) {
            return 17;
        }
        if (!mo68573a()) {
            return ((this.f132245a.hashCode() + 629) * 37) + this.f132246b.hashCode();
        }
        return 37;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f132245a);
        String valueOf2 = String.valueOf(this.f132246b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20 + String.valueOf(valueOf2).length());
        sb.append("[Point = ");
        sb.append(valueOf);
        sb.append(" Radius = ");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo68573a() {
        return this.f132246b.mo68552a();
    }
}
