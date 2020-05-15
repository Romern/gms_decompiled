package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: duz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class duz extends duq {

    /* renamed from: f */
    private int f14145f;

    /* renamed from: g */
    private int f14146g;

    /* renamed from: h */
    private int f14147h;

    /* renamed from: i */
    private int f14148i;

    /* renamed from: j */
    private long f14149j;

    /* renamed from: k */
    private long f14150k;

    /* JADX WARNING: Illegal instructions before constructor call */
    public duz(bxds bxds) {
        super(duz.class, bxds, (r0 == 0 ? 1 : r0) - 1, bxcl.NETWORK_STATE_FENCE, new int[]{27});
        int a = bxdr.m122608a(bxds.f163061b);
        this.f14145f = -1;
        this.f14146g = -1;
        this.f14147h = -1;
        this.f14148i = -1;
        this.f14149j = -1;
        this.f14150k = -1;
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        int i = this.f14145f;
        if (i == -1) {
            return mo9646b();
        }
        boolean z = true;
        switch (this.f14075b) {
            case 1:
                if (i == 0) {
                    z = false;
                }
                return mo9643a(z);
            case 2:
                if (!(i == 1 && this.f14146g == 0 && duq.m9408a(j, this.f14149j, mo9693a()))) {
                    z = false;
                }
                return mo9644a(z, mo9693a());
            case 3:
                if (!(i == 0 && this.f14146g == 1 && duq.m9408a(j, this.f14149j, mo9693a()))) {
                    z = false;
                }
                return mo9644a(z, mo9693a());
            case 4:
                if (this.f14147h != 1) {
                    z = false;
                }
                return mo9643a(z);
            case 5:
                if (!(this.f14147h == 1 && this.f14148i == 0 && duq.m9408a(j, this.f14150k, mo9693a()))) {
                    z = false;
                }
                return mo9644a(z, mo9693a());
            case 6:
                if (!(this.f14147h == 0 && this.f14148i == 1 && duq.m9408a(j, this.f14150k, mo9693a()))) {
                    z = false;
                }
                return mo9644a(z, mo9693a());
            default:
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("duz", "a", 170, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("[NetworkStateFenceImpl] Unknown trigger type: %s", this.f14075b);
                return mo9646b();
        }
    }

    /* renamed from: a */
    public final long mo9693a() {
        return ((bxds) this.f14076c).f163062c;
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.NETWORK_STATE) {
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
                bxvj bxvj = bxmb.f163920e;
                bxcf.mo74135a(bxvj);
                if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                    bxcf bxcf2 = bxce.f162775h;
                    if (bxcf2 == null) {
                        bxcf2 = bxcf.f162779a;
                    }
                    bxvj bxvj2 = bxmb.f163920e;
                    bxcf2.mo74135a(bxvj2);
                    Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                    if (b == null) {
                        b = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b);
                    }
                    bxmb bxmb = (bxmb) b;
                    bxly a3 = bxly.m122852a(bxmb.f163923b);
                    if (a3 == null) {
                        a3 = bxly.UNKNOWN_STATE;
                    }
                    boolean contains = new bxvv(((bxds) this.f14076c).f163063d, bxds.f163056e).contains(a3);
                    int i = this.f14145f;
                    if (contains != i) {
                        this.f14146g = i;
                        this.f14145f = contains ? 1 : 0;
                        bxeu bxeu2 = bxce.f162774g;
                        if (bxeu2 == null) {
                            bxeu2 = bxeu.f163125e;
                        }
                        this.f14149j = bxeu2.f163129c;
                    }
                    bxma a4 = bxma.m122856a(bxmb.f163924c);
                    if (a4 == null) {
                        a4 = bxma.UNKNOWN_METER_TYPE;
                    }
                    boolean contains2 = new bxvv(((bxds) this.f14076c).f163064f, bxds.f163057g).contains(a4);
                    int i2 = this.f14147h;
                    if (contains2 != i2) {
                        this.f14148i = i2;
                        this.f14147h = contains2 ? 1 : 0;
                        bxeu bxeu3 = bxce.f162774g;
                        if (bxeu3 == null) {
                            bxeu3 = bxeu.f163125e;
                        }
                        this.f14150k = bxeu3.f163129c;
                        return;
                    }
                    return;
                }
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("duz", "a", (int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[NetworkStateFenceImpl] No network status data found.");
            }
        }
    }
}
