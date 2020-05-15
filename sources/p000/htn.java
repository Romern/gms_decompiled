package p000;

import android.content.DialogInterface;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialsSettingsChimeraActivity;

/* renamed from: htn */
public final /* synthetic */ class htn implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final CredentialsSettingsChimeraActivity f20407a;

    /* renamed from: b */
    private final bngx f20408b;

    public htn(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, bngx bngx) {
        this.f20407a = credentialsSettingsChimeraActivity;
        this.f20408b = bngx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.f20407a;
        bmxv a = qqt.m32666a(credentialsSettingsChimeraActivity, (String) this.f20408b.get(i));
        if (a.mo66813a()) {
            credentialsSettingsChimeraActivity.mo7441a(4, new htj(credentialsSettingsChimeraActivity, a), credentialsSettingsChimeraActivity.getString(C0126R.string.credentials_pref_failed_add_never_save));
        }
    }
}
