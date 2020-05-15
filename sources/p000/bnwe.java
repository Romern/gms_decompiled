package p000;

import java.io.IOException;

/* renamed from: bnwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnwe extends bnwf {
    public bnwe(bnvj bnvj, bnvp bnvp) {
        super(bnvj, bnvp);
    }

    /* renamed from: a */
    static bnwe m110625a(bnvg bnvg) {
        byte a = bnvg.mo68512a();
        if (a == 1) {
            bnwe bnwe = new bnwe(new bnvj(bnvg.mo68514c(), bnvg.mo68514c()), new bnvp(bnvg.mo68514c(), bnvg.mo68514c()));
            if (Math.abs(bnwe.f132276a.f132220a) <= 1.5707963267948966d && Math.abs(bnwe.f132276a.f132221b) <= 1.5707963267948966d) {
                bnvp bnvp = bnwe.f132277b;
                if (Math.abs(bnvp.f132234a) <= 3.141592653589793d && Math.abs(bnvp.f132235b) <= 3.141592653589793d) {
                    double d = bnvp.f132234a;
                    if ((d != -3.141592653589793d || bnvp.f132235b == 3.141592653589793d) && ((bnvp.f132235b != -3.141592653589793d || d == 3.141592653589793d) && bnwe.f132276a.mo68521b() == bnwe.f132277b.mo68568f())) {
                        return bnwe;
                    }
                }
            }
            throw new IOException("Decoded S2LatLngRect is invalid.");
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("Unsupported S2LatLngRect encoding version ");
        sb.append((int) a);
        throw new IOException(sb.toString());
    }

    /* renamed from: c */
    public static bnwe m110626c() {
        return new bnwe(bnvj.m110496a(), bnvp.m110535c());
    }

    /* renamed from: d */
    public static bnwe m110627d() {
        return new bnwe(m110628e(), bnvp.m110536d());
    }

    /* renamed from: e */
    public static bnvj m110628e() {
        return new bnvj(-1.5707963267948966d, 1.5707963267948966d);
    }

    /* renamed from: a */
    public final bnvj mo68622a() {
        return this.f132276a;
    }

    /* renamed from: b */
    public final bnvp mo68625b() {
        return this.f132277b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new bnwe(mo68634g(), mo68635h());
    }

    /* renamed from: f */
    public final bnwe mo68630f() {
        bnvj bnvj = this.f132276a;
        return (bnvj.f132220a == -1.5707963267948966d || bnvj.f132221b == 1.5707963267948966d) ? new bnwe(bnvj, bnvp.m110536d()) : this;
    }

    public bnwe(bnwc bnwc, bnwc bnwc2) {
        super(bnwc, bnwc2);
    }

    /* renamed from: a */
    public final bnwe mo68628a(bnwc bnwc) {
        bnvj c = this.f132276a.mo68522c(bnwc.mo68614a().f132229b);
        bnvj e = m110628e();
        bnvj bnvj = new bnvj(Math.max(c.f132220a, e.f132220a), Math.min(c.f132221b, e.f132221b));
        bnvp bnvp = this.f132277b;
        double d = bnwc.mo68616c().f132229b;
        bnvp bnvp2 = new bnvp(bnvp);
        if (d >= 0.0d) {
            if (!bnvp2.mo68568f()) {
                double h = bnvp2.mo68570h();
                double d2 = bnvr.f132240c;
                if (h + d + d + d2 + d2 >= 6.283185307179586d) {
                    bnvp2.mo68564b();
                }
            }
            return new bnwe(bnvj, bnvp2);
        }
        if (!bnvp2.mo68566e()) {
            double h2 = bnvp2.mo68570h();
            double d3 = bnvr.f132240c;
            if ((h2 + (d + d)) - (d3 + d3) <= 0.0d) {
                bnvp2.mo68559a();
            }
        }
        return new bnwe(bnvj, bnvp2);
        bnvp2.mo68561a(bnvh.m110493b(bnvp2.f132234a - d), bnvh.m110493b(bnvp2.f132235b + d), false);
        if (bnvp2.f132234a <= -3.141592653589793d) {
            bnvp2.f132234a = 3.141592653589793d;
        }
        return new bnwe(bnvj, bnvp2);
    }
}
