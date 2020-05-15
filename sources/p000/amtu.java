package p000;

import android.accounts.Account;
import com.felicanetworks.mfc.C0126R;

/* renamed from: amtu */
final /* synthetic */ class amtu implements C0038ax {

    /* renamed from: a */
    private final amub f75923a;

    public amtu(amub amub) {
        this.f75923a = amub;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        amub amub = this.f75923a;
        bddo bddo = (bddo) obj;
        amub.f75930a = amup.m63312a(bddo.mo57896b());
        Account account = amub.f75930a;
        if (account != null) {
            amub.f75931b.mo41343b(account.name);
            amub.f75932c.mo60577a(bddo);
            amub.f75932c.setContentDescription(amub.getString(C0126R.string.common_account_spinner_a11y_description, amub.f75930a.name));
        }
    }
}
