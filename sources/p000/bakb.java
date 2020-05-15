package p000;

import android.accounts.Account;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: bakb */
final /* synthetic */ class bakb implements bqeh {

    /* renamed from: a */
    private final bakd f101103a;

    public bakb(bakd bakd) {
        this.f101103a = bakd;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgg bqgg;
        bakd bakd = this.f101103a;
        HashMap hashMap = new HashMap();
        for (Account account : (List) obj) {
            try {
                bqgg = bqga.m112775a(gik.m13218f(bakd.f101108c, account.name));
            } catch (gid e) {
                bqgg = bqga.m112777a((Throwable) new badt(e));
            } catch (IOException e2) {
                bqgg = bqga.m112777a((Throwable) e2);
            }
            hashMap.put(bqgg, account);
        }
        return bqga.m112782b(hashMap.keySet()).mo69216a(new bakc(bakd, hashMap), bakd.f101109d);
    }
}
