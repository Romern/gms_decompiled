package p000;

import android.accounts.Account;
import android.util.Base64;
import java.util.HashSet;
import java.util.List;

/* renamed from: bakl */
final /* synthetic */ class bakl implements bqeh {

    /* renamed from: a */
    private final bakn f101130a;

    /* renamed from: b */
    private final String f101131b;

    public bakl(bakn bakn, String str) {
        this.f101130a = bakn;
        this.f101131b = str;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bngx bngx;
        bqgg bqgg;
        bakn bakn = this.f101130a;
        String str = this.f101131b;
        HashSet hashSet = new HashSet();
        for (baog baog : (List) obj) {
            if (bard.m87434a(baog.mo55817d())) {
                hashSet.add(babm.m86492a(baog.mo55815b(), baog.mo55816c()));
            }
        }
        baki baki = bakn.f101140f;
        try {
            byte[] decode = Base64.decode(str, 0);
            bngs j = bngx.m109377j();
            for (byim byim : ((byin) GeneratedMessageLite.m124014a(byin.f166582b, decode)).f166584a) {
                if (baki.f101126a.equals(byim.f166577b)) {
                    byie byie = (byie) GeneratedMessageLite.m124007a(byie.f166554c, byim.f166578c);
                    bakd bakd = baki.f101127b;
                    int i = byie.f166556a;
                    int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
                    int i3 = i2 - 1;
                    if (i2 != 0) {
                        if (i3 == 0) {
                            String str2 = "";
                            if (i == 1) {
                                str2 = (String) byie.f166557b;
                            }
                            bqgg = bqga.m112775a(new Account(str2, "com.google"));
                        } else if (i3 != 1) {
                            if (i3 == 2) {
                                bqgg = bqga.m112775a((Object) null);
                            } else {
                                throw new AssertionError();
                            }
                        } else if (bakd.f101110e.mo32696r()) {
                            synchronized (bakd.f101111f) {
                                Account account = (Account) bakd.f101106a.get(byie);
                                if (account == null) {
                                    bqgg a = bakd.mo55717a();
                                    bqgg = bqdx.m112673a(a, new bajz(bakd, byie), bakd.f101109d);
                                } else {
                                    bqgg = bqga.m112775a(account);
                                }
                            }
                        } else {
                            bqgg = bqga.m112775a((Object) null);
                        }
                        j.mo67668c(bqdx.m112673a(bqgg, new bakh(byie, byim), baki.f101128c));
                    } else {
                        throw null;
                    }
                }
            }
            bngx = j.mo67664a();
        } catch (bxwf e) {
            bngx = bngx.m109356a(bqga.m112777a((Throwable) e));
        }
        return bqga.m112782b(bngx).mo69216a(new bakm(bakn, bngx, hashSet), bakn.f101139e);
    }
}
