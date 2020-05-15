package p000;

import android.app.ProgressDialog;
import android.content.Intent;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: aziy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aziy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Boolean f99505a;

    /* renamed from: b */
    final /* synthetic */ azji f99506b;

    public aziy(azji azji, Boolean bool) {
        this.f99506b = azji;
        this.f99505a = bool;
    }

    public final void run() {
        azji azji = this.f99506b;
        if (this.f99505a.booleanValue()) {
            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = azji.f99519a;
            int i = MatchstickSettingsChimeraActivity.f111130A;
            ProgressDialog progressDialog = matchstickSettingsChimeraActivity.f111149n;
            if (progressDialog != null && progressDialog.isShowing()) {
                azji.f99519a.f111149n.dismiss();
            }
            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity2 = azji.f99519a;
            matchstickSettingsChimeraActivity2.mo60396a(matchstickSettingsChimeraActivity2.f111152q);
            return;
        }
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity3 = azji.f99519a;
        int i2 = MatchstickSettingsChimeraActivity.f111130A;
        azox.m85981a();
        SilentRegisterIntentOperation.m94594b(new Intent("com.google.android.gms.matchstick.check_registration_action"), matchstickSettingsChimeraActivity3.f111154s);
        matchstickSettingsChimeraActivity3.f111160y = false;
        matchstickSettingsChimeraActivity3.f111156u.postDelayed(new azjb(matchstickSettingsChimeraActivity3), cfeo.f183719a.mo6606a().mo81004bK());
    }
}
