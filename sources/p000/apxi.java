package p000;

import android.content.Intent;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;

/* renamed from: apxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apxi implements apxa {

    /* renamed from: a */
    final /* synthetic */ Intent f85062a;

    /* renamed from: b */
    final /* synthetic */ VerifyAppsSettingsChimeraActivity f85063b;

    public apxi(VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity, Intent intent) {
        this.f85063b = verifyAppsSettingsChimeraActivity;
        this.f85062a = intent;
    }

    /* renamed from: a */
    public final void mo47677a() {
        this.f85063b.f107545q.mo47665a(4, 3);
        this.f85063b.startActivity(this.f85062a);
    }
}
