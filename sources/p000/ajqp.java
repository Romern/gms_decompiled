package p000;

import android.accounts.Account;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;
import com.google.android.gms.nearby.sharing.view.GoogleAccountAvatar;

/* renamed from: ajqp */
final /* synthetic */ class ajqp implements aubw {

    /* renamed from: a */
    private final SetupChimeraActivity f71159a;

    /* renamed from: b */
    private final Account f71160b;

    public ajqp(SetupChimeraActivity setupChimeraActivity, Account account) {
        this.f71159a = setupChimeraActivity;
        this.f71160b = account;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SetupChimeraActivity setupChimeraActivity = this.f71159a;
        Account account = this.f71160b;
        GoogleAccountAvatar googleAccountAvatar = setupChimeraActivity.f80983n;
        bddn g = bddo.m90606g();
        g.mo57907a(account.name);
        g.f105375a = ((akht) obj).mo39461a();
        googleAccountAvatar.mo60577a(g.mo57906a());
        GoogleAccountAvatar googleAccountAvatar2 = setupChimeraActivity.f80983n;
        String string = setupChimeraActivity.getString(C0126R.string.sharing_setup_toggle_account);
        String str = account.name;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb.append(string);
        sb.append(" ");
        sb.append(str);
        googleAccountAvatar2.setContentDescription(sb.toString());
    }
}
