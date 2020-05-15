package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.Map;

/* renamed from: kva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kva implements cayy {

    /* renamed from: a */
    private final cijl f25150a;

    /* renamed from: b */
    private final cijl f25151b;

    public kva(cijl cijl, cijl cijl2) {
        this.f25150a = cijl;
        this.f25151b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bnhe bnhe;
        Context context = (Context) ((cayz) this.f25150a).f176439a;
        bnhe bnhe2 = (bnhe) this.f25151b.mo6445a();
        if (ccjv.m130166b()) {
            bnha bnha = new bnha();
            bnrd a = bnhe2.entrySet().iterator();
            while (a.hasNext()) {
                Map.Entry entry = (Map.Entry) a.next();
                Account account = (Account) entry.getKey();
                kfe kfe = (kfe) entry.getValue();
                if (kfe == null) {
                    bnha.mo67695b(account, new kbi());
                } else {
                    bnha.mo67695b(account, new kbh(context.getSharedPreferences(String.format("com.google.android.gms.autofill.ACCOUNT_DATA-%s", String.format("account|%s|%s", kux.m18615a(account.type), kux.m18615a(account.name))), 0), kfe, account));
                }
            }
            bnhe = bnha.mo67618b();
        } else {
            bnhe = bnoj.f131912b;
        }
        cazf.m127593a(bnhe, "Cannot return null from a non-@Nullable @Provides method");
        return bnhe;
    }
}
