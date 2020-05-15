package p000;

/* renamed from: dvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvg extends duq {

    /* renamed from: f */
    private long f14184f;

    /* renamed from: g */
    private int f14185g;

    /* renamed from: h */
    private int f14186h;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dvg(bxen bxen) {
        super(dvg.class, bxen, (r0 == 0 ? 1 : r0) - 1, bxcl.SCREEN_FENCE, new int[]{7});
        int a = bxem.m122632a(bxen.f163112b);
        this.f14185g = 1;
        this.f14186h = 1;
        this.f14184f = 0;
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        int i = this.f14185g;
        boolean z = true;
        if (i == 1) {
            return mo9646b();
        }
        int i2 = this.f14075b;
        if (i2 == 1) {
            int a = bxmy.m122885a(((bxen) this.f14076c).f163114d);
            if (a == 0) {
                a = 1;
            }
            if (i != a) {
                z = false;
            }
            return mo9643a(z);
        } else if (i2 == 2) {
            if (!(i == 3 && this.f14186h == 2 && duq.m9408a(j, this.f14184f, mo9703a()))) {
                z = false;
            }
            return mo9644a(z, mo9703a());
        } else if (i2 != 3) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dvg", "a", 97, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[ScreenFenceImpl] Unknown trigger type=%s", this.f14075b);
            return mo9646b();
        } else {
            if (!(i == 2 && this.f14186h == 3 && duq.m9408a(j, this.f14184f, mo9703a()))) {
                z = false;
            }
            return mo9644a(z, mo9703a());
        }
    }

    /* renamed from: a */
    public final long mo9703a() {
        return ((bxen) this.f14076c).f163113c;
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.SCREEN) {
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
                bxvj bxvj = bxmz.f164000d;
                bxcf.mo74135a(bxvj);
                if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                    bxcf bxcf2 = bxce.f162775h;
                    if (bxcf2 == null) {
                        bxcf2 = bxcf.f162779a;
                    }
                    bxvj bxvj2 = bxmz.f164000d;
                    bxcf2.mo74135a(bxvj2);
                    Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                    if (b == null) {
                        b = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b);
                    }
                    bxmz bxmz = (bxmz) b;
                    int a3 = bxmy.m122885a(bxmz.f164003b);
                    int i = 1;
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i2 = this.f14185g;
                    if (a3 != i2) {
                        this.f14186h = i2;
                        int a4 = bxmy.m122885a(bxmz.f164003b);
                        if (a4 != 0) {
                            i = a4;
                        }
                        this.f14185g = i;
                        bxeu bxeu2 = bxce.f162774g;
                        if (bxeu2 == null) {
                            bxeu2 = bxeu.f163125e;
                        }
                        this.f14184f = bxeu2.f163129c;
                        return;
                    }
                    return;
                }
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dvg", "a", 62, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[ScreenFenceImpl] No screen data.");
            }
        }
    }
}
