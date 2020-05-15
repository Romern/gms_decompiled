package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialsSettingsChimeraActivity;

/* renamed from: hto */
public final /* synthetic */ class hto implements bmzi {

    /* renamed from: a */
    private final CredentialsSettingsChimeraActivity f20409a;

    /* renamed from: b */
    private final boolean f20410b;

    public hto(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, boolean z) {
        this.f20409a = credentialsSettingsChimeraActivity;
        this.f20410b = z;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.f20409a;
        boolean z = this.f20410b;
        Account account = credentialsSettingsChimeraActivity.f10188i;
        sdo.m34959a(account);
        return adbb.m50100a(credentialsSettingsChimeraActivity.f10184e.mo24732b(new gwd(account, z)));
    }
}
