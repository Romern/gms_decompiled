package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: balz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class balz extends cazu {

    /* renamed from: b */
    private final cazn f101245b;

    /* renamed from: c */
    private final cazn f101246c;

    public balz(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(balz.class), cijl);
        this.f101245b = cbac.m127643a(cazn);
        this.f101246c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f101245b.mo75201b(), this.f101246c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        Account account = (Account) list.get(0);
        bakd bakd = (bakd) list.get(1);
        if (!bakd.f101110e.mo32696r()) {
            bxvd da = byie.f166554c.mo74144da();
            String str = account.name;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byie byie = (byie) da.f164949b;
            str.getClass();
            byie.f166556a = 1;
            byie.f166557b = str;
            return bqga.m112775a((byie) da.mo74062i());
        }
        synchronized (bakd.f101111f) {
            byie byie2 = (byie) bakd.f101107b.get(account);
            if (byie2 == null) {
                bqgg a = bakd.mo55717a();
                return bqdx.m112673a(a, new baka(bakd, account), bakd.f101109d);
            }
            bqgg a2 = bqga.m112775a(byie2);
            return a2;
        }
    }
}
