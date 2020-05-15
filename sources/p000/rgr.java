package p000;

import android.accounts.Account;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;

/* renamed from: rgr */
final /* synthetic */ class rgr implements bmxz {

    /* renamed from: a */
    private final AccountPickerChimeraActivity f42938a;

    public rgr(AccountPickerChimeraActivity accountPickerChimeraActivity) {
        this.f42938a = accountPickerChimeraActivity;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        String str;
        AccountPickerChimeraActivity accountPickerChimeraActivity = this.f42938a;
        aczd aczd = (aczd) obj;
        if (aczd == null || (str = aczd.f61129c) == null) {
            return false;
        }
        Account account = accountPickerChimeraActivity.f30079f;
        return str.equals(account != null ? account.name : "");
    }
}
