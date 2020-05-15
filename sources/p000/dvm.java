package p000;

/* renamed from: dvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvm extends duq {

    /* renamed from: f */
    private static final int[] f14197f = {1, 2, 3};

    /* renamed from: g */
    private int f14198g;

    /* renamed from: h */
    private int f14199h;

    /* renamed from: i */
    private long f14200i;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dvm(bxfa bxfa) {
        super(dvm.class, bxfa, (r0 == 0 ? 1 : r0) - 1, bxcl.TIME_INTERVAL_FENCE, new int[]{36});
        int a = bxez.m122648a(bxfa.f163158a);
        this.f14199h = -1;
        this.f14198g = -1;
        this.f14200i = -1;
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        int i = this.f14198g;
        if (i == -1) {
            return mo9646b();
        }
        int i2 = this.f14075b;
        boolean z = true;
        if (i2 == 1) {
            if (i == 0) {
                z = false;
            }
            return mo9643a(z);
        } else if (i2 == 2) {
            if (!(i == 1 && this.f14199h == 0 && duq.m9408a(j, this.f14200i, 3000))) {
                z = false;
            }
            return mo9644a(z, 3000);
        } else if (i2 != 3) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dvm", "a", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[TimeIntervalFenceImpl] Unknown time fence type for fence matching = %s", this.f14075b);
            return mo9646b();
        } else {
            if (!(i == 0 && this.f14199h == 1 && duq.m9408a(j, this.f14200i, 3000))) {
                z = false;
            }
            return mo9644a(z, 3000);
        }
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxkg bxkg;
        if (sqc.m35957a(f14197f, this.f14075b)) {
            bxco a = bxco.m122577a(bxce.f162772e);
            if (a == null) {
                a = bxco.UNKNOWN_CONTEXT_NAME;
            }
            if (a == bxco.DAY_ATTRIBUTES) {
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
                    bxvj bxvj = bxkg.f163725d;
                    bxcf.mo74135a(bxvj);
                    if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                        bxcf bxcf2 = bxce.f162775h;
                        if (bxcf2 == null) {
                            bxcf2 = bxcf.f162779a;
                        }
                        bxvj bxvj2 = bxkg.f163725d;
                        bxcf2.mo74135a(bxvj2);
                        Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                        if (b == null) {
                            b = bxvj2.f164956b;
                        } else {
                            bxvj2.mo74139a(b);
                        }
                        bxkg = (bxkg) b;
                    } else {
                        bxkg = null;
                    }
                    if (bxkg == null || bxkg.f163727a.size() == 0) {
                        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                        bnsl.mo68432a("dvm", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("[TimeIntervalFenceImpl] apply(): Invalid dayAttributes record received from contextData.");
                        return;
                    }
                    bxvv bxvv = new bxvv(bxkg.f163727a, bxkg.f163723b);
                    bxkf a3 = bxkf.m122796a(((bxfa) this.f14076c).f163159b);
                    if (a3 == null) {
                        a3 = bxkf.UNKNOWN;
                    }
                    boolean contains = bxvv.contains(a3);
                    Object[] objArr = {Integer.valueOf(contains ? 1 : 0), Integer.valueOf(this.f14198g), Integer.valueOf(this.f14199h)};
                    int i = this.f14198g;
                    if (contains != i) {
                        this.f14199h = i;
                        this.f14198g = contains;
                        bxeu bxeu2 = bxce.f162774g;
                        if (bxeu2 == null) {
                            bxeu2 = bxeu.f163125e;
                        }
                        this.f14200i = bxeu2.f163129c;
                        return;
                    }
                    return;
                }
            }
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68432a("dvm", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bxco a4 = bxco.m122577a(bxce.f162772e);
            if (a4 == null) {
                a4 = bxco.UNKNOWN_CONTEXT_NAME;
            }
            String num = Integer.toString(a4.f162973bD);
            bxeu bxeu3 = bxce.f162774g;
            if (bxeu3 == null) {
                bxeu3 = bxeu.f163125e;
            }
            bnsl2.mo68424a("[TimeIntervalFenceImpl] apply(): Received contextData of type %s with Time %s, returning.", num, bxeu3);
            return;
        }
        bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
        bnsl3.mo68432a("dvm", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68409a("[TimeIntervalFenceImpl] apply(): Invalid trigger type %s for day attributes fence, returning.", this.f14075b);
    }
}
