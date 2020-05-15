package p000;

import android.accounts.Account;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;

/* renamed from: rhk */
final /* synthetic */ class rhk implements bmxz {

    /* renamed from: a */
    private final Account f42983a;

    public rhk(Account account) {
        this.f42983a = account;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        Account account = this.f42983a;
        sek sek = SimpleDialogAccountPickerChimeraActivity.f30097b;
        return account.name.equals(((aczd) obj).f61129c);
    }
}
