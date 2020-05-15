package p000;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: azja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azja implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ MatchstickSettingsChimeraActivity f99508a;

    public azja(MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity) {
        this.f99508a = matchstickSettingsChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = this.f99508a;
        matchstickSettingsChimeraActivity.f111149n = ProgressDialog.show(matchstickSettingsChimeraActivity, null, matchstickSettingsChimeraActivity.getResources().getString(C0126R.string.common_connecting));
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity2 = this.f99508a;
        matchstickSettingsChimeraActivity2.f111160y = false;
        matchstickSettingsChimeraActivity2.f111156u.postDelayed(new aziz(this), cfeo.f183719a.mo6606a().mo81072cx());
        SilentRegisterIntentOperation.m94594b(new Intent("com.google.android.gms.matchstick.user_initiated_unregister_action"), this.f99508a.f111154s);
        this.f99508a.f111153r.mo55125a(274);
        this.f99508a.f111148m.dismiss();
    }
}
