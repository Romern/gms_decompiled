package p000;

/* renamed from: bsdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsdm extends bsdi {

    /* renamed from: c */
    public final bsdy f144180c;

    /* renamed from: d */
    public final bsea f144181d;

    /* renamed from: e */
    public bsbl f144182e;

    public bsdm(bsfy bsfy, bsfj bsfj, bsex bsex, bsex bsex2, double d) {
        super(bsfy);
        this.f144180c = new bsdy(bsfj, bsex);
        this.f144181d = new bsea(bsfj, bsex2, d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* renamed from: a */
    public final void mo70271a(int i, long j, bsbl bsbl) {
        bsfs bsfs;
        double d;
        double d2;
        long j2 = j;
        bsbl bsbl2 = bsbl;
        if (bsbl2 != null && i == this.f144170b) {
            bsfb bsfb = null;
            if (bsbl.mo70190e()) {
                bsdy bsdy = this.f144180c;
                int i2 = bsbl2.f143966b;
                int i3 = bsbl2.f143967c;
                double b = bsgk.m115739b((long) bsbl2.f143968d);
                if (i2 >= -900000000 && i2 <= 900000000 && i3 >= -1800000000 && i3 <= 1800000000) {
                    if (b < 0.1d) {
                        bsfs = null;
                    } else if (!(i2 == 0 && i3 == 0)) {
                        double a = bsgk.m115737a(j);
                        double a2 = bsdy.f144235b.mo70289a(i2, i3, b, a);
                        if (!Double.isNaN(a2)) {
                            bsfs = bsdy.f144234a.mo70507a(1, a, i2, i3, a2);
                        }
                    }
                    if (bsfs != null && (bsbl.mo70194h() || bsbl.mo70199l())) {
                        if (!bsbl.mo70194h()) {
                            d = (double) bsbl2.f143969e;
                        } else {
                            d = Double.NaN;
                        }
                        if (!bsbl.mo70199l()) {
                            double d3 = (double) bsbl2.f143976l;
                            Double.isNaN(d3);
                            d2 = -Math.toRadians(d3 - 0.0498046875d);
                        } else {
                            d2 = Double.NaN;
                        }
                        bsfb = new bsfb(bsfs.f144498d, bsfs, d, d2);
                    }
                }
                bsfs = null;
                if (!bsbl.mo70194h()) {
                }
                if (!bsbl.mo70199l()) {
                }
                bsfb = new bsfb(bsfs.f144498d, bsfs, d, d2);
            } else if (bsbl.mo70192f()) {
                bsea bsea = this.f144181d;
                int i4 = bsbl2.f143966b;
                int i5 = bsbl2.f143967c;
                long j3 = (long) bsbl2.f143968d;
                if (bsea.f144248d != j2) {
                    if (((double) j3) > bsea.f144245a) {
                        bsfs = null;
                    } else if (!(i4 == 0 && i5 == 0)) {
                        double a3 = bsgk.m115737a(j);
                        double a4 = bsea.f144247c.mo70289a(i4, i5, bsgk.m115739b(j3), a3);
                        if (!Double.isNaN(a4)) {
                            bsea.f144248d = j2;
                            bsfs = bsea.f144246b.mo70507a(2, a3, i4, i5, a4);
                        }
                    }
                }
                bsfs = null;
            } else {
                bsfs = null;
            }
            if (bsfb != null) {
                mo70266a(bsfb);
                this.f144182e = bsbl2;
            } else if (bsfs != null) {
                mo70266a(bsfs);
                this.f144182e = bsbl2;
            }
            for (bsgn bsgn : bsgm.f144529a) {
            }
        }
    }
}
