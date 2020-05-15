package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.languageprofile.ClientLanguageSettings;
import java.util.Arrays;

/* renamed from: adxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adxy extends aaab {

    /* renamed from: a */
    private final rnt f62889a;

    /* renamed from: b */
    private final String f62890b;

    /* renamed from: c */
    private final String f62891c;

    /* renamed from: d */
    private final ClientLanguageSettings f62892d;

    public adxy(rnt rnt, String str, String str2, ClientLanguageSettings clientLanguageSettings) {
        super(167, "GetLanguageSettings");
        this.f62889a = rnt;
        this.f62890b = str;
        this.f62891c = str2;
        this.f62892d = clientLanguageSettings;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str = this.f62891c;
        if (str != null) {
            adur a = adur.m51223a(this.f62890b, str);
            ClientLanguageSettings clientLanguageSettings = this.f62892d;
            bsje bsje = (bsje) bsjf.f144784c.mo74144da();
            bsje.mo70628a(clientLanguageSettings.f79264a);
            String str2 = a.f62779b;
            if (bsje.f164950c) {
                bsje.mo74035c();
                bsje.f164950c = false;
            }
            str2.getClass();
            ((bsjf) bsje.f164949b).f144787b = str2;
            int i = Build.VERSION.SDK_INT;
            if (bsje.f164950c) {
                bsje.mo74035c();
                bsje.f164950c = false;
            }
            ((bsjf) bsje.f164949b).f144788d = false;
            bsjf bsjf = (bsjf) bsje.mo74062i();
            adxl.m51314a();
            String str3 = a.f62778a;
            if (str3 == null) {
                bmxv a2 = adwg.m51268a();
                if (a2.mo66813a()) {
                    for (Account account : (Account[]) a2.mo66814b()) {
                        adxl.m51318a(account, bsjf);
                    }
                    adxl.m51319a(Arrays.asList((Account[]) a2.mo66814b()));
                }
            } else {
                bmxv a3 = adwg.m51269a(str3);
                if (!a3.mo66813a()) {
                    throw new aaaj(5, str3.length() == 0 ? new String("Account is not available: ") : "Account is not available: ".concat(str3));
                }
                adxl.m51318a((Account) a3.mo66814b(), bsjf);
                adxl.m51319a(Arrays.asList((Account) a3.mo66814b()));
            }
            this.f62889a.mo11797a(Status.f30107a);
            return;
        }
        this.f62889a.mo11797a(Status.f30109c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f62889a.mo11797a(status);
    }
}
