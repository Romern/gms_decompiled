package p000;

import android.content.Intent;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: azix */
public final /* synthetic */ class azix implements Runnable {

    /* renamed from: a */
    private final MatchstickSettingsChimeraActivity f99504a;

    public azix(MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity) {
        this.f99504a = matchstickSettingsChimeraActivity;
    }

    public final void run() {
        MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.settings_account_init"), this.f99504a);
    }
}
