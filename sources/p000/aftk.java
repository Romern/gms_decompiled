package p000;

import android.accounts.Account;

/* renamed from: aftk */
final /* synthetic */ class aftk implements bqeh {

    /* renamed from: a */
    private final afto f64717a;

    public aftk(afto afto) {
        this.f64717a = afto;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        String str;
        afto afto = this.f64717a;
        bbjt bbjt = (bbjt) obj;
        btdb btdb = bbjt.f102787b;
        if (btdb == null) {
            btdb = btdb.f148370b;
        }
        bley a = bbmo.m88189a(btdb);
        if (a != null) {
            str = a.f126309e;
        } else {
            str = "";
        }
        bbkk bbkk = afto.f64722b;
        Account account = afto.f64721a;
        bbkb bbkb = (bbkb) bbkk;
        bavw bavw = bbkb.f102800a;
        baut e = bauu.m87583e();
        e.mo55989a(true);
        return bqdx.m112673a(bqdx.m112674a(bbkb.m88116a(bavw.mo55995a(e.mo55988a()), "File group search failed"), new bbju(bbkb, account, str), bqfb.INSTANCE), new aftn(bbjt), bqfb.INSTANCE);
    }
}
