package p000;

import android.app.ProgressDialog;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: azjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azjg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Long f99516a;

    /* renamed from: b */
    final /* synthetic */ azjh f99517b;

    public azjg(azjh azjh, Long l) {
        this.f99517b = azjh;
        this.f99516a = l;
    }

    public final void run() {
        azjh azjh = this.f99517b;
        Long l = this.f99516a;
        if (l.longValue() != 0) {
            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = MatchstickSettingsChimeraActivity.this;
            int i = MatchstickSettingsChimeraActivity.f111130A;
            ProgressDialog progressDialog = matchstickSettingsChimeraActivity.f111149n;
            if (progressDialog != null && progressDialog.isShowing()) {
                MatchstickSettingsChimeraActivity.this.f111149n.dismiss();
            }
        }
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity2 = MatchstickSettingsChimeraActivity.this;
        int i2 = MatchstickSettingsChimeraActivity.f111130A;
        if (matchstickSettingsChimeraActivity2.f111150o) {
            return;
        }
        if (l.longValue() == 1) {
            MatchstickSettingsChimeraActivity.this.f111135F = true;
            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity3 = MatchstickSettingsChimeraActivity.this;
            matchstickSettingsChimeraActivity3.mo60396a(matchstickSettingsChimeraActivity3.f111152q);
        } else if (l.longValue() == 2) {
            azoj.m85932b("SettingsActivity", "Check registration failed", new Object[0]);
            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity4 = MatchstickSettingsChimeraActivity.this;
            matchstickSettingsChimeraActivity4.mo60396a(matchstickSettingsChimeraActivity4.f111152q);
        } else if (l.longValue() == 4) {
            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity5 = MatchstickSettingsChimeraActivity.this;
            matchstickSettingsChimeraActivity5.mo60396a(matchstickSettingsChimeraActivity5.f111152q);
        } else if (l.longValue() == 3) {
            synchronized (MatchstickSettingsChimeraActivity.this.f111141c) {
                MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity6 = MatchstickSettingsChimeraActivity.this;
                matchstickSettingsChimeraActivity6.f111143e = false;
                matchstickSettingsChimeraActivity6.f111142d = null;
            }
            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity7 = MatchstickSettingsChimeraActivity.this;
            matchstickSettingsChimeraActivity7.mo60396a(matchstickSettingsChimeraActivity7.f111152q);
        } else {
            new Object[1][0] = l;
        }
    }
}
