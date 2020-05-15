package p000;

import java.util.List;

/* renamed from: asqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asqx implements asqs {

    /* renamed from: b */
    private static final srn f89463b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final ctn f89464a;

    /* renamed from: c */
    private final ctg f89465c;

    /* renamed from: d */
    private final asqq f89466d;

    /* renamed from: e */
    private final asqu f89467e;

    /* renamed from: f */
    private final String f89468f;

    /* renamed from: g */
    private int f89469g = 12;

    public asqx(ctn ctn, asqq asqq, String str) {
        this.f89464a = ctn;
        this.f89465c = cth.m7544a(ctn);
        this.f89466d = asqq;
        this.f89467e = new asqu();
        this.f89468f = str;
        bnsl a = f89463b.mo26019b(aske.m74275a());
        a.mo68432a("asqx", "<init>", 49, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68405a("Start transaction");
        this.f89465c.mo8257a();
    }

    /* renamed from: a */
    public final astf mo49385a(byte[] bArr) {
        this.f89469g = 0;
        astf a = astf.m74755a(this.f89465c.mo8258a(bArr));
        if (bqct.m112601a(bArr) == 164) {
            if (astc.m74747a(aste.m74751a(bArr).mo49457b()).mo49454a(astc.f89637g)) {
                this.f89467e.f89416l = bozu.DISCOVER_ZIP;
            } else {
                this.f89467e.f89416l = bozu.DISCOVER_DPAS;
            }
        }
        return a;
    }

    /* renamed from: b */
    public final asqu mo49387b() {
        return this.f89467e;
    }

    /* renamed from: c */
    public final void mo49388c() {
        bnsl a = f89463b.mo26019b(aske.m74275a());
        a.mo68432a("asqx", "c", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68405a("End transaction");
        boolean b = this.f89465c.mo8259b();
        if (this.f89469g != 12) {
            this.f89469g = !b ? 0 : -1;
        }
    }

    /* renamed from: d */
    public final List mo49389d() {
        return asso.m74698a(czm.m8028e(this.f89465c.f12012a));
    }

    /* renamed from: e */
    public final int mo49390e() {
        return this.f89469g;
    }

    /* renamed from: f */
    public final asqq mo49391f() {
        return this.f89466d;
    }

    /* renamed from: g */
    public final String mo49392g() {
        return this.f89468f;
    }

    /* renamed from: h */
    public final int mo49393h() {
        return 0;
    }

    /* renamed from: a */
    public final astc[] mo49386a() {
        if (!cgwn.f187872a.mo6606a().mo84630k()) {
            return new astc[]{astc.f89637g, astc.f89638h};
        }
        return new astc[]{astc.f89637g, astc.f89638h, astc.f89639i};
    }
}
