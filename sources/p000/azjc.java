package p000;

import android.app.ProgressDialog;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: azjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azjc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Long f99510a;

    /* renamed from: b */
    final /* synthetic */ azjd f99511b;

    public azjc(azjd azjd, Long l) {
        this.f99511b = azjd;
        this.f99510a = l;
    }

    public final void run() {
        azjd azjd = this.f99511b;
        Long l = this.f99510a;
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = MatchstickSettingsChimeraActivity.this;
        long longValue = l.longValue();
        int i = MatchstickSettingsChimeraActivity.f111130A;
        if (longValue == 1) {
            ProgressDialog progressDialog = matchstickSettingsChimeraActivity.f111149n;
            if (progressDialog != null && progressDialog.isShowing()) {
                matchstickSettingsChimeraActivity.f111149n.dismiss();
            }
            azpi.m86068a(matchstickSettingsChimeraActivity, matchstickSettingsChimeraActivity.getResources().getString(C0126R.string.register_failed_network));
        } else if (longValue == 2) {
            ProgressDialog progressDialog2 = matchstickSettingsChimeraActivity.f111149n;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                matchstickSettingsChimeraActivity.f111149n.dismiss();
            }
            azpi.m86068a(matchstickSettingsChimeraActivity, matchstickSettingsChimeraActivity.getResources().getString(C0126R.string.common_something_went_wrong));
        } else if (longValue == 3 || longValue == 4) {
            synchronized (matchstickSettingsChimeraActivity.f111141c) {
                matchstickSettingsChimeraActivity.f111143e = false;
                matchstickSettingsChimeraActivity.f111142d = null;
            }
            azpi.m86068a(matchstickSettingsChimeraActivity, matchstickSettingsChimeraActivity.getResources().getString(C0126R.string.unregister_success));
            if (!cfec.m138765b()) {
                matchstickSettingsChimeraActivity.f111151p = true;
                matchstickSettingsChimeraActivity.recreate();
            }
        } else {
            new Object[1][0] = Long.valueOf(longValue);
        }
    }
}
