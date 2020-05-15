package p000;

/* renamed from: bnws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnws {
    /* renamed from: a */
    public static int m110684a(bnwk bnwk, bnwk bnwk2, bnwk bnwk3) {
        double d;
        double d2;
        int i;
        bnwk bnwk4 = bnwk;
        bnwk bnwk5 = bnwk2;
        bnwk bnwk6 = bnwk3;
        int i2 = 0;
        if (bnwk.mo68662c(bnwk2) || bnwk2.mo68662c(bnwk3) || bnwk6.mo68662c(bnwk4)) {
            return 0;
        }
        bnwk b = bnwk.m110666b(bnwk5, bnwk4);
        bnwk b2 = bnwk.m110666b(bnwk6, bnwk5);
        bnwk b3 = bnwk.m110666b(bnwk4, bnwk6);
        double b4 = b.mo68660b();
        double b5 = b2.mo68660b();
        double b6 = b3.mo68660b();
        double d3 = bnvr.f132240c * 3.2321d;
        if (b4 >= b5 && b4 >= b6) {
            d2 = -bnwk.m110661a(bnwk6, b3, b2);
            d = d3 * Math.sqrt(b6 * b5);
        } else if (b5 < b6) {
            d2 = -bnwk.m110661a(bnwk5, b2, b);
            d = d3 * Math.sqrt(b5 * b4);
        } else {
            d2 = -bnwk.m110661a(bnwk4, b, b3);
            d = d3 * Math.sqrt(b4 * b6);
        }
        int i3 = bnwt.f132324a;
        int i4 = -1;
        int i5 = 1;
        if (d2 <= d) {
            i = d2 >= (-d) ? 0 : -1;
        } else {
            i = 1;
        }
        if (i != 0) {
            return i;
        }
        double[] dArr = bnvm.m110513a(bnwk5.f132307i, bnwk6.f132308j).mo68539b(bnvm.m110513a(bnwk5.f132308j, bnwk6.f132307i)).mo68537a(bnwk4.f132306h).mo68538a(bnvm.m110513a(bnwk5.f132308j, bnwk6.f132306h).mo68539b(bnvm.m110513a(bnwk5.f132306h, bnwk6.f132308j)).mo68537a(bnwk4.f132307i)).mo68538a(bnvm.m110513a(bnwk5.f132306h, bnwk6.f132307i).mo68539b(bnvm.m110513a(bnwk5.f132307i, bnwk6.f132306h)).mo68537a(bnwk4.f132308j)).f132227a;
        double d4 = dArr[dArr.length - 1];
        if (d4 > 0.0d) {
            i2 = 1;
        } else if (d4 < 0.0d) {
            i2 = -1;
        }
        if (i2 != 0) {
            return i2;
        }
        int d5 = bnwk.compareTo(bnwk2);
        if (d5 <= 0) {
            i4 = 1;
        }
        bnwk bnwk7 = d5 > 0 ? bnwk4 : bnwk5;
        if (d5 > 0) {
            bnwk4 = bnwk5;
        }
        if (bnwk7.compareTo(bnwk6) > 0) {
            i4 = -i4;
        } else {
            bnwk7 = bnwk6;
            bnwk6 = bnwk7;
        }
        if (bnwk4.compareTo(bnwk6) > 0) {
            i4 = -i4;
            bnwk6 = bnwk4;
            bnwk4 = bnwk6;
        }
        if (!bnwk4.mo68662c(bnwk4) || !bnwk6.mo68662c(bnwk6) || !bnwk7.mo68662c(bnwk7)) {
            return -i4;
        }
        bnvc a = bnwt.m110686a(bnwk4);
        bnvc a2 = bnwt.m110686a(bnwk6);
        bnvc a3 = bnwt.m110686a(bnwk7);
        bnvc bnvc = new bnvc(a2.f132216b.multiply(a3.f132217c).subtract(a2.f132217c.multiply(a3.f132216b)), a2.f132217c.multiply(a3.f132215a).subtract(a2.f132215a.multiply(a3.f132217c)), a2.f132215a.multiply(a3.f132216b).subtract(a2.f132216b.multiply(a3.f132215a)));
        int signum = bnvc.f132215a.multiply(a.f132215a).add(bnvc.f132216b.multiply(a.f132216b)).add(bnvc.f132217c.multiply(a.f132217c)).signum();
        if (signum != 0) {
            return i4 * signum;
        }
        int signum2 = bnvc.f132217c.signum();
        if (signum2 == 0 && (signum2 = bnvc.f132216b.signum()) == 0) {
            int signum3 = bnvc.f132215a.signum();
            if (signum3 == 0 && (signum3 = a3.f132215a.multiply(a.f132216b).subtract(a3.f132216b.multiply(a.f132215a)).signum()) == 0 && (signum3 = a3.f132215a.signum()) == 0 && (signum3 = -a3.f132216b.signum()) == 0 && (signum3 = a3.f132217c.multiply(a.f132215a).subtract(a3.f132215a.multiply(a.f132217c)).signum()) == 0) {
                int signum4 = a3.f132217c.signum();
                if (signum4 == 0 && (signum4 = a.f132215a.multiply(a2.f132216b).subtract(a.f132216b.multiply(a2.f132215a)).signum()) == 0 && (signum4 = -a2.f132215a.signum()) == 0) {
                    int signum5 = a2.f132216b.signum();
                    if (signum5 == 0) {
                        int signum6 = a.f132215a.signum();
                        if (signum6 != 0) {
                            i5 = signum6;
                        }
                    } else {
                        i5 = signum5;
                    }
                } else {
                    i5 = signum4;
                }
            } else {
                i5 = signum3;
            }
        } else {
            i5 = signum2;
        }
        return i4 * i5;
    }
}
