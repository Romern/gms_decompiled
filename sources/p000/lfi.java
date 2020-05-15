package p000;

import android.accounts.Account;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: lfi */
final /* synthetic */ class lfi implements bqeg {

    /* renamed from: a */
    private final bnhe f25965a;

    public lfi(bnhe bnhe) {
        this.f25965a = bnhe;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bnhe bnhe = this.f25965a;
        srn srn = lfm.f25983a;
        bnrd a = bnhe.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            try {
                bnrd a2 = ((kek) bqga.m112780a((Future) entry.getValue())).f23936a.iterator();
                while (a2.hasNext()) {
                    if (((kct) a2.next()).mo14368a() instanceof kdb) {
                        return bqga.m112775a(bmxv.m108566b((Account) entry.getKey()));
                    }
                }
                continue;
            } catch (ExecutionException e) {
                bnsl bnsl = (bnsl) lfm.f25983a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("lfm", "a", 599, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to retrieve fetch result.");
            }
        }
        return bqga.m112775a(bmvz.f131120a);
    }
}
