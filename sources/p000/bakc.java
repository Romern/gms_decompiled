package p000;

import android.accounts.Account;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: bakc */
final /* synthetic */ class bakc implements Callable {

    /* renamed from: a */
    private final bakd f101104a;

    /* renamed from: b */
    private final Map f101105b;

    public bakc(bakd bakd, Map map) {
        this.f101104a = bakd;
        this.f101105b = map;
    }

    public final Object call() {
        bakd bakd = this.f101104a;
        Map map = this.f101105b;
        synchronized (bakd.f101111f) {
            for (Map.Entry entry : map.entrySet()) {
                bxvd da = byie.f166554c.mo74144da();
                String str = (String) ((bqgg) entry.getKey()).get();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byie byie = (byie) da.f164949b;
                str.getClass();
                byie.f166556a = 2;
                byie.f166557b = str;
                byie byie2 = (byie) da.mo74062i();
                bakd.f101106a.put(byie2, (Account) entry.getValue());
                bakd.f101107b.put((Account) entry.getValue(), byie2);
            }
            bakd.f101112g = null;
        }
        return null;
    }
}
