package p000;

import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: aziz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aziz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ azja f99507a;

    public aziz(azja azja) {
        this.f99507a = azja;
    }

    public final void run() {
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = this.f99507a.f99508a;
        if (!matchstickSettingsChimeraActivity.f111160y) {
            matchstickSettingsChimeraActivity.f111135F = true;
            this.f99507a.f99508a.f111151p = true;
            this.f99507a.f99508a.recreate();
        }
    }
}
