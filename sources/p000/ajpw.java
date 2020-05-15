package p000;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;
import com.google.android.gms.nearby.sharing.view.GoogleAccountAvatar;

/* renamed from: ajpw */
final /* synthetic */ class ajpw implements aubw {

    /* renamed from: a */
    private final SettingsChimeraActivity f71131a;

    /* renamed from: b */
    private final Account f71132b;

    public ajpw(SettingsChimeraActivity settingsChimeraActivity, Account account) {
        this.f71131a = settingsChimeraActivity;
        this.f71132b = account;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.f71131a;
        Account account = this.f71132b;
        String a = ((akht) obj).mo39461a();
        settingsChimeraActivity.f80966e.setText(a);
        GoogleAccountAvatar googleAccountAvatar = settingsChimeraActivity.f80968g;
        bddn g = bddo.m90606g();
        g.mo57907a(account.name);
        g.f105375a = a;
        googleAccountAvatar.mo60577a(g.mo57906a());
    }
}
