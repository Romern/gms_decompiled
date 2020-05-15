package p000;

/* renamed from: bwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwq extends cao {
    public bwq(cat cat) {
        bwq.class.getSimpleName();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bok mo3486a(bok bok) {
        return new bok(bok.mo3333h());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bol mo3487a(bxm bxm, bok bok) {
        byte[] bArr;
        bua bua = (bua) bxm;
        try {
            if (!bua.f5990l) {
                int i = cbd.f6383a;
                throw new bon("Invalid state - SELECT must be performed", bop.f5263c);
            } else if (!bok.mo3332g()) {
                int i2 = cbd.f6383a;
                throw new bon("Le absent", bop.f5273m);
            } else if (bok.mo3336j() == 256) {
                new Object[1][0] = bok.mo3325a();
                int i3 = cbd.f6383a;
                bty bty = (bty) ((btz) bua.f5984f).mo3578d();
                buq buq = (buq) bua.f5988j;
                bpo c = bpk.m3440c(new byte[]{bok.mo3328d(), bok.mo3329e()});
                try {
                    if (c.equals(bpk.m3440c(bxp.f6000a))) {
                        bArr = ((buq) bua.f5988j).mo3607v().mo3564j().mo3358e();
                    } else if (c.equals(bpk.m3440c(bxs.f6023b))) {
                        bArr = bua.mo3499d().mo3564j().mo3358e();
                    } else {
                        bArr = bxk.m3772a(buq.f5980d, c);
                    }
                    if (bArr == null) {
                        bArr = ((bvd) bty.mo3576c(bvd.f5782a)).mo3619c(c);
                    }
                    if (bArr == null) {
                        bArr = ((bvi) bty.mo3576c(bvi.f5792a)).mo3619c(c);
                    }
                    if (bArr == null) {
                        bArr = bxk.m3772a(bpk.m3439b(((btz) bua.f5984f).f5952f), c);
                    }
                    if (bArr == null) {
                        new Object[1][0] = new byte[]{bok.mo3328d(), bok.mo3329e()};
                        return new bol(new byte[0], bop.f5267g);
                    }
                    new Object[1][0] = new byte[]{bok.mo3328d(), bok.mo3329e()};
                    return new bol(bArr, bop.f5269i);
                } catch (bpd e) {
                    new Object[1][0] = new byte[]{bok.mo3328d(), bok.mo3329e()};
                    return new bol(new byte[0], bop.f5267g);
                }
            } else {
                int i4 = cbd.f6383a;
                throw new bon("Le required and is non-zero", bop.f5273m);
            }
        } catch (bon e2) {
            return new bol(new byte[0], e2.f5257a);
        }
    }
}
