package p000;

import android.accounts.Account;
import com.felicanetworks.mfc.C0126R;

/* renamed from: amsj */
final /* synthetic */ class amsj implements C0038ax {

    /* renamed from: a */
    private final amsq f75856a;

    public amsj(amsq amsq) {
        this.f75856a = amsq;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        amsq amsq = this.f75856a;
        bddo bddo = (bddo) obj;
        amsq.f75863a = amup.m63312a(bddo.mo57896b());
        Account account = amsq.f75863a;
        if (account != null) {
            amsq.f75864b.mo41343b(account.name);
            amsq.f75865c.mo60577a(bddo);
            amsq.f75865c.setContentDescription(amsq.getString(C0126R.string.common_account_spinner_a11y_description, amsq.f75863a.name));
            amsq.mo41311a(true);
            amsq.getView().findViewById(C0126R.C0129id.content).setVisibility(0);
        }
    }
}
