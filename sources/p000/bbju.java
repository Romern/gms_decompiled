package p000;

import android.accounts.Account;

/* renamed from: bbju */
public final /* synthetic */ class bbju implements bqeh {

    /* renamed from: a */
    private final bbkb f102790a;

    /* renamed from: b */
    private final Account f102791b;

    /* renamed from: c */
    private final String f102792c;

    public bbju(bbkb bbkb, Account account, String str) {
        this.f102790a = bbkb;
        this.f102791b = account;
        this.f102792c = str;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbkb bbkb = this.f102790a;
        Account account = this.f102791b;
        String str = this.f102792c;
        bngs j = bngx.m109377j();
        bnre i = ((bngx) obj).listIterator();
        while (i.hasNext()) {
            batr batr = (batr) i.next();
            if (bbkb.m88117a(batr) && bbkb.m88118a(batr, account)) {
                bmxy.m108588a(bbkb.m88117a(batr));
                if (!batr.f101721b.substring(17).equals(str)) {
                    j.mo67668c(bbkb.f102800a.mo55996a(bbkb.m88119b(batr)));
                }
            }
        }
        return bqdx.m112674a(bqga.m112787d(j.mo67664a()), bbjz.f102798a, bqfb.INSTANCE);
    }
}
