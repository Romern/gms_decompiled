package p000;

import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: azjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azjd extends soa {

    /* renamed from: a */
    final /* synthetic */ MatchstickSettingsChimeraActivity.C167712 f99512a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azjd(MatchstickSettingsChimeraActivity.C167712 r1) {
        super(9);
        this.f99512a = r1;
    }

    public final void run() {
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = MatchstickSettingsChimeraActivity.this;
        int i = MatchstickSettingsChimeraActivity.f111130A;
        MatchstickSettingsChimeraActivity.this.f111156u.post(new azjc(this, Long.valueOf(azdl.m85412a(matchstickSettingsChimeraActivity.f111154s).f99088a.getLong("user_unregister_request_status", -1))));
    }
}
