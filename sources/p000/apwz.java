package p000;

import com.google.android.gms.security.settings.SecuritySettingsChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: apwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apwz extends soa {

    /* renamed from: a */
    final /* synthetic */ SecuritySettingsChimeraActivity f85038a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apwz(SecuritySettingsChimeraActivity securitySettingsChimeraActivity) {
        super(9);
        this.f85038a = securitySettingsChimeraActivity;
    }

    public final void run() {
        apup apup;
        if (new apgy(this.f85038a).mo47205d()) {
            apup = new apus(this.f85038a).mo47632a(false, 5, TimeUnit.SECONDS);
        } else {
            apup = null;
        }
        this.f85038a.runOnUiThread(new apwy(this, apup));
    }
}
