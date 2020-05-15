package p000;

import android.accounts.Account;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.util.ArrayList;

/* renamed from: apdv */
final /* synthetic */ class apdv implements auca {

    /* renamed from: a */
    private final apeh f84193a;

    /* renamed from: b */
    private final String f84194b;

    public apdv(apeh apeh, String str) {
        this.f84193a = apeh;
        this.f84194b = str;
    }

    /* renamed from: a */
    public final aucb mo13157a(Object obj) {
        String str;
        int i;
        apeh apeh = this.f84193a;
        String str2 = this.f84194b;
        Account account = (Account) obj;
        if (cgjy.f187097a.mo6606a().mo83924B()) {
            if (account != null) {
                i = !str2.equals(account.name) ? 4 : 3;
            } else {
                i = 5;
            }
            aoyj a = aoyj.m69819a();
            bxvd da = bzeg.f169639g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bzeg) da.f164949b).f169646f = i - 2;
            a.mo46994a((bzeg) da.mo74062i());
        }
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = apeh.f84211a;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        contactsRestoreSettingsChimeraActivity.f107291c.mo47122a(str);
        if (!cgkf.f187143a.mo6606a().mo83971f() && (account == null || !str2.equals(account.name))) {
            return aucu.m76778a((Object) new ArrayList());
        }
        ltz ltz = apeh.f84214e;
        Account account2 = new Account(str2, "com.google");
        roz b = rpa.m34196b();
        b.f43472a = new ltv(account2);
        return ltz.mo24732b(b.mo24977a());
    }
}
