package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: azjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azjm implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ MatchstickSettingsChimeraActivity f99523a;

    public azjm(MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity) {
        this.f99523a = matchstickSettingsChimeraActivity;
    }

    public void onClick(View view) {
        SilentRegisterIntentOperation.m94594b(new Intent("com.google.android.gms.matchstick.user_initiated_gaia_register_action"), this.f99523a.getApplicationContext());
    }
}
