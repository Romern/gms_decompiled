package p000;

import android.net.Uri;
import android.os.Handler;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: azjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azjr extends adzx {

    /* renamed from: a */
    final /* synthetic */ MatchstickSettingsChimeraActivity f99528a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azjr(MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity, Handler handler) {
        super("matchstick", "AppMetadataUpdatedObserver", handler);
        this.f99528a = matchstickSettingsChimeraActivity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = this.f99528a;
        int i = MatchstickSettingsChimeraActivity.f111130A;
        synchronized (matchstickSettingsChimeraActivity.f111141c) {
            if (this.f99528a.f111161z != null) {
                if (cfec.m138765b() && cffg.m139304b()) {
                    this.f99528a.mo60398g();
                } else {
                    MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity2 = this.f99528a;
                    new azju(matchstickSettingsChimeraActivity2, matchstickSettingsChimeraActivity2.f111161z).start();
                }
            }
        }
    }
}
