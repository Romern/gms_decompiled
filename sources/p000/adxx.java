package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* renamed from: adxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adxx extends aaab {

    /* renamed from: a */
    private final rnt f62886a;

    /* renamed from: b */
    private final String f62887b;

    /* renamed from: c */
    private final String f62888c;

    public adxx(rnt rnt, String str, String str2) {
        super(167, "RemoveLanguageSettings");
        this.f62886a = rnt;
        this.f62887b = str;
        this.f62888c = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str = this.f62888c;
        if (str != null) {
            adur a = adur.m51223a(this.f62887b, str);
            adxl.m51314a();
            String str2 = a.f62778a;
            if (str2 == null) {
                String str3 = a.f62779b;
                bmxv a2 = adwg.m51268a();
                if (a2.mo66813a()) {
                    for (Account account : (Account[]) a2.mo66814b()) {
                        adxl.m51324b(account, str3);
                    }
                    adxl.m51319a(Arrays.asList((Account[]) a2.mo66814b()));
                }
            } else {
                String str4 = a.f62779b;
                bmxv a3 = adwg.m51269a(str2);
                if (!a3.mo66813a()) {
                    throw new aaaj(5, str2.length() == 0 ? new String("Account is not available: ") : "Account is not available: ".concat(str2));
                }
                adxl.m51324b((Account) a3.mo66814b(), str4);
                adxl.m51319a(Arrays.asList((Account) a3.mo66814b()));
            }
            this.f62886a.mo11797a(Status.f30107a);
            return;
        }
        this.f62886a.mo11797a(Status.f30109c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f62886a.mo11797a(status);
    }
}
