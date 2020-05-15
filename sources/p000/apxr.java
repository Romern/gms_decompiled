package p000;

import android.app.PendingIntent;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;

/* renamed from: apxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apxr implements apxa {

    /* renamed from: a */
    final /* synthetic */ PendingIntent f85079a;

    /* renamed from: b */
    final /* synthetic */ boolean f85080b;

    /* renamed from: c */
    final /* synthetic */ apxg f85081c;

    /* renamed from: d */
    final /* synthetic */ apxs f85082d;

    public apxr(apxs apxs, PendingIntent pendingIntent, boolean z, apxg apxg) {
        this.f85082d = apxs;
        this.f85079a = pendingIntent;
        this.f85080b = z;
        this.f85081c = apxg;
    }

    /* renamed from: a */
    public final void mo47677a() {
        try {
            this.f85079a.send();
            if (this.f85080b) {
                VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity = this.f85082d.f85086d;
                int i = VerifyAppsSettingsChimeraActivity.f107531s;
                int i2 = verifyAppsSettingsChimeraActivity.f107540l;
                if (i2 > 0) {
                    verifyAppsSettingsChimeraActivity.f107541m++;
                    verifyAppsSettingsChimeraActivity.f107540l = i2 - 1;
                }
            } else {
                VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity2 = this.f85082d.f85086d;
                int i3 = VerifyAppsSettingsChimeraActivity.f107531s;
                int i4 = verifyAppsSettingsChimeraActivity2.f107541m;
                if (i4 > 0) {
                    verifyAppsSettingsChimeraActivity2.f107541m = i4 - 1;
                }
            }
            this.f85082d.f85087e.mo26153d(this.f85081c);
            this.f85082d.f85086d.mo58937g();
        } catch (PendingIntent.CanceledException e) {
        }
    }
}
