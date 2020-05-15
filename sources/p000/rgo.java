package p000;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;
import java.util.List;

/* renamed from: rgo */
public final /* synthetic */ class rgo implements C0038ax {

    /* renamed from: a */
    private final AccountPickerChimeraActivity f42935a;

    public rgo(AccountPickerChimeraActivity accountPickerChimeraActivity) {
        this.f42935a = accountPickerChimeraActivity;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        Bundle extras;
        String string;
        AccountPickerChimeraActivity accountPickerChimeraActivity = this.f42935a;
        aczk aczk = (aczk) obj;
        if (aczk != null) {
            Intent intent = aczk.f61149b;
            int i = aczk.f61148a;
            if (i == 10) {
                Toast.makeText(accountPickerChimeraActivity, (int) C0126R.string.common_account_restricted_no_accounts, 0).show();
                accountPickerChimeraActivity.mo17689a(2);
                i = 0;
            } else {
                int i2 = -1;
                if (!(i != -1 || intent == null || intent.getExtras() == null || (extras = intent.getExtras()) == null || (string = extras.getString("authAccount")) == null)) {
                    List list = (List) accountPickerChimeraActivity.f30084k.f61156h.mo2448b();
                    if (list != null) {
                        i2 = bnjd.m109601g(list, new rgq(string));
                    }
                    accountPickerChimeraActivity.f30085l = i2;
                    accountPickerChimeraActivity.mo17689a(3);
                    if (accountPickerChimeraActivity.f30083j.f43016c) {
                        sbv.m34874a(accountPickerChimeraActivity, string, accountPickerChimeraActivity.f30078e);
                    }
                }
            }
            if (intent != null) {
                accountPickerChimeraActivity.setResult(i, intent);
            } else {
                accountPickerChimeraActivity.setResult(i);
            }
            accountPickerChimeraActivity.f30086m = false;
            accountPickerChimeraActivity.finish();
        }
    }
}
