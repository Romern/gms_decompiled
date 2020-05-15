package p000;

/* renamed from: dvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvh extends duq {

    /* renamed from: f */
    private bxkp f14187f = bxkp.UNKNOWN_STATE;

    /* renamed from: g */
    private long f14188g = 0;

    public dvh(bxeo bxeo) {
        super(dvh.class, bxeo, 0, bxcl.SHUSH_STATE_FENCE, new int[]{59});
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        boolean z;
        if (this.f14187f == bxkp.UNKNOWN_STATE) {
            return mo9646b();
        }
        if (this.f14187f == bxkp.IN_SHUSH) {
            z = true;
        } else {
            z = false;
        }
        return mo9643a(z);
    }

    /* renamed from: i */
    public final long mo9655i() {
        return this.f14188g;
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.DND_MODE) {
            long a2 = dwq.m9665i().mo20505a();
            bxeu bxeu = bxce.f162774g;
            if (bxeu == null) {
                bxeu = bxeu.f163125e;
            }
            if (a2 - bxeu.f163129c <= cdid.f180932a.mo6606a().mo77637d()) {
                bxcf bxcf = bxce.f162775h;
                if (bxcf == null) {
                    bxcf = bxcf.f162779a;
                }
                bxvj bxvj = bxkq.f163781e;
                bxcf.mo74135a(bxvj);
                if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                    bxcf bxcf2 = bxce.f162775h;
                    if (bxcf2 == null) {
                        bxcf2 = bxcf.f162779a;
                    }
                    bxvj bxvj2 = bxkq.f163781e;
                    bxcf2.mo74135a(bxvj2);
                    Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                    if (b == null) {
                        b = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b);
                    }
                    bxkq bxkq = (bxkq) b;
                    bxkp bxkp = this.f14187f;
                    bxkp a3 = bxkp.m122811a(bxkq.f163785c);
                    if (a3 == null) {
                        a3 = bxkp.UNKNOWN_STATE;
                    }
                    if (bxkp != a3) {
                        bxeu bxeu2 = bxce.f162774g;
                        if (bxeu2 == null) {
                            bxeu2 = bxeu.f163125e;
                        }
                        this.f14188g = bxeu2.f163129c;
                    }
                    bxkp a4 = bxkp.m122811a(bxkq.f163785c);
                    if (a4 == null) {
                        a4 = bxkp.UNKNOWN_STATE;
                    }
                    this.f14187f = a4;
                    return;
                }
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dvh", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[ShushStateFenceImpl] No DND mode data.");
            }
        }
    }
}
