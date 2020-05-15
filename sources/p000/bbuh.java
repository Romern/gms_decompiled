package p000;

import java.security.InvalidParameterException;

/* renamed from: bbuh */
final /* synthetic */ class bbuh implements Runnable {

    /* renamed from: a */
    private final bbwq f103422a;

    /* renamed from: b */
    private final bctr f103423b;

    /* renamed from: c */
    private final bcoh f103424c;

    /* renamed from: d */
    private final bqgy f103425d;

    /* renamed from: e */
    private final int f103426e;

    public bbuh(bbwq bbwq, bctr bctr, bcoh bcoh, bqgy bqgy, int i) {
        this.f103422a = bbwq;
        this.f103423b = bctr;
        this.f103424c = bcoh;
        this.f103425d = bqgy;
        this.f103426e = i;
    }

    public final void run() {
        bbwq bbwq = this.f103422a;
        bctr bctr = this.f103423b;
        bcoh bcoh = this.f103424c;
        bqgy bqgy = this.f103425d;
        int i = this.f103426e;
        if (!bctr.mo57366g().equals(bctk.f104864g) || bbwq.mo56473c(bcoh).mo56636a(bctr.mo57359a())) {
            int a = bctr.mo57365f().mo57180a();
            if (a != 0) {
                if (a == 3 && bbwq.f103620r.containsKey(bctr.mo57365f().mo57184b().mo57379a())) {
                    ((bclf) bbwq.f103620r.get(bctr.mo57365f().mo57184b().mo57379a())).mo56977b(bcoh, bctr, bbwq.f103608f);
                }
                bcfx bcfx = bbwq.f103608f;
                bcnr q = bcns.m89409q();
                q.mo57011b(9);
                q.mo57012b(bcoh.mo57058b().mo57074e());
                q.mo57010a(bcoh.mo57059c().mo73781l());
                q.mo57013b(bctr.mo57359a());
                q.mo57008a(bctr.mo57361c());
                q.mo57015d(i);
                bcfx.mo56753a(q.mo57002a());
                bqgy.mo69138b((Object) true);
                return;
            }
            throw null;
        }
        bbos.m88294d("LiMsgController", "Tried to resend unstored message.");
        bqgy.mo69136a((Throwable) new InvalidParameterException());
    }
}
