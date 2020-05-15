package p000;

/* renamed from: baim */
final /* synthetic */ class baim implements bmxj {

    /* renamed from: a */
    private final baio f101005a;

    public baim(baio baio) {
        this.f101005a = baio;
    }

    public final Object apply(Object obj) {
        byhh byhh;
        boolean z;
        boolean z2;
        long j;
        baio baio = this.f101005a;
        badg badg = (badg) obj;
        badq a = badg.mo55641a();
        bain bain = baio.f101008a;
        int d = badg.mo55644d();
        Long c = a.mo55651c();
        Long b = badg.mo55642b();
        int i = d - 1;
        if (d != 0) {
            String str = "null";
            if (i == 0 || i == 1) {
                if (c != null) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108589a(z, "Absolute timestamp must be set for Override and TrustedTime modes!");
                bxvd da = byhh.f166447c.mo74144da();
                bxvd da2 = byhf.f166439c.mo74144da();
                long longValue = c.longValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                byhf byhf = (byhf) da2.f164949b;
                byhf.f166441a |= 1;
                byhf.f166442b = longValue;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byhh byhh2 = (byhh) da.f164949b;
                byhf byhf2 = (byhf) da2.mo74062i();
                byhf2.getClass();
                byhh2.f166450b = byhf2;
                byhh2.f166449a = 1;
                byhh = (byhh) da.mo74062i();
            } else if (i == 2) {
                if (c == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bmxy.m108589a(z2, "Absolute timestamp must be unset for ServerPolicyTime mode!");
                bxvd da3 = byhh.f166447c.mo74144da();
                bxuo bxuo = bxuo.f164865a;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                byhh byhh3 = (byhh) da3.f164949b;
                bxuo.getClass();
                byhh3.f166450b = bxuo;
                byhh3.f166449a = 3;
                byhh = (byhh) da3.mo74062i();
            } else if (i != 3) {
                if (d == 1) {
                    str = "OVERRIDE";
                } else if (d == 2) {
                    str = "TRUSTED_TIME";
                } else if (d == 3) {
                    str = "SERVER_POLICY_TIME";
                } else if (d == 4) {
                    str = "BEST_TIME";
                }
                StringBuilder sb = new StringBuilder(str.length() + 28);
                sb.append("Unsupported timestamp mode ");
                sb.append(str);
                sb.append("!");
                throw new AssertionError(sb.toString());
            } else {
                if (b == null) {
                    bain.f101007b++;
                }
                if (b != null) {
                    j = -(bain.f101006a - (b.longValue() * 1000));
                } else {
                    j = -(bain.f101006a + ((long) bain.f101007b));
                }
                bxvd da4 = byhh.f166447c.mo74144da();
                bxvd da5 = byhg.f166443c.mo74144da();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                byhg byhg = (byhg) da5.f164949b;
                byhg.f166445a |= 1;
                byhg.f166446b = j;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                byhh byhh4 = (byhh) da4.f164949b;
                byhg byhg2 = (byhg) da5.mo74062i();
                byhg2.getClass();
                byhh4.f166450b = byhg2;
                byhh4.f166449a = 2;
                byhh = (byhh) da4.mo74062i();
            }
            bxvd da6 = byhi.f166451f.mo74144da();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            byhi byhi = (byhi) da6.f164949b;
            byhh.getClass();
            byhi.f166457e = byhh;
            byhi.f166453a |= 8;
            if (a.mo55650b() != null) {
                bxtx a2 = bxtx.m123261a(a.mo55650b());
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                byhi byhi2 = (byhi) da6.f164949b;
                a2.getClass();
                byhi2.f166453a |= 2;
                byhi2.f166455c = a2;
            }
            if (a.mo55649a() != null) {
                bxtx a3 = bxtx.m123261a(a.mo55649a());
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                byhi byhi3 = (byhi) da6.f164949b;
                a3.getClass();
                byhi3.f166453a |= 4;
                byhi3.f166456d = a3;
            }
            bxvd da7 = bygu.f166382e.mo74144da();
            int c2 = badg.mo55643c();
            int i2 = c2 - 1;
            if (c2 == 0) {
                throw null;
            } else if (i2 != 0) {
                if (c2 == 1) {
                    str = "WRITE";
                }
                StringBuilder sb2 = new StringBuilder(str.length() + 38);
                sb2.append("Unknown local Footprints change type ");
                sb2.append(str);
                sb2.append("!");
                throw new AssertionError(sb2.toString());
            } else {
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bygu bygu = (bygu) da7.f164949b;
                bygu.f166387d = 2;
                bygu.f166384a |= 1;
                byhi byhi4 = (byhi) da6.mo74062i();
                byhi4.getClass();
                bygu.f166386c = byhi4;
                bygu.f166385b = 4;
                return (bygu) da7.mo74062i();
            }
        } else {
            throw null;
        }
    }
}
