package p000;

import android.database.Cursor;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: azju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azju extends soa {

    /* renamed from: a */
    final /* synthetic */ MatchstickSettingsChimeraActivity f99534a;

    /* renamed from: b */
    public final svf f99535b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azju(MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity, svf svf) {
        super(9);
        this.f99534a = matchstickSettingsChimeraActivity;
        this.f99535b = svf;
    }

    public final void run() {
        Cursor a = azcd.m85251a(this.f99534a.getContentResolver(), azcc.f98959a);
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = this.f99534a;
        int i = MatchstickSettingsChimeraActivity.f111130A;
        matchstickSettingsChimeraActivity.f111156u.post(new azjs(this, a));
    }
}
