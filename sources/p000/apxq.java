package p000;

import android.widget.Toast;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;

/* renamed from: apxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apxq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f85077a;

    /* renamed from: b */
    final /* synthetic */ VerifyAppsSettingsChimeraActivity f85078b;

    public apxq(VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity, int i) {
        this.f85078b = verifyAppsSettingsChimeraActivity;
        this.f85077a = i;
    }

    public final void run() {
        VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity = this.f85078b;
        Toast.makeText(verifyAppsSettingsChimeraActivity, verifyAppsSettingsChimeraActivity.getText(this.f85077a).toString(), 1).show();
    }
}
