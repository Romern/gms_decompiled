package p000;

/* renamed from: dva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dva extends duq {

    /* renamed from: f */
    private int f14154f;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dva(bxdv bxdv) {
        super(dva.class, bxdv, (r0 == 0 ? 1 : r0) - 1, bxcl.PHONE_CALL_FENCE, new int[]{37});
        int a = bxdu.m122611a(bxdv.f163068a);
        this.f14154f = 1;
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        int i = this.f14154f;
        boolean z = true;
        if (i == 1) {
            return mo9646b();
        }
        if (this.f14075b != 1) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dva", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[PhoneCallFenceImpl] Unknown trigger type=%s", this.f14075b);
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
        if (a == bxco.PHONE_CALL) {
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
                bxvj bxvj = bxme.f163927d;
                bxcf.mo74135a(bxvj);
                if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                    bxcf bxcf2 = bxce.f162775h;
                    if (bxcf2 == null) {
                        bxcf2 = bxcf.f162779a;
                    }
                    bxvj bxvj2 = bxme.f163927d;
                    bxcf2.mo74135a(bxvj2);
                    Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                    if (b == null) {
                        b = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b);
                    }
                    int a3 = bxmd.m122861a(((bxme) b).f163930b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    this.f14154f = a3;
                    return;
                }
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dva", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[PhoneCallFenceImpl] No phone call data.");
            }
        }
    }
}
