package p000;

import android.accounts.Account;
import com.google.android.gms.autofill.data.Credential;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: lfh */
final /* synthetic */ class lfh implements bqeg {

    /* renamed from: a */
    private final bnhe f25963a;

    /* renamed from: b */
    private final kcv f25964b;

    public lfh(bnhe bnhe, kcv kcv) {
        this.f25963a = bnhe;
        this.f25964b = kcv;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bnhe bnhe = this.f25963a;
        kcv kcv = this.f25964b;
        srn srn = lfm.f25983a;
        bnrd a = bnhe.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            try {
                bnrd a2 = ((kek) bqga.m112780a((Future) entry.getValue())).f23936a.iterator();
                while (a2.hasNext()) {
                    Object a3 = ((kct) a2.next()).mo14368a();
                    if (a3 instanceof Credential) {
                        Credential credential = (Credential) a3;
                        if (credential.mo7929d() && credential.f11611d.contains(kcv)) {
                            return bqga.m112775a(bmxv.m108566b((Account) entry.getKey()));
                        }
                    }
                }
                continue;
            } catch (ExecutionException e) {
                bnsl bnsl = (bnsl) lfm.f25983a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("lfm", "a", 540, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to retrieve fetch result.");
            }
        }
        return bqga.m112775a(bmvz.f131120a);
    }
}
