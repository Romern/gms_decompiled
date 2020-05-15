package p000;

import android.widget.Toast;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialsSettingsChimeraActivity;

/* renamed from: hty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hty implements bqfp {

    /* renamed from: a */
    final /* synthetic */ String f20423a;

    /* renamed from: b */
    final /* synthetic */ CredentialsSettingsChimeraActivity f20424b;

    public hty(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, String str) {
        this.f20424b = credentialsSettingsChimeraActivity;
        this.f20423a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f20424b.mo7447g();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f20424b.mo7446e();
        this.f20424b.mo7447g();
        Toast.makeText(this.f20424b.getContainerActivity(), this.f20423a, 1).show();
    }
}
