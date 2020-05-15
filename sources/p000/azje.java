package p000;

import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: azje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azje implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Boolean f99513a;

    /* renamed from: b */
    final /* synthetic */ azjf f99514b;

    public azje(azjf azjf, Boolean bool) {
        this.f99514b = azjf;
        this.f99513a = bool;
    }

    public final void run() {
        azjf azjf = this.f99514b;
        String valueOf = String.valueOf(this.f99513a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("User Gaia register status changed: onPostExecute: ");
        sb.append(valueOf);
        sb.toString();
        MatchstickSettingsChimeraActivity.this.f111151p = true;
        MatchstickSettingsChimeraActivity.this.recreate();
    }
}
