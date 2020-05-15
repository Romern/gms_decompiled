package p000;

import android.accounts.Account;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajqf */
public final /* synthetic */ class ajqf implements aubw {

    /* renamed from: a */
    private final SettingsChimeraActivity f71141a;

    public ajqf(SettingsChimeraActivity settingsChimeraActivity) {
        this.f71141a = settingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.f71141a;
        Account account = (Account) obj;
        if (account == null) {
            settingsChimeraActivity.f80966e.setText((int) C0126R.string.sharing_settings_button_account_name_not_found_title);
            settingsChimeraActivity.f80967f.setText((int) C0126R.string.sharing_settings_button_account_name_not_found_description);
            settingsChimeraActivity.f80968g.mo60577a((Object) null);
            settingsChimeraActivity.f80965d.setOnClickListener(new ajpu(settingsChimeraActivity));
        } else if (!TextUtils.equals((String) settingsChimeraActivity.f80965d.getTag(), account.name)) {
            settingsChimeraActivity.f80965d.setOnClickListener(new ajpv(settingsChimeraActivity, account));
            settingsChimeraActivity.f80966e.setText((CharSequence) null);
            settingsChimeraActivity.f80967f.setText(account.name);
            settingsChimeraActivity.f80968g.mo60577a((Object) null);
            aucb b = akhu.m59733b(settingsChimeraActivity, account);
            b.mo50373a(new ajpw(settingsChimeraActivity, account));
            b.mo50372a(ajpx.f71133a);
            settingsChimeraActivity.f80965d.setTag(account.name);
        }
    }
}
