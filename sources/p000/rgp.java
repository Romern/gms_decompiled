package p000;

import android.content.Intent;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;
import com.google.android.gms.common.account.AccountTypePickerChimeraActivity;

/* renamed from: rgp */
public final /* synthetic */ class rgp implements C0038ax {

    /* renamed from: a */
    private final AccountPickerChimeraActivity f42936a;

    public rgp(AccountPickerChimeraActivity accountPickerChimeraActivity) {
        this.f42936a = accountPickerChimeraActivity;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        AccountPickerChimeraActivity accountPickerChimeraActivity = this.f42936a;
        aczk aczk = (aczk) obj;
        if (aczk != null) {
            int i = aczk.f61148a;
            Intent intent = null;
            if (i == 1) {
                intent = AccountTypePickerChimeraActivity.m22472a(accountPickerChimeraActivity, accountPickerChimeraActivity.f30083j);
            } else if (i == 2) {
                accountPickerChimeraActivity.mo17689a(4);
                intent = aczk.f61149b;
            } else if (cglu.m146177b() && aczk.f61148a == 3) {
                accountPickerChimeraActivity.mo17689a(1);
                intent = new Intent("android.settings.SYNC_SETTINGS");
                accountPickerChimeraActivity.onBackPressed();
            }
            if (intent != null) {
                accountPickerChimeraActivity.startActivityForResult(intent, aczk.f61148a);
            }
        }
    }
}
