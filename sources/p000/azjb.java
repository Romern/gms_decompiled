package p000;

import android.app.ProgressDialog;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: azjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azjb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MatchstickSettingsChimeraActivity f99509a;

    public azjb(MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity) {
        this.f99509a = matchstickSettingsChimeraActivity;
    }

    public final void run() {
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = this.f99509a;
        if (!matchstickSettingsChimeraActivity.f111160y) {
            ProgressDialog progressDialog = matchstickSettingsChimeraActivity.f111149n;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f99509a.f111149n.dismiss();
            }
            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity2 = this.f99509a;
            if (!matchstickSettingsChimeraActivity2.f111150o) {
                matchstickSettingsChimeraActivity2.f111135F = true;
                MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity3 = this.f99509a;
                matchstickSettingsChimeraActivity3.mo60396a(matchstickSettingsChimeraActivity3.f111152q);
            }
        }
    }
}
