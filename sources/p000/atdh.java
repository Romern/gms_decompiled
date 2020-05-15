package p000;

/* renamed from: atdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atdh implements atcv {

    /* renamed from: b */
    private static final srn f90117b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    final bxvd f90118a;

    public atdh() {
        this(bycz.f165744e);
    }

    /* renamed from: a */
    private final void m75600a(asqs asqs, boolean z) {
        if (asqs instanceof asqx) {
            asqx asqx = (asqx) asqs;
            if (asqs.mo49390e() != 12 || z) {
                if (cth.m7545a(((bycz) this.f90118a.f164949b).f165747b.mo73780k()).f12022a != 0) {
                    ctq b = cth.m7547b(((bycz) this.f90118a.f164949b).f165747b.mo73780k());
                    if (asqx.f89464a.mo8282c().equals(b.f12035a.mo8282c())) {
                        bxvd bxvd = this.f90118a;
                        bxtx a = bxtx.m123261a(b.mo8292a());
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bycz bycz = (bycz) bxvd.f164949b;
                        bycz bycz2 = bycz.f165744e;
                        a.getClass();
                        bycz.f165746a |= 1;
                        bycz.f165747b = a;
                    } else {
                        bnsl bnsl = (bnsl) f90117b.mo68388c();
                        bnsl.mo68432a("atdh", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("updateAfterTap: atc mismatch!");
                    }
                } else {
                    bnsl bnsl2 = (bnsl) f90117b.mo68388c();
                    bnsl2.mo68432a("atdh", "a", 133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("updateAfterTap: no credentials available!");
                    return;
                }
            }
            asqs.mo49387b().f89415k = cth.m7545a(((bycz) this.f90118a.f164949b).f165747b.mo73780k()).f12022a;
        }
    }

    /* renamed from: b */
    public final btjw mo49800b() {
        return btjw.f149188c;
    }

    /* renamed from: d */
    public final atcs mo49802d() {
        ctl a = cth.m7545a(((bycz) this.f90118a.f164949b).f165747b.mo73780k());
        long j = a.f12024c;
        long j2 = ((bycz) this.f90118a.f164949b).f165748c;
        return new atcs(j + j2, a.f12025d + j2);
    }

    /* renamed from: e */
    public final boolean mo49803e() {
        ctl a = cth.m7545a(((bycz) this.f90118a.f164949b).f165747b.mo73780k());
        return a.f12022a <= a.f12023b;
    }

    /* renamed from: f */
    public final boolean mo49804f() {
        return true;
    }

    /* renamed from: g */
    public final int mo49805g() {
        return 840;
    }

    /* renamed from: h */
    public final byte[] mo49806h() {
        return ((bycz) this.f90118a.mo74062i()).mo73642k();
    }

    public atdh(bycz bycz) {
        bxvd bxvd = (bxvd) bycz.mo74142c(5);
        bxvd.mo73625a((bxvk) bycz);
        this.f90118a = bxvd;
    }

    /* renamed from: a */
    public final asqs mo49793a(askf askf, asqq asqq, String str) {
        if (cth.m7545a(((bycz) this.f90118a.f164949b).f165747b.mo73780k()).f12022a == 0) {
            return null;
        }
        ctq b = cth.m7547b(((bycz) this.f90118a.f164949b).f165747b.mo73780k());
        bxvd bxvd = this.f90118a;
        bxtx a = bxtx.m123261a(b.mo8292a());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bycz bycz = (bycz) bxvd.f164949b;
        bycz bycz2 = bycz.f165744e;
        a.getClass();
        bycz.f165746a |= 1;
        bycz.f165747b = a;
        return new asqx(b.f12035a, asqq, str);
    }

    /* renamed from: a */
    public final atcq mo49795a(atcp atcp, askf askf, btiy btiy) {
        if (cth.m7545a(((bycz) this.f90118a.f164949b).f165747b.mo73780k()).f12022a != 0) {
            ctq b = cth.m7547b(((bycz) this.f90118a.f164949b).f165747b.mo73780k());
            ctr a = cth.m7546a(b.f12035a, (int) (Math.abs(atcp.f90083a) % 100000000));
            bxvd bxvd = this.f90118a;
            bxtx a2 = bxtx.m123261a(b.mo8292a());
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bycz bycz = (bycz) bxvd.f164949b;
            bycz bycz2 = bycz.f165744e;
            a2.getClass();
            bycz.f165746a |= 1;
            bycz.f165747b = a2;
            return new atcm(new atct(a.mo8293a(), a.f12037a, a.f12038b, a.f12039c + 2000, null, null));
        }
        throw new atcr();
    }

    /* renamed from: a */
    public final btmd mo49796a() {
        ctl a = cth.m7545a(((bycz) this.f90118a.f164949b).f165747b.mo73780k());
        bxvd da = btmd.f149473c.mo74144da();
        bxvd da2 = btly.f149454b.mo74144da();
        String str = a.f12026e;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        str.getClass();
        ((btly) da2.f164949b).f149456a = str;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btmd btmd = (btmd) da.f164949b;
        btly btly = (btly) da2.mo74062i();
        btly.getClass();
        btmd.f149476b = btly;
        btmd.f149475a = 4;
        return (btmd) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atdh.a(asqs, boolean):void
     arg types: [asqs, int]
     candidates:
      atdh.a(asqs, askf):void
      atcv.a(asqs, askf):void
      atdh.a(asqs, boolean):void */
    /* renamed from: a */
    public final void mo49797a(asqs asqs) {
        m75600a(asqs, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atdh.a(asqs, boolean):void
     arg types: [asqs, int]
     candidates:
      atdh.a(asqs, askf):void
      atcv.a(asqs, askf):void
      atdh.a(asqs, boolean):void */
    /* renamed from: a */
    public final void mo49798a(asqs asqs, askf askf) {
        m75600a(asqs, false);
    }
}
