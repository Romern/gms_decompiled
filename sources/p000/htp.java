package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialsSettingsChimeraActivity;

/* renamed from: htp */
public final /* synthetic */ class htp implements bmzi {

    /* renamed from: a */
    private final CredentialsSettingsChimeraActivity f20411a;

    /* renamed from: b */
    private final boolean f20412b;

    public htp(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, boolean z) {
        this.f20411a = credentialsSettingsChimeraActivity;
        this.f20412b = z;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.f20411a;
        boolean z = this.f20412b;
        Account account = credentialsSettingsChimeraActivity.f10188i;
        sdo.m34959a(account);
        return adbb.m50100a(credentialsSettingsChimeraActivity.f10184e.mo24732b(new gvs(account, z)));
    }
}
