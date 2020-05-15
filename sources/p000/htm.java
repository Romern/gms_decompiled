package p000;

import android.accounts.Account;
import android.content.DialogInterface;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialsSettingsChimeraActivity;

/* renamed from: htm */
final /* synthetic */ class htm implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final CredentialsSettingsChimeraActivity f20404a;

    /* renamed from: b */
    private final String f20405b;

    /* renamed from: c */
    private final Account f20406c;

    public htm(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, String str, Account account) {
        this.f20404a = credentialsSettingsChimeraActivity;
        this.f20405b = str;
        this.f20406c = account;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.f20404a;
        String str = this.f20405b;
        Account account = this.f20406c;
        bmxv a = qqt.m32666a(credentialsSettingsChimeraActivity, str);
        if (a.mo66813a()) {
            credentialsSettingsChimeraActivity.mo7441a(5, new htk(credentialsSettingsChimeraActivity, account, a), credentialsSettingsChimeraActivity.getString(C0126R.string.credentials_pref_failed_remove_never_save));
        }
    }
}
