package p000;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpv */
final /* synthetic */ class ajpv implements View.OnClickListener {

    /* renamed from: a */
    private final SettingsChimeraActivity f71129a;

    /* renamed from: b */
    private final Account f71130b;

    public ajpv(SettingsChimeraActivity settingsChimeraActivity, Account account) {
        this.f71129a = settingsChimeraActivity;
        this.f71130b = account;
    }

    public void onClick(View view) {
        akhu.m59730a(this.f71130b, this.f71129a);
    }
}
