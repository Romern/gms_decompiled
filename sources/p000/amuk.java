package p000;

import android.accounts.Account;
import java.util.HashMap;
import java.util.Map;

/* renamed from: amuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amuk {

    /* renamed from: a */
    public final Map f75951a = new HashMap();

    /* renamed from: b */
    private final rjx f75952b;

    public amuk(rjx rjx) {
        this.f75952b = rjx;
    }

    /* renamed from: a */
    public final C0034at mo41353a(Account account) {
        C0034at atVar = (C0034at) this.f75951a.get(account);
        if (atVar != null) {
            return atVar;
        }
        C0034at atVar2 = new C0034at();
        this.f75951a.put(account, atVar2);
        if (!cfus.f185744a.mo6606a().mo82771k()) {
            atVar2.mo2450b(amup.m63318b(account.name));
        } else {
            this.f75952b.mo24710a((alkx) null).mo9458a(new amuj(this, atVar2, account));
        }
        return atVar2;
    }
}
