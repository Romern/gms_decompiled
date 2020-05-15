package p000;

/* renamed from: dvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvb extends duq {

    /* renamed from: f */
    private long f14155f;

    /* renamed from: g */
    private int f14156g;

    /* renamed from: h */
    private int f14157h;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dvb(bxdy bxdy) {
        super(dvb.class, bxdy, (r0 == 0 ? 1 : r0) - 1, bxcl.PHONE_LOCK_FENCE, new int[]{25});
        int a = bxdx.m122614a(bxdy.f163073a);
        this.f14156g = 1;
        this.f14157h = 1;
        this.f14155f = 0;
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        int i = this.f14156g;
        boolean z = true;
        if (i == 1) {
            return mo9646b();
        }
        int i2 = this.f14075b;
        if (i2 == 1) {
            int a = bxmg.m122864a(((bxdy) this.f14076c).f163075c);
            if (a == 0) {
                a = 1;
            }
            if (i != a) {
                z = false;
            }
            return mo9643a(z);
        } else if (i2 == 2) {
            if (!(i == 2 && this.f14157h == 3 && duq.m9408a(j, this.f14155f, mo9694a()))) {
                z = false;
            }
            return mo9644a(z, mo9694a());
        } else if (i2 != 3) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dvb", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[PhoneLockFenceImpl] Unknown trigger type=%s", this.f14075b);
            return mo9646b();
        } else {
            if (!(i == 3 && this.f14157h == 2 && duq.m9408a(j, this.f14155f, mo9694a()))) {
                z = false;
            }
            return mo9644a(z, mo9694a());
        }
    }

    /* renamed from: a */
    public final long mo9694a() {
        return ((bxdy) this.f14076c).f163074b;
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.PHONE_LOCK) {
            bxeu bxeu = bxce.f162774g;
            if (bxeu == null) {
                bxeu = bxeu.f163125e;
            }
            int a2 = bxet.m122640a(bxeu.f163128b);
            if (a2 != 0 && a2 == 2) {
                bxcf bxcf = bxce.f162775h;
                if (bxcf == null) {
                    bxcf = bxcf.f162779a;
                }
                bxvj bxvj = bxmh.f163933d;
                bxcf.mo74135a(bxvj);
                if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                    bxcf bxcf2 = bxce.f162775h;
                    if (bxcf2 == null) {
                        bxcf2 = bxcf.f162779a;
                    }
                    bxvj bxvj2 = bxmh.f163933d;
                    bxcf2.mo74135a(bxvj2);
                    Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                    if (b == null) {
                        b = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b);
                    }
                    bxmh bxmh = (bxmh) b;
                    int a3 = bxmg.m122864a(bxmh.f163936b);
                    int i = 1;
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i2 = this.f14156g;
                    if (a3 != i2) {
                        this.f14157h = i2;
                        int a4 = bxmg.m122864a(bxmh.f163936b);
                        if (a4 != 0) {
                            i = a4;
                        }
                        this.f14156g = i;
                        bxeu bxeu2 = bxce.f162774g;
                        if (bxeu2 == null) {
                            bxeu2 = bxeu.f163125e;
                        }
                        this.f14155f = bxeu2.f163129c;
                        return;
                    }
                    return;
                }
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dvb", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[PhoneLockFenceImpl] No phone lock data.");
            }
        }
    }
}
