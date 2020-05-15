package p000;

/* renamed from: dvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvf extends duq {

    /* renamed from: f */
    private int f14183f;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dvf(bxek bxek) {
        super(dvf.class, bxek, (r0 == 0 ? 1 : r0) - 1, bxcl.PROXIMITY_DISTANCE_FENCE, new int[]{38});
        int a = bxej.m122629a(bxek.f163106a);
        this.f14183f = 1;
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        int i = this.f14183f;
        boolean z = true;
        if (i == 1) {
            return mo9646b();
        }
        if (this.f14075b != 1) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dvf", "a", 66, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[ProximityDistanceFenceImpl] Unknown trigger type=%s", this.f14075b);
            return mo9646b();
        }
        if (i != 2) {
            z = false;
        }
        return mo9643a(z);
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.PROXIMITY_DISTANCE) {
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
                bxvj bxvj = bxmu.f163985c;
                bxcf.mo74135a(bxvj);
                if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                    bxcf bxcf2 = bxce.f162775h;
                    if (bxcf2 == null) {
                        bxcf2 = bxcf.f162779a;
                    }
                    bxvj bxvj2 = bxmu.f163985c;
                    bxcf2.mo74135a(bxvj2);
                    Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                    if (b == null) {
                        b = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b);
                    }
                    int a3 = bxmt.m122880a(((bxmu) b).f163987a);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    this.f14183f = a3;
                    return;
                }
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dvf", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[ProximityDistanceFenceImpl] No proximity distance data.");
            }
        }
    }
}
