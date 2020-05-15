package p000;

import android.content.Intent;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: azjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azjl extends soa {

    /* renamed from: a */
    final /* synthetic */ MatchstickSettingsChimeraActivity f99522a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azjl(MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity) {
        super(9);
        this.f99522a = matchstickSettingsChimeraActivity;
    }

    public final void run() {
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = this.f99522a;
        int i = MatchstickSettingsChimeraActivity.f111130A;
        if (matchstickSettingsChimeraActivity.f111140b.f99088a.getLong("last_get_blocked_apps_timestamp_ms", 0) + TimeUnit.DAYS.toMillis(cfeo.f183719a.mo6606a().mo80985as()) < System.currentTimeMillis()) {
            MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.SYNC_BLOCKED_APPS"), this.f99522a);
        }
    }
}
